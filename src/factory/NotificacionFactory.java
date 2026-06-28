package factory;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new NotificacionEmail();
            case "sms":
                return new NotificacionSMS();
            default:
                throw new IllegalArgumentException("Tipo de notificacion no soportado: " + tipo);
        }
    }
}
