package examen.e2;

abstract class ParticipanteChat {
    protected String nombre;
    protected ChatMediator chatMediator;

    public ParticipanteChat(String nombre, ChatMediator chatMediator) {
        this.nombre = nombre;
        this.chatMediator = chatMediator;
        chatMediator.agregarParticipante(this);
    }

    public abstract void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins);

    public abstract void recibirMensaje(String mensaje);
}
