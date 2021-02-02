import Model.dataroot;
import Model.Film;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Comparator;
import java.util.Scanner;
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

                    Stream<Film> filmTitolFiltered =  dataroot.getLlistaFilm().stream().filter(p -> titol.equals(p.getTITOL()));
                    filmTitolFiltered.forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Opció 2");
                    System.out.println("Introdueix any:");
                    String any = mc.nextLine();

                    Stream<Film> filmTAnyFiltered =  dataroot.getLlistaFilm().stream().filter(p -> any.equals(p.getANY()));
                    filmTAnyFiltered.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Opció 3");
                    System.out.println("Introdueix id:");
                    String id = mc.nextLine();

                    Stream<Film> filmIdFiltered =  dataroot.getLlistaFilm().stream().filter(p -> id.equals(p.getIDFILM()));
                    filmIdFiltered.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Opció 4");
                    System.out.println("Introdueix nom del director:");
                    String director = mc.nextLine();

                    long contadorDirector = dataroot.getLlistaFilm().stream().filter(p -> director.contains(p.getDIRECCIO())).count();

                    System.out.println("Al directo/a " + director + " ha produït " + contadorDirector + " pel·lícules");
                    break;
                case 5:
                    System.out.println("Opció 5");
                    System.out.println("Introdueix nom del actor o actriu:");
                    String interpret = mc.nextLine();

                    long contadorInterpret = dataroot.getLlistaFilm().stream().filter(p -> interpret.contains(p.getINTERPRETS())).count();

                    System.out.println("El/La actor/actriu " + interpret + " ha sortit en " + contadorInterpret + " pel·lícules");
                    break;
                case 6:
                    System.out.println("Opció 6");
                    dataroot.getLlistaFilm().stream().sorted(Comparator.comparing(Film::getANY)).forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Opció 7");
                    dataroot.getLlistaFilm().stream().sorted(Comparator.comparing(Film::getESTRENA)).forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("Sortin");
                    bucle = false;
                    break;
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