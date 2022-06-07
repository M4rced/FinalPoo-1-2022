package Biblioteca.app;

import Biblioteca.dominio.*;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Athena");

        Libro libro = new Libro(true,"El Hobit",2);
        Revista revista = new Revista(false,"Enter.co",10);
        Tesis tesis = new Tesis(true,"Impacto de los Video Juegos en el Comportamiento Humano",0);
        Historietas historietas = new Historietas(true,"Tin Tin en el Pais del Oro",1);
        Albumes albumes = new Albumes(false,"Primeras Fotografias Colombianas",0);
        Comics comics = new Comics(false,"Thor: Ragnarok",1);

        biblioteca.addRecurso(libro,revista,historietas,comics);
        biblioteca.prestarRecurso(historietas);
        biblioteca.devolverRecurso(libro);
        biblioteca.listarPrestados();
        biblioteca.listarCopiasPorRecurso();

    }
}
