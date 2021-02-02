package Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FILM")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Film {
    private String idfilm;
    private String prioritat;
    private String titol;
    private String situacio;
    private String any;
    private String cartell;
    private String original;
    private String direccio;
    private String interprets;
    private String sipnosis;
    private String versio;
    private String idioma;
    private String qualificacio;
    private String trailer;
    private String web;
    private String estrena;

    public String getIdfilm() {
        return idfilm;
    }

    public void setIdfilm(String idfilm) {
        this.idfilm = idfilm;
    }

    public String getPrioritat() {
        return prioritat;
    }

    public void setPrioritat(String prioritat) {
        this.prioritat = prioritat;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getSituacio() {
        return situacio;
    }

    public void setSituacio(String situacio) {
        this.situacio = situacio;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getCartell() {
        return cartell;
    }

    public void setCartell(String cartell) {
        this.cartell = cartell;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getInterprets() {
        return interprets;
    }

    public void setInterprets(String interprets) {
        this.interprets = interprets;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getVersio() {
        return versio;
    }

    public void setVersio(String versio) {
        this.versio = versio;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getQualificacio() {
        return qualificacio;
    }

    public void setQualificacio(String qualificacio) {
        this.qualificacio = qualificacio;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEstrena() {
        return estrena;
    }

    public void setEstrena(String estrena) {
        this.estrena = estrena;
    }

    @Override
    public String toString() {
        return "Pelicula {" +
                "ID del film: " + idfilm +
                ", Prioritat: " + prioritat +
                ", Titol: " + titol +
                ", Situacio: " + situacio +
                ", Any: " + any +
                ", Cartell: " + cartell +
                ", Titol original: " + original +
                ", Director: " + direccio +
                ", Actors i actrius: " + interprets +
                ", Sipnosis: " + sipnosis +
                ", Versió: " + versio +
                ", Idioma original: " + idioma +
                ", Qualifiació: " + qualificacio +
                ", Trailer: " + trailer +
                ", Web: " + web +
                ", Data d´estrena: " + estrena +
                '}';
    }
}