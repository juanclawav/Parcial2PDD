package examen.e3;

class User implements Observer {
    private int userID;
    private String tipoNotificacion;

    public User(int userID, String tipoNotificacion) {
        this.userID = userID;
        this.tipoNotificacion = tipoNotificacion;
    }

    @Override
    public void update(String tipoNotificacion) {
        System.out.println("El usuario " + userID + " tiene una notificacion de tipo: " + tipoNotificacion);
    }

    @Override
    public String getTipoNotificacion() {
        return tipoNotificacion;
    }
}
