package examen.e4;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private Strategy estrategia;
    private List<Libro> libros;

    public BaseDatos() {
        libros = new ArrayList<Libro>();
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public void setStrategy(Strategy estrategia) {
        this.estrategia = estrategia;
    }

    public void ordenar() {
        estrategia.ordenar(libros);
    }
}
