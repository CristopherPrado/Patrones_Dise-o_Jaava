package adapter;

public class ServicioExterno {

    public void realizarTransaccion(double monto, String moneda) {
        System.out.println("[ServicioExterno] Transaccion realizada: " + monto + " " + moneda);
    }
}
