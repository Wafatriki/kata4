package es.ulpgc.dis.io;

import software.ulpgc.kata4.model.Movie;

import java.io.IOException;

public interface MovieWriter extends AutoCloseable {
    void write(Movie movie) throws IOException;
}
