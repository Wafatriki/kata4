package es.ulpgc.dis.io;

import software.ulpgc.kata4.model.Movie;

import java.io.IOException;

public interface MovieReader extends AutoCloseable {
    Movie read() throws IOException;
}
