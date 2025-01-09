package es.ulpgc.dis.io;

import es.ulpgc.dis.model.Movie;

import java.io.IOException;

public interface MovieReader extends AutoCloseable {
    Movie read() throws IOException;
}
