package examen.e2;

public class Main {
    public static void main(String [] args) {
        ChatMediator chatEducacional = new ChatEducacional();

        Estudiante e1 = new Estudiante(1234, "Juan", chatEducacional);
        Estudiante e2 = new Estudiante(5543, "Jose", chatEducacional);
        Estudiante e3 = new Estudiante(768, "Jorge", chatEducacional);
        Docente d1 = new Docente("527562", "Paul", chatEducacional);
        Docente d2 = new Docente("23554", "Raul", chatEducacional);
        Administrativo a1 = new Administrativo("Saul", "Rector", chatEducacional);

        e1.enviar("Hola docentes", false, true, false);
        e2.enviar("Hola a todes", true, false, false);
        d1.enviar("Buenas a todos", true, true);
        a1.enviar("Reunion mañana!", false, true, false, true);
    }
}
