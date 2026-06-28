package builder;

public class MainBuilder {

    public static void main(String[] args) {
        System.out.println("=== PATRÓN BUILDER ===");

        // Construir una tarea con métodos encadenados
        Tarea tarea = new Tarea.Builder("Implementar patrones de diseño")
                .descripcion("Singleton, Factory, Builder y Adapter en Java")
                .prioridad("alta")
                .fechaLimite("2025-07-01")
                .completada(false)
                .build();

        System.out.println("Tarea construida: " + tarea);

        // Tarea mínima (solo título obligatorio)
        Tarea tareaSimple = new Tarea.Builder("Revisar documentación")
                .build();

        System.out.println("Tarea simple: " + tareaSimple);
    }
}
