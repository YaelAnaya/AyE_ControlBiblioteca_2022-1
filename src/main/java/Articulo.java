public class Articulo {
    protected int id;
    protected String autor;
    protected int añoDePublicacion;
    protected String titulo;
    protected String clasificacion;
    protected String idioma;

    public Articulo(int id, String autor, int añoDePublicacion, String titulo, String clasificacion, String idioma) {
        this.id = id;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.idioma = idioma;
    }

    public Articulo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}
