package examen.e2;

class Docente extends ParticipanteChat {
    private String ci;

    public Docente(String ci, String nombre, ChatMediator chatMediator) {
        super(nombre, chatMediator);
        this.ci = ci;
    }

    public void enviar(String mensaje, boolean paraEstudiantes, boolean paraDocentes) {
        enviarMensaje(mensaje, false, paraEstudiantes, paraDocentes, false);
    }

    @Override
    public void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins) {
        chatMediator.enviarMensaje(mensaje, paraTodos, paraEstudiantes, paraDocentes, paraAdmins, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Docente " + nombre + " ha recibido el mensaje: " + mensaje);
    }
}
