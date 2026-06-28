package singleton;

public class MainSingleton {

    public static void main(String[] args) {
        // Obtener dos referencias al Singleton
        ConfiguracionSistema c1 = ConfiguracionSistema.getInstancia();
        ConfiguracionSistema c2 = ConfiguracionSistema.getInstancia();

        // Modificar desde c1
        c1.setIdioma("en");
        c1.setTema("claro");

        // Verificar que c2 refleja el mismo estado
        System.out.println("=== PATRÓN SINGLETON ===");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        // La comparación c1 == c2 debe imprimir true
        System.out.println("¿c1 == c2? " + (c1 == c2));
    }
}
