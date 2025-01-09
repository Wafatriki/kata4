package es.ulpgc.dis.io;

import es.ulpgc.dis.model.Movie;

import java.io.IOException;

public interface MovieWriter extends AutoCloseable {
    void write(Movie movie) throws IOException;
}
