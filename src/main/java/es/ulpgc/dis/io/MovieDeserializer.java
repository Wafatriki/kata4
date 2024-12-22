package es.ulpgc.dis.io;

import software.ulpgc.kata4.model.Movie;

public interface MovieDeserializer {
    Movie deserialize(String line);
}
