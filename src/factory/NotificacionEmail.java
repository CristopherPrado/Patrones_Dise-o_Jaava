package factory;

public class NotificacionEmail implements Notificacion {

    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("[EMAIL] Para: " + destinatario + " | Mensaje: " + mensaje);
    }
}
