package examen.e4;

import java.util.*;

public class Biblioteca {
    private List<Libro>libros;
    public void Biblioteca(){
        libros = new ArrayList<>();
    }
    public void addLibro(Libro libro){
        libros.add(libro);
    }
    public void ordenar(Strategy estrategia){
        estrategia.ordenar(libros);
    }
}
public interface Strategy{
    void ordenar(List<Libro>libros);
}
public class Libro{
    private int id;
    private String titulo;
    private String categoria:
    public Libro(int id, String titulo, String categoria){
        this.id=id;
        this.titulo=titulo;
        this.categoria=categoria;
    }
    public int getID(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getCategoria(){
        return categoria;
    }
}
public class OrdenarPorCategoria implements Strategy{
    @Override
    public void ordenar(List<Libro>libros){
        Collections.sort(libros,Comparator.comparing(Libro::getCategoria));
        for (Libro l : libros){
            System.out.println(l.getTitulo()+" "+l.getCategoria()+" "+l.getID());
        }
    }
}
public class OrdenarPorTitulo implements Strategy{
    @Override
    public void ordenar(List<Libro>libros){
        Collections.sort(libros,Comparator.comparing(Libro::getTitulo));
        for (Libro l : libros){
            System.out.println(l.getTitulo()+" "+l.getCategoria()+" "+l.getID());
        }
    }
}
public class OrdenarPorID implements Strategy{
    @Override
    public void ordenar(List<Libro>libros){
        Collections.sort(libros,Comparator.comparing(Libro::getID));
        for (Libro l : libros){
            System.out.println(l.getTitulo()+" "+l.getCategoria()+" "+l.getID());
        }
    }
}
public class Main {
    public static void main (String [] Args{
        Biblioteca biblio = new Biblioteca();
        Libro l1 = new Libro(3,"A","F");
    })
}

