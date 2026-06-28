package builder;

public class MainBuilder {

    public static void main(String[] args) {
        System.out.println("=================== Patron Builder ===================");

        Tarea tarea = new Tarea.Builder("Implementar patrones de diseno")
                .descripcion("Singleton, Factory, Builder y Adapter en Java")
                .prioridad("alta")
                .fechaLimite("2025-07-01")
                .completada(false)
                .build();

        System.out.println("Tarea construida: " + tarea);

        Tarea tareaSimple = new Tarea.Builder("Revisar documentacion")
                .build();

        System.out.println("Tarea simple: " + tareaSimple);
    }
}
