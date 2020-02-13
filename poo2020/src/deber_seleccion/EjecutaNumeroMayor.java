package deber_seleccion;

import java.util.Scanner;

public class EjecutaNumeroMayor {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de atributos
        int numA;
        int numB;
        int numC;
        int numD;

        // Creación de objeto
        NumeroMayor numeroMayor = new NumeroMayor();

        // Datos por teclado
        System.out.print("Ingrese el Primer número: ");
        numA = scanner.nextInt();
        System.out.print("Ingrese el Segundo número: ");
        numB = scanner.nextInt();
        System.out.print("Ingrese el Tercer número: ");
        numC = scanner.nextInt();
        System.out.print("Ingrese el Cuarto número: ");
        numD = scanner.nextInt();

        // Establecer
        numeroMayor.setNumA(numA);
        numeroMayor.setNumB(numB);
        numeroMayor.setNumC(numC);
        numeroMayor.setNumD(numD);

        // Calcular
        numeroMayor.calcularNumMayor();

        // se imprime los resultados
        System.out.println(numeroMayor.getNumMayor());
    }
}
