package adapter;

/**
 * Adaptador que permite usar ServicioStripeExterno
 * a través de la interfaz Pago que espera nuestro sistema.
 */
public class StripeAdapter implements Pago {

    private final ServicioStripeExterno servicioStripe;
    private final String tarjetaToken;

    public StripeAdapter(ServicioStripeExterno servicioStripe, String tarjetaToken) {
        this.servicioStripe = servicioStripe;
        this.tarjetaToken   = tarjetaToken;
    }

    @Override
    public void pagar(double monto) {
        // Stripe trabaja con centavos enteros (long), hacemos la conversión aquí
        long centavos = Math.round(monto * 100);
        servicioStripe.cobrar(tarjetaToken, centavos);
    }
}
