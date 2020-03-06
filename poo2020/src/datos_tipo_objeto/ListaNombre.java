package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombre {
    public static void main(String[] args) {
        // Declaración de variables
        int opcion;
        boolean boleano = true;

        // Declaracion de scanner
        Scanner scanner = new Scanner(System.in);

        // Creación de una lista en java
        // para almacenar valores de tipo string
        List<String> nombre = new ArrayList<String>();

        do {
            // menú de opciones
            System.out.println("----------------MENÚ-------------");
            System.out.println("| 1. Agregar nuevo nombre       |");
            System.out.println("| 2. Presentar lista de nombres |");
            System.out.println("| 3. Salir                      |");
            // Dato por teclado de la opcion
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Agrege el nombre: ");
                    nombre.add(scanner.nextLine());
                    break;
                case 2:
                    for (int i = 0; i < nombre.size(); i++) {
                        // Presentar toda la lista
                        System.out.println(nombre.get(i));
                    }
                    break;
                case 3:
                    // salida del ciclo
                    boleano = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        } while (boleano == true);

    }
}
