package adapter;

// Adaptador: traduce pagar() → realizarTransaccion()
public class PagoAdapter implements Pago {

    private final ServicioExterno servicioExterno;

    public PagoAdapter(ServicioExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("[Adapter] Adaptando pagar() → realizarTransaccion()");
        servicioExterno.realizarTransaccion(monto, "USD");
    }
}
