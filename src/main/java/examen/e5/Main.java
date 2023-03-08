package examen.e5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Celular celular = new Celular();
        celular.setState(new Prendido());
        celular.request();
        celular.setState(new Reiniciar());
        celular.request();
        celular.setState(new Apagado());
        celular.request();
    }
}

