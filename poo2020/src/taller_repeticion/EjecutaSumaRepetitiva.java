package taller_repeticion;

import java.util.Scanner;

public class EjecutaSumaRepetitiva {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de atributos
        int numA;
        int numB;
        boolean nuevaMultiplicacion;
        String opcion;

        // Inicialización de bandera
        nuevaMultiplicacion = true;

        // En caso de querer realizar una múltiplicación
        System.out.print("Desea calcular la múltiplicación de dos números a través de la suma repetitiva si/no: ");
        opcion = scanner.nextLine();
        if (opcion.equals("si")) {
            nuevaMultiplicacion = true;
        } else {
            if (opcion.equals("no")) {
                System.out.println("Ud. ha decidido no realizar la operación");
                nuevaMultiplicacion = false;
            } else {
                System.out.println("Opción no valida");
                nuevaMultiplicacion = false;
            }
        }

        while (nuevaMultiplicacion == true) {
            // Datos por teclado y lectura
            System.out.print("Ingrese el Primer número: ");
            numA = scanner.nextInt();
            System.out.print("Ingrese el Segundo número: ");
            numB = scanner.nextInt();
            scanner.nextLine();

            // Creación de objeto
            SumaRepetitiva sumaRepetitiva = new SumaRepetitiva();
            sumaRepetitiva.setNumA(numA);
            sumaRepetitiva.setNumB(numB);
            sumaRepetitiva.calcularSumaRepetitiva();

            // Imprimir
            System.out.println(sumaRepetitiva.getMultiplicacion());

            // En caso de querer realizar una múltiplicación
            System.out.print("Desea calcular la múltiplicación de otros dos números a través de la " +
                    "suma repetitiva si/no: ");
            opcion = scanner.nextLine();
            if (opcion.equals("si")) {
                nuevaMultiplicacion = true;
            } else {
                if (opcion.equals("no")) {
                    System.out.println("Ud. ha decidido no realizar la operación");
                    nuevaMultiplicacion = false;
                } else {
                    System.out.println("Opción no valida");
                    nuevaMultiplicacion = false;
                }
            }
        }
    }
}
