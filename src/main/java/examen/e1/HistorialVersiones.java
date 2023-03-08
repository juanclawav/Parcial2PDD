package examen.e1;

import java.util.ArrayList;
import java.util.List;

public class HistorialVersiones {
    private static List<Memento> historial = new ArrayList<Memento>();

    public static void agregarMemento(Memento memento) {
        historial.add(memento);
    }

    public static Memento getMemento(int numeroVersion) {
        return historial.get(numeroVersion - 1);
    }
}
