package singleton;

public class MainSingleton {

    public static void main(String[] args) {
        ConfiguracionSistema c1 = ConfiguracionSistema.getInstancia();
        ConfiguracionSistema c2 = ConfiguracionSistema.getInstancia();

        c1.setIdioma("en");
        c1.setTema("claro");

        System.out.println("=================== Patron Singleton ===================");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 == c2? " + (c1 == c2));
    }
}
