package adapter;

/**
 * Adaptador que permite usar ServicioPayPalExterno
 * a través de la interfaz Pago que espera nuestro sistema.
 */
public class PayPalAdapter implements Pago {

    private final ServicioPayPalExterno servicioPayPal;

    public PayPalAdapter(ServicioPayPalExterno servicioPayPal) {
        this.servicioPayPal = servicioPayPal;
    }

    @Override
    public void pagar(double monto) {
        // Adaptamos la llamada: nuestro sistema pasa solo el monto,
        // pero PayPal también necesita la moneda.
        servicioPayPal.iniciarTransaccion("USD", monto);
    }
}
