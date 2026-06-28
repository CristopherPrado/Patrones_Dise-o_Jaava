package factory;

public class NotificacionSMS implements Notificacion {

    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("[SMS] Para: " + destinatario + " | Mensaje: " + mensaje);
    }
}
