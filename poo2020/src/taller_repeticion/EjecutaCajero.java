package taller_repeticion;

import javax.swing.*;
import java.util.Scanner;

public class EjecutaCajero {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de atributos
        String nombre;
        double saldo;
        boolean nuevoCajero;
         boolean menuCajero;
        int opcion;

        // Inicialización de banderas
        nuevoCajero = true;
        menuCajero = true;

        // Datos por teclado y lectura
        System.out.print("Ingrese el nombre del socio: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        //Creacion del objeto
        Cajero cajero = new Cajero();

        // Establecer datos
        cajero.setNombre(nombre);
        cajero.setSaldo(saldo);

        // Imprimir menú del cajero
        cajero.opcionesCajero();

        System.out.print("Desea que le muestre el menu de opciones nuevamente si/no: ");
        String menu = scanner.nextLine();
        if (menu.equals("si")){
            menuCajero = true;
        } else {
            menuCajero = false;
        }

        while (nuevoCajero == true) {
            System.out.print("Ingrese una de las opciones del menú: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el saldo a depositar: ");
                    int saldoDepositar = scanner.nextInt();
                    scanner.nextLine();
                    cajero.depositar(saldoDepositar);
                    System.out.println(cajero.getNombre()+" su saldo ahora es de: "+ cajero.getSaldo());
                    if (menuCajero == true) {
                        cajero.opcionesCajero();
                    }
                    break;

                case 2:

                    System.out.print("Ingrese el saldo a rerirar: ");
                    int saldoRetirar = scanner.nextInt();
                    scanner.nextLine();
                    cajero.retirar(saldoRetirar);
                    System.out.println(cajero.getNombre()+" su saldo ahora es de: "+ cajero.getSaldo());
                    if (menuCajero == true) {
                        cajero.opcionesCajero();
                    }
                    break;

                case 3:
                    System.out.println(cajero.getNombre()+" el saldo de su cuenta es de: "+ cajero.getSaldo());
                    if (menuCajero == true) {
                        cajero.opcionesCajero();
                    }
                    break;

                case 4:
                    System.out.println("Gracias por Preferirnos");
                    nuevoCajero = false;
                    break;
                default:
                    System.out.println("Opción Incorrecta");

            }

        }
    }
}
