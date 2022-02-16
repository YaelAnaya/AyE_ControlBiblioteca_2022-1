public class Texto extends Articulo{
    private String editorial;
    private int numeroDePaginas;
    private String tipoDeTexto;
    private String genero;
    private String tamañoDeHoja;

    public Texto(int id, String autor, int añoDePublicacion, String titulo, String clasificacion, String idioma,
                 String editorial, int numeroDePaginas, String tipoDeTexto, String genero, String tamañoDeHoja) {
        super(id, autor, añoDePublicacion, titulo, clasificacion, idioma);
        this.editorial = editorial;
        this.numeroDePaginas = numeroDePaginas;
        this.tipoDeTexto = tipoDeTexto;
        this.genero = genero;
        this.tamañoDeHoja = tamañoDeHoja;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTipoDeTexto() {
        return tipoDeTexto;
    }

    public void setTipoDeTexto(String tipoDeTexto) {
        this.tipoDeTexto = tipoDeTexto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTamañoDeHoja() {
        return tamañoDeHoja;
    }

    public void setTamañoDeHoja(String tamañoDeHoja) {
        this.tamañoDeHoja = tamañoDeHoja;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", añoDePublicacion=" + añoDePublicacion +
                ", titulo='" + titulo + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", idioma='" + idioma + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", tipoDeTexto='" + tipoDeTexto + '\'' +
                ", genero='" + genero + '\'' +
                ", tamañoDeHoja='" + tamañoDeHoja + '\'' +
                '}';
    }
}
