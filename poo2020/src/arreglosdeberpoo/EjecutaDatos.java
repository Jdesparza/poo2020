package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaDatos {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String [] nombre = new String[5];
        int [] edad = new int[5];
        String [] universidad = new String[5];

        // creacion de objeto
        Datos datos = new Datos();

        // Datos por teclado y lectura
        for (int i = 0; i < nombre.length; i++) {
            System.out.print("Ingrese el nombre del "+(i+1)+" estudiante: ");
            nombre[i] = scanner.nextLine();
            System.out.print("Ingrese la edad del "+(i+1)+" estudiante: ");
            edad[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese las iniciales de la Universidad del "+(i+1)+" estudiante: ");
            universidad[i] = scanner.nextLine();
        }

        // Establecer
        datos.setNombre(nombre);
        datos.setEdad(edad);
        datos.setUniversidad(universidad);

        // Imprimir
        datos.presentar();
    }
}
