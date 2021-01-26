import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {

    public void mostrarMenu(List<Peliculas> films){

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Boolean bucle = true;

        while (bucle) {

            System.out.println("");
            System.out.println("Tria una opció:");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(
                    "1 - Filtra per camps \n" +
                    "2 - Pel·lícules per director \n" +
                    "3 - Quants títols una determinada paraula hi apareix \n" +
                    "4 - Quantes vegades un director i un intèrpret coincideixen \n" +
                    "5 - Pel·lícules per actor o actriu \n" +
                    "6 - Cercar quants tipus diferents d’idiomes hi ha \n" +
                    "7 - Ordenar les pel·licules de mes antigues a mes recent \n" +
                    "8 - Salir");
            System.out.println("-------------------------------------------------------------------------------------------");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Opció 1");
                    System.out.println("¿Que vols buscar?");
                    System.out.println("1. Titol - 2. Director - 3. Any");
                    int busqueda = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introdueix la teva busqueda:");
                    String texto = scanner.nextLine();

                    films.stream()
                            .filter(f -> {
                                switch (busqueda) {
                                    case 1:
                                        return f.getTitol().contains(texto);

                                    case 2:
                                        return f.getDireccio().contains(texto);

                                    case 3:
                                        return f.getAny().contains(texto);
                                    default:
                                        System.out.println("No hi ha resultats");}
                                return false;
                            })
                            .forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Opció 2");
                    System.out.println("Tria un director:");
                    String director = scanner.nextLine();

                    long cont = films.stream()
                            .filter(f -> f.getDireccio().contains(director)).count();
                    System.out.println("Aquest directo surt " + cont + " vegades en aquesta llista de pel·lícules");

                    break;
                case 3:
                    System.out.println("Opció 3");
                    System.out.println("¿Quina paraula vols cercar?");
                    String palabra = scanner.nextLine();
                    long contP = films.stream()
                            .filter(f -> f.getTitol().contains(palabra)).count();
                    System.out.println("Aquesta paraula surt " + contP + " al titol de les pel·lícules");

                    break;
                case 4:
                    System.out.println("Opció 4");

                    System.out.println("Tria un director:");
                    String director4 = scanner.nextLine();

                    System.out.println("Tria un actor o actriu:");
                    String interprete4 = scanner.nextLine();
                    long cont4 = films.stream()
                            .filter(f -> f.getDireccio().contains(director4) && f.getInterprets().contains(interprete4)).count();
                    System.out.println("Coincideixen a " + cont4 + " pel·lícules");

                    break;
                case 5:
                    System.out.println("Opció 5");
                    System.out.println("Tria un actor o actriu");
                    String iElegido = scanner.nextLine();
                    films.stream()
                            .filter(f -> f.getInterprets().contains(iElegido))
                            .forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Opció 6");
                    films.stream()
                            .distinct()
                            .forEach(f -> System.out.println(f.getI_original()));

                    break;
                case 7:
                    System.out.println("Opció 7");
                    List<Peliculas> sortedFilms = films.stream().sorted().collect(Collectors.toList());
                    for (Peliculas pelis : sortedFilms){
                        System.out.println(pelis);
                    }

                    break;
                case 8:
                    System.out.println("Adeu siau");
                    bucle = false;
                    return;
                default:
                    System.out.println("Opció no valida");
                    break;
            }
        }
    }
}