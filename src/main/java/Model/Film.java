package Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FILM")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Film {
    private String IDFILM;
    private String PRIORITAT;
    private String TITOL;
    private String SITUACIO;
    private String ANY;
    private String CARTELL;
    private String ORIGINAL;
    private String DIRECCIO;
    private String INTERPRETS;
    private String SINOPSI;
    private String VERSIO;
    private String IDIOMA_x0020_ORIGINAL;
    private String QUALIFICACIO;
    private String TRAILER;
    private String WEB;
    private String ESTRENA;

    public String getIDFILM() {
        return IDFILM;
    }

    public void setIDFILM(String IDFILM) {
        this.IDFILM = IDFILM;
    }

    public String getPRIORITAT() {
        return PRIORITAT;
    }

    public void setPRIORITAT(String PRIORITAT) {
        this.PRIORITAT = PRIORITAT;
    }

    public String getTITOL() {
        return TITOL;
    }

    public void setTITOL(String TITOL) {
        this.TITOL = TITOL;
    }

    public String getSITUACIO() {
        return SITUACIO;
    }

    public void setSITUACIO(String SITUACIO) {
        this.SITUACIO = SITUACIO;
    }

    public String getANY() {
        return ANY;
    }

    public void setANY(String ANY) {
        this.ANY = ANY;
    }

    public String getCARTELL() {
        return CARTELL;
    }

    public void setCARTELL(String CARTELL) {
        this.CARTELL = CARTELL;
    }

    public String getORIGINAL() {
        return ORIGINAL;
    }

    public void setORIGINAL(String ORIGINAL) {
        this.ORIGINAL = ORIGINAL;
    }

    public String getDIRECCIO() {
        return DIRECCIO;
    }

    public void setDIRECCIO(String DIRECCIO) {
        this.DIRECCIO = DIRECCIO;
    }

    public String getINTERPRETS() {
        return INTERPRETS;
    }

    public void setINTERPRETS(String INTERPRETS) {
        this.INTERPRETS = INTERPRETS;
    }

    public String getSINOPSI() {
        return SINOPSI;
    }

    public void setSINOPSI(String SINOPSI) {
        this.SINOPSI = SINOPSI;
    }

    public String getVERSIO() {
        return VERSIO;
    }

    public void setVERSIO(String VERSIO) {
        this.VERSIO = VERSIO;
    }

    public String getIDIOMA_x0020_ORIGINAL() {
        return IDIOMA_x0020_ORIGINAL;
    }

    public void setIDIOMA_x0020_ORIGINAL(String IDIOMA_x0020_ORIGINAL) {
        this.IDIOMA_x0020_ORIGINAL = IDIOMA_x0020_ORIGINAL;
    }

    public String getQUALIFICACIO() {
        return QUALIFICACIO;
    }

    public void setQUALIFICACIO(String QUALIFICACIO) {
        this.QUALIFICACIO = QUALIFICACIO;
    }

    public String getTRAILER() {
        return TRAILER;
    }

    public void setTRAILER(String TRAILER) {
        this.TRAILER = TRAILER;
    }

    public String getWEB() {
        return WEB;
    }

    public void setWEB(String WEB) {
        this.WEB = WEB;
    }

    public String getESTRENA() {
        return ESTRENA;
    }

    public void setESTRENA(String ESTRENA) {
        this.ESTRENA = ESTRENA;
    }

    @Override
    public String toString() {
        return "Pelicula {" +
                "ID del film: " + IDFILM +
                ", Titol: " + TITOL +
                ", Any: " + ANY +
                ", Situacio: " + SITUACIO +
                ", Cartell: " + CARTELL +
                ", Titol original: " + ORIGINAL +
                ", Director: " + DIRECCIO +
                ", Actors i actrius: " + INTERPRETS +
                ", Versió: " + VERSIO +
                ", Idioma original: " + IDIOMA_x0020_ORIGINAL +
                ", Qualifiació: " + QUALIFICACIO +
                ", Prioritat: " + PRIORITAT +
                ", Trailer: " + TRAILER +
                ", Web: " + WEB +
                ", Data d´estrena: " + ESTRENA +
                ", Sipnosis: " + SINOPSI +
                '}';
    }
}