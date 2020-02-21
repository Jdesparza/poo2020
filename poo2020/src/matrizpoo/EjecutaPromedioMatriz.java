package matrizpoo;

import java.util.Scanner;

public class EjecutaPromedioMatriz {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Creación de objeto
        PromedioMatriz promedioMatriz = new PromedioMatriz();

        // Declaración de variables
        int filas;
        int columnas;

        // Datos por teclado y lectura
        System.out.print("Ingrese el tamaño para las filas: ");
        filas = scanner.nextInt();
        System.out.print("Ingrese el tamaño para las columnas: ");
        columnas = scanner.nextInt();
        System.out.println("Ingreso de datos");

        int [][] matrizA = new int[filas][columnas]; // Declaracion de matriz

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el número para la posición "+i+""+j+": ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Establecer
        promedioMatriz.setFilas(filas);
        promedioMatriz.setColumnas(columnas);
        promedioMatriz.setMatrizA(matrizA);

        // Calcular
        promedioMatriz.sumaMatriz();

        // Imprimir
        promedioMatriz.presentarMatriz(matrizA);
        System.out.println("La suma de toda la matriz es: "+promedioMatriz.getSumaMatriz());
        System.out.println("El promedio Final es: "+promedioMatriz.promedioSumaMatriz());
    }
}
