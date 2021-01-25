import java.util.Objects;

public class Peliculas implements Comparable<Peliculas>{

    String idfilm;
    String prioritat;
    String titol;
    String situacio;
    String any;
    String cartell;
    String original;
    String direccio;
    String interprets;
    String sinopsi;
    String versio;
    String i_original;
    String qualificacio;
    String trailer;
    String web;
    String estrena;

    @Override
    public String toString() {
        return "Peliculas{" +
                "idfilm='" + idfilm + '\'' +
                ", prioritat='" + prioritat + '\'' +
                ", titol='" + titol + '\'' +
                ", situacio='" + situacio + '\'' +
                ", any='" + any + '\'' +
                ", cartell='" + cartell + '\'' +
                ", original='" + original + '\'' +
                ", direccio='" + direccio + '\'' +
                ", interprets='" + interprets + '\'' +
                ", sinopsi='" + sinopsi + '\'' +
                ", versio='" + versio + '\'' +
                ", i_original='" + i_original + '\'' +
                ", qualificacio='" + qualificacio + '\'' +
                ", trailer='" + trailer + '\'' +
                ", web='" + web + '\'' +
                ", estrena='" + estrena + '\'' +
                '}';
    }

    public String getIdfilm() {
        return idfilm;
    }

    public String getPrioritat() {
        return prioritat;
    }

    public String getTitol() {
        return titol;
    }

    public String getSituacio() {
        return situacio;
    }

    public String getAny() {
        return any;
    }

    public String getCartell() {
        return cartell;
    }

    public String getOriginal() {
        return original;
    }

    public String getDireccio() {
        return direccio;
    }

    public String getInterprets() {
        return interprets;
    }

    public String getSinopsi() {
        return sinopsi;
    }

    public String getVersio() {
        return versio;
    }

    public String getI_original() {
        return i_original;
    }

    public String getQualificacio() {
        return qualificacio;
    }

    public String getTrailer() {
        return trailer;
    }

    public String getWeb() {
        return web;
    }

    public String getEstrena() {
        return estrena;
    }

    public Peliculas(String idfilm, String prioritat, String titol, String situacio, String any, String cartell, String original, String direccio, String interprets, String sinopsi, String versio, String i_original, String qualificacio, String trailer, String web, String estrena) {
        this.idfilm = idfilm;
        this.prioritat = prioritat;
        this.titol = titol;
        this.situacio = situacio;
        this.any = any;
        this.cartell = cartell;
        this.original = original;
        this.direccio = direccio;
        this.interprets = interprets;
        this.sinopsi = sinopsi;
        this.versio = versio;
        this.i_original = i_original;
        this.qualificacio = qualificacio;
        this.trailer = trailer;
        this.web = web;
        this.estrena = estrena;
    }

    @Override
    public int compareTo(Peliculas pelis) {
        return this.any.compareTo(pelis.any);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peliculas peliculas = (Peliculas) o;
        return i_original.equals(peliculas.i_original);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i_original);
    }
}