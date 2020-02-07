package Disenopoo;

import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Datos por teclado
        System.out.print("Ingrese el precio de la Cerveza: ");
        Double precio = scanner.nextDouble();
        System.out.print("Ingrese el numero de unidades vendidas de cerveza: ");
        int unidades_vendidas = scanner.nextInt();
        scanner.nextLine(); // se limpia el buffer
        System.out.print("Ingrese el nombre de la Cerveza: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo de Cerveza: ");
        String tipo = scanner.nextLine();

        // Creación de objeto, con inizializacion de variables
        Cerveza cerveza = new Cerveza(precio, unidades_vendidas, nombre, tipo);

        System.out.println(cerveza.presentar_total());


    }
}
