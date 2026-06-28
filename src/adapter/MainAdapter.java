package adapter;

public class MainAdapter {

    public static void main(String[] args) {
        System.out.println("=== PATRÓN ADAPTER ===");

        // El sistema usa la interfaz Pago (pagar())
        // pero internamente delega al servicio externo (realizarTransaccion())
        ServicioExterno servicioExterno = new ServicioExterno();
        Pago pago = new PagoAdapter(servicioExterno);

        // El sistema solo llama a pagar()
        pago.pagar(150.75);
    }
}
