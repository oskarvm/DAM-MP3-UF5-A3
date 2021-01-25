import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Streams {
    static final String pathURL = "http://gencat.cat/llengua/cinema/provacin.xml";

    public List<Peliculas> getPeliculas() throws IOException, ParserConfigurationException, SAXException {

        URL url = new URL(pathURL);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(url.openStream());

        List<Peliculas> films = new ArrayList<>();

        document.getDocumentElement().normalize();
        NodeList nlist = document.getElementsByTagName("FILM");

        for (int temp = 0; temp < nlist.getLength(); temp++) {
            Node nNode = nlist.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                try {
                    Element eElement = (Element) nNode;

                    String idfilm = eElement.getElementsByTagName("IDFILM").item(0).getTextContent();

                    String prioritat = eElement.getElementsByTagName("PRIORITAT").item(0).getTextContent();

                    String titol = eElement.getElementsByTagName("TITOL").item(0).getTextContent();

                    String situacio = eElement.getElementsByTagName("SITUACIO").item(0).getTextContent();

                    String any = eElement.getElementsByTagName("ANY").item(0).getTextContent();

                    String cartell = eElement.getElementsByTagName("CARTELL").item(0).getTextContent();

                    String original = eElement.getElementsByTagName("ORIGINAL").item(0).getTextContent();

                    String direccio = eElement.getElementsByTagName("DIRECCIO").item(0).getTextContent();

                    String interprets = eElement.getElementsByTagName("INTERPRETS").item(0).getTextContent();

                    String sinopsi = eElement.getElementsByTagName("SINOPSI").item(0).getTextContent();

                    String versio = eElement.getElementsByTagName("VERSIO").item(0).getTextContent();

                    String i_original = eElement.getElementsByTagName("IDIOMA_x0020_ORIGINAL").item(0).getTextContent();

                    String qualificacio = eElement.getElementsByTagName("QUALIFICACIO").item(0).getTextContent();

                    String trailer = eElement.getElementsByTagName("TRAILER").item(0).getTextContent();

                    String web = eElement.getElementsByTagName("WEB").item(0).getTextContent();

                    String estrena = eElement.getElementsByTagName("ESTRENA").item(0).getTextContent();


                    Peliculas pelicula = new Peliculas(idfilm, prioritat, titol, situacio, any, cartell, original, direccio, interprets, sinopsi, versio, i_original, qualificacio, trailer, web, estrena);

                    films.add(pelicula);
                }catch (NullPointerException e){
                    System.out.println(e);
                }
            }

        }
        return films;
    }
}