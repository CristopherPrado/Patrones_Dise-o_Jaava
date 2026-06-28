package factory;

public class MainFactory {

    public static void main(String[] args) {
        System.out.println("=== PATRÓN FACTORY ===");

        // Crear notificación por email
        Notificacion email = NotificacionFactory.crearNotificacion("email");
        email.enviarMensaje("usuario@correo.com", "Tu pedido ha sido confirmado.");

        // Crear notificación por SMS
        Notificacion sms = NotificacionFactory.crearNotificacion("sms");
        sms.enviarMensaje("+593999123456", "Tu código de verificación es 4821.");
    }
}
