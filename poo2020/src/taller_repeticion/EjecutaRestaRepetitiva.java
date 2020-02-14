package taller_repeticion;

import java.util.Scanner;

public class EjecutaRestaRepetitiva {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de atributos
        int dividendo;
        int divisor;
        boolean nuevaDivision;
        String opcion;

        // Inicialización de bandera
        nuevaDivision = true;

        // En caso de querer realizar una division
        System.out.print("Desea calcular la división de dos números a través de la resta repetitiva si/no: ");
        opcion = scanner.nextLine();
        if (opcion.equals("si")) {
            nuevaDivision = true;
        } else {
            if (opcion.equals("no")) {
                System.out.println("Ud. ha decidido no realizar la operación");
                nuevaDivision = false;
            } else {
                System.out.println("Opción no valida");
                nuevaDivision = false;
            }
        }

        while (nuevaDivision == true) {
            // Datos por teclado y lectura
            System.out.print("Ingrese el Dividendo: ");
            dividendo= scanner.nextInt();
            System.out.print("Ingrese el Divisor: ");
            divisor = scanner.nextInt();
            scanner.nextLine();

            // Creación de objeto
            RestaRepetitiva restaRepetitiva = new RestaRepetitiva();
            restaRepetitiva.setDividendo(dividendo);
            restaRepetitiva.setDivisor(divisor);
            restaRepetitiva.calcularSumaRepetitiva();

            // Imprimir
            System.out.println("El resultado de la division es: "+restaRepetitiva.getDivision());

            // En caso de querer realizar otra division
            System.out.print("Desea calcular la división de otros dos números a través de la " +
                    "resta repetitiva si/no: ");
            opcion = scanner.nextLine();
            if (opcion.equals("si")) {
                nuevaDivision = true;
            } else {
                if (opcion.equals("no")) {
                    System.out.println("Ud. ha decidido no realizar la operación");
                    nuevaDivision = false;
                } else {
                    System.out.println("Opción no valida");
                    nuevaDivision = false;
                }
            }
        }
    }
}
