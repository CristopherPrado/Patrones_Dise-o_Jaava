package adapter;

/**
 * Servicio externo de PayPal con su propia API incompatible.
 * No podemos modificar esta clase (viene de una librería de terceros).
 */
public class ServicioPayPalExterno {

    public void iniciarTransaccion(String moneda, double cantidad) {
        System.out.println("[PayPal] Iniciando transacción...");
        System.out.println("[PayPal] Moneda: " + moneda);
        System.out.println("[PayPal] Cantidad: " + cantidad);
        System.out.println("[PayPal] Transacción completada con éxito.");
    }
}
