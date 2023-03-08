package examen.e2;

interface ChatMediator {
    void agregarParticipante(ParticipanteChat participante);

    void enviarMensaje(String mensaje, boolean paraTodos, boolean paraEstudiantes, boolean paraDocentes, boolean paraAdmins, ParticipanteChat participanteChat);
}
