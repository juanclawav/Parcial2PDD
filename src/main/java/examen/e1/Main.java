package examen.e1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HistorialVersiones historial = new HistorialVersiones();
        Versiones originator = new Versiones();
        Documento documento = new Documento();

        originator.agregarPalabras(documento,"cambio 1",historial);
        originator.agregarPalabras(documento,"cambio 2",historial);
        originator.agregarPalabras(documento,"cambio 3",historial);
        originator.agregarPalabras(documento,"cambio 4",historial);
        documento.imprimirPalabras();

        originator.ctrlZ(documento);
        originator.ctrlZ(documento);
        originator.ctrlZ(documento);
        documento.imprimirPalabras();

        originator.ctrlY(documento);
        originator.ctrlY(documento);
        originator.ctrlY(documento);

        documento.imprimirPalabras();
    }
}

