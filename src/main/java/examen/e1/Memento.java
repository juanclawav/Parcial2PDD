package examen.e1;

public class Memento {
    private String palabras;
    private int numeroVersion;
    private String aliasVersion;

    public Memento(String palabras, int numeroVersion, String aliasVersion) {
        this.palabras = palabras;
        this.numeroVersion = numeroVersion;
        this.aliasVersion = aliasVersion;
    }

    public String getPalabras() {
        return palabras;
    }

    public int getNumeroVersion() {
        return numeroVersion;
    }

    public String getAliasVersion() {
        return aliasVersion;
    }
}
