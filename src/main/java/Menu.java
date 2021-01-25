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
            System.out.println("Elige una opción:");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("1 - Per quin camp volem buscar, títol, director, any, etc. \n" +
                    "2 - Que doni la opció de saber quantes pel·lícules d’un determinat director hi apareixen\n" +
                    "3 - Quants títols una determinada paraula hi apareix. \n" +
                    "4 - Quantes vegades un director i un intèrpret coincideixen\n" +
                    "5 - Pel·lícules on hi apareguin el intèrprets que selecciones\n" +
                    "6 - Cercar quants tipus diferents d’idiomes hi ha\n" +
                    "7 - Ordenar les pel·licules de mes antigues a mes recent\n" +
                    "8 - Salir");
            System.out.println("-------------------------------------------------------------------------------------------");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1");
                    System.out.println("¿Por que quieres buscar?");
                    System.out.println("1. Titol - 2. Director - 3. Any");
                    int busqueda = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce tu busqueda:");
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
                                        System.out.println("Tu busqueda no tuvo resultados");}
                                return false;
                            })
                            .forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    System.out.println("Elige un director:");
                    String director = scanner.nextLine();

                    long cont = films.stream()
                            .filter(f -> f.getDireccio().contains(director)).count();
                    System.out.println("Nº Peliculas: " + cont);

                    break;
                case 3:
                    System.out.println("Opcion 3");
                    System.out.println("¿Que palabra quieres buscar?");
                    String palabra = scanner.nextLine();
                    long contP = films.stream()
                            .filter(f -> f.getTitol().contains(palabra)).count();
                    System.out.println("Nº Peliculas: " + contP);

                    break;
                case 4:
                    System.out.println("Opcion 4");

                    System.out.println("Elige un director:");
                    String director4 = scanner.nextLine();

                    System.out.println("Elige un interprete:");
                    String interprete4 = scanner.nextLine();
                    long cont4 = films.stream()
                            .filter(f -> f.getDireccio().contains(director4) && f.getInterprets().contains(interprete4)).count();
                    System.out.println("Nº Peliculas: " + cont4);

                    break;
                case 5:
                    System.out.println("Opcion 5");
                    System.out.println("Elige interpretes");
                    String iElegido = scanner.nextLine();
                    films.stream()
                            .filter(f -> f.getInterprets().contains(iElegido))
                            .forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Opcion 6");
                    films.stream()
                            .distinct()
                            .forEach(f -> System.out.println(f.getI_original()));

                    break;
                case 7:
                    System.out.println("Opcion 7");
                    List<Peliculas> sortedFilms = films.stream().sorted().collect(Collectors.toList());
                    for (Peliculas pelis : sortedFilms){
                        System.out.println(pelis);
                    }

                    break;
                case 8:
                    System.out.println("Hasta la vista, baby");
                    bucle = false;
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}