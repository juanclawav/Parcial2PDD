package examen.e2;

class Estudiante extends ParticipanteChat {
    private int numMatricula;

    public Estudiante(int numMatricula, String nombre, ChatMediator chatMediator) {
        super(nombre, chatMediator);
        this.numMatricula = numMatricula;
    }

    public void enviar(String mensaje, boolean paraTodos, boolean paraDocentes, boolean paraAdmins) {
        enviarMensaje(mensaje, paraTodos, false, paraDocentes, paraAdmins);
    }

    @Override
    public void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins) {
        chatMediator.enviarMensaje(mensaje, paraTodos, paraEstudiantes, paraDocentes, paraAdmins, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Estudiante " + nombre + " ha recibido el mensaje: " + mensaje);
    }
}
