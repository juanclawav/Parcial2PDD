package examen.e2;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends ParticipanteChat{
    private String cargo;

    public Administrativo(String nombre, String cargo, ChatMediator chatMediator){
        super(nombre,chatMediator);
        this.cargo=cargo;
    }
    public void enviar(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins){
        enviarMensaje(mensaje, paraTodos,paraEstudiantes, paraDocentes, paraAdmins);
    }
    @Override
    public void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins){
        chatMediator.enviarMensaje(mensaje, paraTodos, paraEstudiantes, paraDocentes, paraAdmins, this);
    }
    @Override
    public void recibirMensaje(String mensaje){
        System.out.println("Admin "+nombre+" ha recibido el mensaje: "+mensaje);
    }
}
public class ChatEducacional implements ChatMediator{
    private List<ParticipanteChat> participantes = new ArrayList<>();
    @Override
    public void agregarParticipante(ParticipanteChat participante){
        participantes.add(participante);
    }
    @Override
    public void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins, ParticipanteChat participanteChat){
        if(paraTodos){
            if (participanteChat instanceof Estudiante|participanteChat instanceof  Administrativo){
                for(ParticipanteChat p : participantes){
            }
        }
    }
}
interface ChatMediator{
    void agregarParticipante(ParticipanteChat participante);
    void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins, ParticipanteChat participanteChat);
}
abstract class ParticipanteChat {
    protected String nombre;
    protected ChatMediator chatMediator;

    public ParticipanteChat(String nombre, ChatMediator chatMediator){
        this.nombre=nombre;
        this.chatMediator=chatMediator;
        chatMediator.agregarParticipante(this);
    }
    public abstract void enviarMensaje(String mensaje,boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins);
    public abstract void recibirMensaje(String mensaje);
}
class Docente extends ParticipanteChat{
    private String ci;
    public Docente(String ci, String nombre, ChatMediator chatMediator){
        super(nombre, chatMediator);
        this.ci=ci;
    }
    public void enviar(String mensaje, boolean paraEstudiantes, boolean paraDocentes){
        enviarMensaje(mensaje,false,paraEstudiantes,paraDocentes,false);
    }
    @Override
    public void enviarMensaje(String mensaje,boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins){
        chatMediator.enviarMensaje(mensaje,paraTodos,paraEstudiantes,paraDocentes,paraAdmins,this);
    }
    @Override
    public void recibirMensaje(String mensaje){
        System.out.println("Docente "+nombre+" ha recibido el mensaje: "+mensaje);
    }
}
 class Estudiante extends ParticipanteChat{
    private int numMatricula;
    public Estudiante (int numMatricula, String nombre, ChatMediator chatMediator){
        super(nombre, chatMediator);
        this.numMatricula=numMatricula;
    }
    public void enviar(String mensaje, boolean paraTodos, boolean paraDocentes, boolean paraAdmins){
        enviarMensaje(mensaje,paraTodos,false,paraDocentes,paraAdmins);
    }
    @Override
    public void enviarMensaje(String mensaje,boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins){
        chatMediator.enviarMensaje(mensaje,paraTodos,paraEstudiantes,paraDocentes,paraAdmins,this);
    }
    @Override
    public void recibirMensaje(String mensaje){
        System.out.println("Docente "+nombre+" ha recibido el mensaje: "+mensaje);
    }
}
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
