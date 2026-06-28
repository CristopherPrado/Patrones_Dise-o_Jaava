import singleton.ConfiguracionSistema;
import factory.Notificacion;
import factory.NotificacionFactory;
import builder.Tarea;
import adapter.ServicioExterno;
import adapter.PagoAdapter;
import adapter.Pago;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================== Patron Singleton ===================");

        ConfiguracionSistema c1 = ConfiguracionSistema.getInstancia();
        ConfiguracionSistema c2 = ConfiguracionSistema.getInstancia();
        c1.setIdioma("en");
        c1.setTema("claro");

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 == c2? " + (c1 == c2));

        System.out.println("=================== Patron Factory ====================");

        Notificacion email = NotificacionFactory.crearNotificacion("email");
        email.enviarMensaje("usuario@correo.com", "Tu pedido ha sido confirmado.");

        Notificacion sms = NotificacionFactory.crearNotificacion("sms");
        sms.enviarMensaje("+593999123456", "Tu codigo de verificacion es 4821.");

        System.out.println("=================== Patron Builder ===================");

        Tarea tarea = new Tarea.Builder("Implementar patrones de diseno")
                .descripcion("Singleton, Factory, Builder y Adapter en Java")
                .prioridad("alta")
                .fechaLimite("2025-07-01")
                .completada(false)
                .build();
        System.out.println("Tarea construida: " + tarea);

        Tarea tareaSimple = new Tarea.Builder("Revisar documentacion")
                .build();
        System.out.println("Tarea simple: " + tareaSimple);

        System.out.println("=================== Patron Adapter ===================");

        ServicioExterno servicioExterno = new ServicioExterno();
        Pago pago = new PagoAdapter(servicioExterno);
        pago.pagar(150.75);
    }
}
