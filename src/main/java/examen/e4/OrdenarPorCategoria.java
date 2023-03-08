package examen.e4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorCategoria implements Strategy {
    @Override
    public void ordenar(List<Libro> libros) {
        Collections.sort(libros, Comparator.comparing(Libro::getCategoria));
        for (Libro l : libros) {
            System.out.println(l.getTitulo() + " " + l.getCategoria() + " " + l.getID());
        }
    }
}
