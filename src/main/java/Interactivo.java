public class Interactivo extends Articulo{
    private int edadRecomendada;
    private String plataforma;
    private String tiposDeInteractivo;
    private String genero;
    private float espacioEnDisco;


    public Interactivo(int id, String autor, int añoDePublicacion, String titulo, String clasificacion, String idioma,
                       int edadRecomendada, String plataforma, String tiposDeInteractivo, String genero, float espacioEnDisco) {
        super(id, autor, añoDePublicacion, titulo, clasificacion, idioma);
        this.edadRecomendada = edadRecomendada;
        this.plataforma = plataforma;
        this.tiposDeInteractivo = tiposDeInteractivo;
        this.genero = genero;
        this.espacioEnDisco = espacioEnDisco;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getTiposDeInteractivo() {
        return tiposDeInteractivo;
    }

    public void setTiposDeInteractivo(String tiposDeInteractivo) {
        this.tiposDeInteractivo = tiposDeInteractivo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getEspacioEnDisco() {
        return espacioEnDisco;
    }

    public void setEspacioEnDisco(float espacioEnDisco) {
        this.espacioEnDisco = espacioEnDisco;
    }

    @Override
    public String toString() {
        return "-> Interactivo { " +
                "id = " + id +
                ", autor = '" + autor + '\'' +
                ", añoDePublicacion = " + añoDePublicacion +
                ", titulo = '" + titulo + '\'' +
                ", clasificacion = '" + clasificacion + '\'' +
                ", idioma = '" + idioma + '\'' +
                ", edadRecomendada = " + edadRecomendada +
                ", plataforma = '" + plataforma + '\'' +
                ", tiposDeInteractivo = '" + tiposDeInteractivo + '\'' +
                ", genero = '" + genero + '\'' +
                ", espacioEnDisco = " + espacioEnDisco +
                " }";
    }
}
