package examen.e2;

import java.util.ArrayList;
import java.util.List;

public class ChatEducacional implements ChatMediator {
    private List<ParticipanteChat> participantes = new ArrayList<>();

    @Override
    public void agregarParticipante(ParticipanteChat participante) {
        participantes.add(participante);
    }

    @Override
    public void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins, ParticipanteChat participanteChat) {
        if (paraTodos) {
            if (participanteChat instanceof Estudiante | participanteChat instanceof Administrativo) {
                for (ParticipanteChat participante : participantes) {
                    if (!participante.equals(participanteChat))
                        participante.recibirMensaje(mensaje);
                }
            }
        } else if (participanteChat instanceof Administrativo) {
            for (ParticipanteChat participante : participantes) {
                if (!participante.equals(participanteChat) && paraEstudiantes && participante instanceof Estudiante)
                    participante.recibirMensaje(mensaje);
                if (!participante.equals(participanteChat) && paraAdmins && participante instanceof Administrativo)
                    participante.recibirMensaje(mensaje);
                if (!participante.equals(participanteChat) && paraDocentes && participante instanceof Docente)
                    participante.recibirMensaje(mensaje);
            }
        } else if (participanteChat instanceof Estudiante) {
            for (ParticipanteChat participante : participantes) {
                if (!participante.equals(participanteChat) && paraDocentes && participante instanceof Administrativo)
                    participante.recibirMensaje(mensaje);
                if (!participante.equals(participanteChat) && paraDocentes && participante instanceof Docente)
                    participante.recibirMensaje(mensaje);
            }
        } else if (participanteChat instanceof Docente) {
            for (ParticipanteChat participante : participantes) {
                if (!participante.equals(participanteChat) && paraEstudiantes && participante instanceof Estudiante)
                    participante.recibirMensaje(mensaje);
                if (!participante.equals(participanteChat) && paraDocentes && participante instanceof Docente)
                    participante.recibirMensaje(mensaje);
            }
        }
    }
}
