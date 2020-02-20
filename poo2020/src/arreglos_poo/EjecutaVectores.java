package arreglos_poo;

import java.util.Scanner;

public class EjecutaVectores {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        int [] vectorA = new int[10];
        int [] vectorB = new int[10];

        // Creación de objeto
        Vectores vectores = new Vectores();

        // Datos por teclado y su respectiva lectura
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("Ingrese el "+(i+1)+" valor para el arreglo A: ");
            vectorA[i] = scanner.nextInt();
            System.out.print("Ingrese el "+(i+1)+" valor para el arreglo B: ");
            vectorB[i] = scanner.nextInt();
        }

        // Establecer
        vectores.setVectorA(vectorA);
        vectores.setVectorB(vectorB);

        // Calcular
        vectores.calcularSumatoriaProducto();

        // Imprimir
        System.out.println("Los vectores son:");
        System.out.println("VectorA\tVectorB");
        vectores.presentar();
        System.out.println("El producto final es: "+ vectores.getSumatoriaProducto());

    }
}
