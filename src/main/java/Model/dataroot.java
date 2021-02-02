package Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "dataroot")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class dataroot {
    private Film film;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @XmlElement(name = "FILM")
    private List<Film> llistaFilm;

    public List<Film> getLlistaFilm() {
        return llistaFilm;
    }
}
