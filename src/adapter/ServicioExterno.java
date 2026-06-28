package adapter;

// Servicio externo con método incompatible (no usa pagar())
public class ServicioExterno {

    public void realizarTransaccion(double monto, String moneda) {
        System.out.println("[ServicioExterno] Transacción realizada: " + monto + " " + moneda);
    }
}
