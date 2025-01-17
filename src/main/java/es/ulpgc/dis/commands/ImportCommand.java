package es.ulpgc.dis.commands;


import es.ulpgc.dis.io.*;
import es.ulpgc.dis.model.Movie;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class ImportCommand implements Command{
    public ImportCommand() {
    }

    @Override
    public void execute()  {
        try {
            File input = getInputFile();
            File output = getOutputFile();
            doExecute(input, output);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private File getOutputFile() {
        return new File("movies.db");
    }

    private File getInputFile() {
        return new File("C:\\Users\\wafat\\Desktop\\UNI\\IS2\\title.basics.zip");
        //TODO preguntar al usuario
    }

    private void doExecute(File input, File output) throws Exception {
        try (MovieReader reader = createMovieReader(input);
             MovieWriter writer = createMovieWriter(output)) {
            while (true) {
                Movie movie = reader.read();
                if (movie == null) break;
                writer.write(movie);
            }
        }
    }
    private static DatabaseMovieWriter createMovieWriter(File file) throws SQLException {
        return new DatabaseMovieWriter(deleteIfExists(file));
    }

    private static File deleteIfExists(File file) {
        if (file.exists()) file.delete();
        return file;
    }

    private static FileMovieReader createMovieReader(File file) throws IOException {
        return new FileMovieReader(file, new TsvMovieDeserializer());
    }

}
