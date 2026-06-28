import singleton.ConfiguracionSistema;
import singleton.MainSingleton;
import factory.Notificacion;
import factory.NotificacionFactory;
import builder.Tarea;
import adapter.ServicioExterno;
import adapter.PagoAdapter;
import adapter.Pago;

public class Main {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────
        // PATRÓN 1: SINGLETON
        // ─────────────────────────────────────────────
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         PATRÓN SINGLETON             ║");
        System.out.println("╚══════════════════════════════════════╝");

        ConfiguracionSistema c1 = ConfiguracionSistema.getInstancia();
        ConfiguracionSistema c2 = ConfiguracionSistema.getInstancia();
        c1.setIdioma("en");
        c1.setTema("claro");

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("¿c1 == c2? " + (c1 == c2));

        // ─────────────────────────────────────────────
        // PATRÓN 2: FACTORY
        // ─────────────────────────────────────────────
        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          PATRÓN FACTORY              ║");
        System.out.println("╚══════════════════════════════════════╝");

        Notificacion email = NotificacionFactory.crearNotificacion("email");
        email.enviarMensaje("usuario@correo.com", "Tu pedido ha sido confirmado.");

        Notificacion sms = NotificacionFactory.crearNotificacion("sms");
        sms.enviarMensaje("+593999123456", "Tu código de verificación es 4821.");

        // ─────────────────────────────────────────────
        // PATRÓN 3: BUILDER
        // ─────────────────────────────────────────────
        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          PATRÓN BUILDER              ║");
        System.out.println("╚══════════════════════════════════════╝");

        Tarea tarea = new Tarea.Builder("Implementar patrones de diseño")
                .descripcion("Singleton, Factory, Builder y Adapter en Java")
                .prioridad("alta")
                .fechaLimite("2025-07-01")
                .completada(false)
                .build();
        System.out.println("Tarea construida: " + tarea);

        Tarea tareaSimple = new Tarea.Builder("Revisar documentación")
                .build();
        System.out.println("Tarea simple:     " + tareaSimple);

        // ─────────────────────────────────────────────
        // PATRÓN 4: ADAPTER
        // ─────────────────────────────────────────────
        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          PATRÓN ADAPTER              ║");
        System.out.println("╚══════════════════════════════════════╝");

        ServicioExterno servicioExterno = new ServicioExterno();
        Pago pago = new PagoAdapter(servicioExterno);
        pago.pagar(150.75);

        System.out.println();
        System.out.println("✔ Todos los patrones ejecutados correctamente.");
    }
}
