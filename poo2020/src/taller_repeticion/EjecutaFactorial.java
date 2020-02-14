package taller_repeticion;

import java.util.Scanner;

public class EjecutaFactorial {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de atributos
        int numero;
        boolean nuevoNumero;
        String opcion;

        // Inicialización de bandera
        nuevoNumero = true;

        // En caso de querer ingresar un numero
        System.out.print("Desea calcular el factorial de un número si/no: ");
        opcion = scanner.nextLine();
        if (opcion.equals("si")) {
            nuevoNumero = true;
        } else {
            if (opcion.equals("no")) {
                System.out.println("Ud. ha decidido no ingresar un número");
                nuevoNumero = false;
            } else {
                System.out.println("Opción no valida");
                nuevoNumero = false;
            }
        }

        while (nuevoNumero == true) {
            // Datos por teclado y lectura
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            scanner.nextLine();

            // Creación de objeto
            Factorial factorial = new Factorial();
            factorial.setNumero(numero);
            factorial.calcularFactorial(numero);

            // imprimir
            System.out.println(factorial.getNumeroFactorial());

            // En caso de querer ingresar  más numeros
            System.out.print("Desea calcular el factorial de otro número si/no: ");
            opcion = scanner.nextLine();
            if (opcion.equals("si")) {
                nuevoNumero = true;
            } else {
                if (opcion.equals("no")) {
                    System.out.println("Ud. ha decidido no ingresar un número");
                    nuevoNumero = false;
                } else {
                    System.out.println("Opción no valida");
                    nuevoNumero = false;
                }
            }
        }
    }
}
