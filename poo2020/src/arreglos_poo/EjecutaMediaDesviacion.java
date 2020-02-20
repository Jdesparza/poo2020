package arreglos_poo;

import java.util.Scanner;

public class EjecutaMediaDesviacion {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        int [] numeros = new int[15];

        // Creacion de objeto
        MediaDesviacion mediaDesviacion = new MediaDesviacion();

        // Datos por teclado y lectura
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el "+(i+1)+" valor para el arreglo numeros: ");
            numeros[i] = scanner.nextInt();
        }

        // Establecer
        mediaDesviacion.setNumeros(numeros);

        // Calcular
        mediaDesviacion.calcularMedia();
        mediaDesviacion.calcularDesviacion();

        // Imprimir
        System.out.println("Arreglo\tDesviacion");
        mediaDesviacion.presentar();
        System.out.println("La media es: "+mediaDesviacion.getMedia());

    }
}
