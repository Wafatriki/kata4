package es.ulpgc.dis.io;

import es.ulpgc.dis.model.Movie;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileMovieReader implements MovieReader, AutoCloseable {
    private final MovieDeserializer deserializer;
    private final BufferedReader reader;

    public FileMovieReader(File file, MovieDeserializer deserializer) throws IOException {
        this.deserializer = deserializer;
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        ZipEntry entry = zipInputStream.getNextEntry();
        this.reader = new BufferedReader(new InputStreamReader(zipInputStream));
        if (entry != null) {
            this.reader.readLine();
        }
    }


    @Override
    public Movie read() throws IOException {
        return deserialize(reader.readLine());
    }

    private Movie deserialize(String line) {
        return line != null ?
                deserializer.deserialize(line) :
                null;
    }

    @Override
    public void close() throws Exception {
        this.reader.close();
    }
}
