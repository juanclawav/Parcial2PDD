package examen.e4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorID implements Strategy {
    @Override
    public void ordenar(List<Libro> libros) {
        Collections.sort(libros, Comparator.comparing(Libro::getID));
        for (Libro l : libros) {
            System.out.println(l.getTitulo() + " " + l.getCategoria() + " " + l.getID());
        }
    }
}
