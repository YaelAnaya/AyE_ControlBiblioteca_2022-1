public class Multimedia extends Articulo{
   private String genero;
   private String tipoDeMultimedia;
   private String duración;

    public Multimedia(int id, String autor, int añoDePublicacion, String titulo, String clasificacion, String idioma,
                      String genero, String tipoDeMultimedia, String duración) {
        super(id, autor, añoDePublicacion, titulo, clasificacion, idioma);
        this.genero = genero;
        this.tipoDeMultimedia = tipoDeMultimedia;
        this.duración = duración;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoDeMultimedia() {
        return tipoDeMultimedia;
    }

    public void setTipoDeMultimedia(String tipoDeMultimedia) {
        this.tipoDeMultimedia = tipoDeMultimedia;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", añoDePublicacion=" + añoDePublicacion +
                ", titulo='" + titulo + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", idioma='" + idioma + '\'' +
                ", genero='" + genero + '\'' +
                ", tipoDeMultimedia='" + tipoDeMultimedia + '\'' +
                ", duración=" + duración +
                '}';
    }
}
