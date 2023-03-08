package examen.e1;

public class Documento {
    private String palabras;
    private int numeroVersionActual;
    private String aliasVersion;

    public Documento() {
        this.palabras = "";
        this.numeroVersionActual = 0;
        this.aliasVersion = "version" + (this.numeroVersionActual + 1);
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    public void imprimirPalabras() {
        System.out.println("Palabras actuales: " + this.palabras);
    }

    public int getNumeroVersionActual() {
        return numeroVersionActual;
    }

    public String getAliasVersion() {
        return aliasVersion;
    }

    public void setNumeroVersionActual(int i) {
        this.numeroVersionActual = i;
    }

    public void setAliasVersion(String s) {
        this.aliasVersion = s;
    }
}
