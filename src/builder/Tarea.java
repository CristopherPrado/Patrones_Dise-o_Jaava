package builder;

public class Tarea {

    private final String titulo;
    private final String descripcion;
    private final String prioridad;
    private final String fechaLimite;
    private final boolean completada;

    // Constructor privado: solo el Builder puede instanciar
    private Tarea(Builder builder) {
        this.titulo      = builder.titulo;
        this.descripcion = builder.descripcion;
        this.prioridad   = builder.prioridad;
        this.fechaLimite = builder.fechaLimite;
        this.completada  = builder.completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", fechaLimite='" + fechaLimite + '\'' +
                ", completada=" + completada +
                '}';
    }

    // ── Builder interno ────────────────────────────────────────────────────────
    public static class Builder {

        private String titulo;
        private String descripcion = "";
        private String prioridad   = "media";
        private String fechaLimite = "sin fecha";
        private boolean completada = false;

        public Builder(String titulo) {
            this.titulo = titulo;
        }

        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Builder prioridad(String prioridad) {
            this.prioridad = prioridad;
            return this;
        }

        public Builder fechaLimite(String fechaLimite) {
            this.fechaLimite = fechaLimite;
            return this;
        }

        public Builder completada(boolean completada) {
            this.completada = completada;
            return this;
        }

        public Tarea build() {
            return new Tarea(this);
        }
    }
}
