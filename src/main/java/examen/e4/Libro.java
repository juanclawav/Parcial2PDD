package examen.e4;

public class Libro {
    private int id;
    private String titulo;
    private String categoria;

    public Libro(int id, String titulo, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public int getID() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }
}
