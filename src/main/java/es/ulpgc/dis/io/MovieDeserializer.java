package es.ulpgc.dis.io;

import es.ulpgc.dis.model.Movie;

public interface MovieDeserializer {
    Movie deserialize(String line);
}
