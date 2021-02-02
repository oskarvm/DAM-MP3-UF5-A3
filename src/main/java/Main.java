import org.xml.sax.SAXException;

import Model.dataroot;
import Model.Film;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    static final String pathXML = "http://gencat.cat/llengua/cinema/provacin.xml";

    public static void main(String[] args) throws IOException, JAXBException, InterruptedException {

        Scanner mc = new Scanner(System.in);
        Scanner mc2 = new Scanner(System.in);
        Menu menu = new Menu();
        int opcion;

        dataroot dataroot = readXML();
        Boolean bucle = true;

        do{
            menu.mostrarMenu();

            opcion = mc2.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Opció 1");
                    System.out.println("Introdueix titol:");
                    String titol = mc.nextLine();

                    Stream<Film> filmTitolFiltered =  dataroot.getLlistaFilm().stream().filter(p -> titol.equals(p.getTitol()));
                    filmTitolFiltered.forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Opció 2");
                    System.out.println("Introdueix nom del director:");
                    String director = mc.nextLine();

                    long contadorDirector = dataroot.getLlistaFilm().stream().filter(p -> director.equals(p.getDireccio())).count();

                    Stream<Film> filterBy =   dataroot.getLlistaFilm().stream().filter(p -> director.equals(p.getDireccio()));
                    filterBy.forEach(System.out::println);

                    System.out.println("Al directo/a " + director + " ha produït " + contadorDirector + " pel·lícules");
                    break;
                case 8:
                    System.out.println("Adeu siau");
                    bucle = false;
                    return;
                default:
                    System.out.println("Opció no valida");
                    break;
            }
        }while (bucle);
    }

    private static dataroot readXML() throws MalformedURLException, JAXBException {
        URL url = null;
        url = new URL(pathXML);

        JAXBContext contextObj = JAXBContext.newInstance(dataroot.class);
        Unmarshaller unmarshallerObj = contextObj.createUnmarshaller();
        dataroot dataroot = (dataroot) unmarshallerObj.unmarshal(url);


        return dataroot;
    }
}