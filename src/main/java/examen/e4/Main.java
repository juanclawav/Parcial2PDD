package examen.e4;

public class Main {
    public static void main (String [] Args){

        BaseDatos biblio = new BaseDatos();
        Libro l1 = new Libro(3,"A","F");
        Libro l2 = new Libro(2,"B","E");
        Libro l3 = new Libro(1,"C","D");
        Libro l4 = new Libro(6,"F","C");
        Libro l5 = new Libro(5,"D","B");
        Libro l6 = new Libro(4,"E","A");

        biblio.addLibro(l1);
        biblio.addLibro(l2);
        biblio.addLibro(l3);
        biblio.addLibro(l4);
        biblio.addLibro(l5);
        biblio.addLibro(l6);

        biblio.setStrategy(new OrdenarPorCategoria());
        biblio.ordenar();

        biblio.setStrategy(new OrdenarPorTitulo());
        biblio.ordenar();

        biblio.setStrategy(new OrdenarPorID());
        biblio.ordenar();

    }
}

