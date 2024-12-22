# Kata4

Este proyecto es una kata de programación que implementa la importación de datos de películas desde un archivo comprimido en formato ZIP a una base de datos SQLite.

## Descripción

El objetivo de esta kata es leer un archivo comprimido en formato ZIP que contiene información sobre películas en formato TSV, deserializar los datos en objetos `Movie`, y luego escribir estos datos en una base de datos SQLite.

## Estructura del Proyecto

El proyecto contiene las siguientes clases:

- `Main`: Clase principal que ejecuta el programa.
- `Command`: Interfaz que define el método `execute`.
- `ImportCommand`: Clase que implementa la interfaz `Command` y maneja la importación de datos de películas.
- `DatabaseMovieWriter`: Clase que escribe datos de películas en una base de datos SQLite.
- `FileMovieReader`: Clase que lee datos de películas desde un archivo comprimido en formato ZIP.
- `MovieDeserializer`: Interfaz para deserializar datos en objetos `Movie`.
- `MovieReader`: Interfaz para leer datos de películas.
- `MovieWriter`: Interfaz para escribir datos de películas.
- `TsvMovieDeserializer`: Clase que implementa la deserialización de datos de películas desde un archivo TSV.
- `Movie`: Clase que representa una película.
