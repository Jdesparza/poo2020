package matrizpoo;

import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        int [][] matrizA = new int[3][3];
        int [][] matrizB = new int[3][3];

        // Creacion de objeto
        Matriz matriz = new Matriz();

        // datos por teclado y lectura
        System.out.println("Matriz A: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("Ingrese el número para la posición "+i+""+j+": ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz B: ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print("Ingrese el número para la posición "+i+""+j+": ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Establecer
        matriz.setMatrizA(matrizA);
        matriz.setMatrizB(matrizB);

        // Calcular
        matriz.sumaMatriz();

        // Imprimir
        System.out.println("MATRIZ A");
        matriz.presentarMatriz(matrizA);
        System.out.println("MATRIZ B");
        matriz.presentarMatriz(matrizB);
        System.out.println("MATRIZ C");
        matriz.presentarMatriz(matriz.getSuma());
    }
}
