package factory;

public class MainFactory {

    public static void main(String[] args) {
        System.out.println("=================== Patron Factory ===================");

        Notificacion email = NotificacionFactory.crearNotificacion("email");
        email.enviarMensaje("usuario@correo.com", "Tu pedido ha sido confirmado.");

        Notificacion sms = NotificacionFactory.crearNotificacion("sms");
        sms.enviarMensaje("+593999123456", "Tu codigo de verificacion es 4821.");
    }
}
