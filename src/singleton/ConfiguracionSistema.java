package singleton;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String idioma;
    private String tema;

    // Constructor privado para evitar instanciación externa
    private ConfiguracionSistema() {
        this.idioma = "es";
        this.tema = "oscuro";
    }

    // Método estático que devuelve siempre la misma instancia
    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "ConfiguracionSistema{idioma='" + idioma + "', tema='" + tema + "'}";
    }
}
