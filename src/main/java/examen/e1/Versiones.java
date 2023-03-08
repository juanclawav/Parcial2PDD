package examen.e1;

public class Versiones {
    private Documento documento;

    public void agregarPalabras(Documento documento, String adicion, HistorialVersiones historial) {
        documento.setPalabras(documento.getPalabras() + " " + adicion);
        this.crearVersion(documento, historial);
    }

    public void crearVersion(Documento documento, HistorialVersiones historial) {
        Memento memento = new Memento(documento.getPalabras(), documento.getNumeroVersionActual(), documento.getAliasVersion());
        documento.setNumeroVersionActual(documento.getNumeroVersionActual() + 1);
        documento.setAliasVersion("version" + (documento.getNumeroVersionActual() + 1));
        System.out.println("Se ha creado la versión " + memento.getAliasVersion());
        historial.agregarMemento(memento);
    }

    public void ctrlZ(Documento documento) {
        Memento memento = HistorialVersiones.getMemento(documento.getNumeroVersionActual()-1);
        documento.setPalabras(memento.getPalabras());
        documento.setNumeroVersionActual(memento.getNumeroVersion()+1);
        documento.setAliasVersion(memento.getAliasVersion());
        System.out.println("ctrl + Z a la versión " + memento.getAliasVersion());
    }
    public void ctrlY(Documento documento){
        Memento memento = HistorialVersiones.getMemento(documento.getNumeroVersionActual()+1);
        documento.setPalabras(memento.getPalabras());
        documento.setNumeroVersionActual(memento.getNumeroVersion()+1);
        documento.setAliasVersion(memento.getAliasVersion());
        System.out.println("ctrl + Y a la versión " + memento.getAliasVersion());
    }
}
