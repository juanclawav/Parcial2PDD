package examen.e2;

public class Administrativo extends ParticipanteChat {
    private String cargo;

    public Administrativo(String nombre, String cargo, ChatMediator chatMediator) {
        super(nombre, chatMediator);
        this.cargo = cargo;
    }

    public void enviar(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins) {
        enviarMensaje(mensaje, paraTodos, paraEstudiantes, paraDocentes, paraAdmins);
    }

    @Override
    public void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins) {
        chatMediator.enviarMensaje(mensaje, paraTodos, paraEstudiantes, paraDocentes, paraAdmins, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Admin " + nombre + " ha recibido el mensaje: " + mensaje);
    }
}
