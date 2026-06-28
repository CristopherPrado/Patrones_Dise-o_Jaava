package adapter;

public class MainAdapter {

    public static void main(String[] args) {
        System.out.println("=================== Patron Adapter ===================");

        ServicioExterno servicioExterno = new ServicioExterno();
        Pago pago = new PagoAdapter(servicioExterno);
        pago.pagar(150.75);
    }
}
