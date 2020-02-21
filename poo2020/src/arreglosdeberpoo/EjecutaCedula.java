package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String numCedula;

        // Creacion de objeto
        Cedula cedula = new Cedula();

        // Datos por teclado y lectura
        System.out.print("Ingrese el número de cédula: ");
        numCedula = scanner.nextLine();

        // Establecer
        cedula.setNumCedula(numCedula);

        // Calcular
        cedula.transformarDatos();
        cedula.calcularResultado();
        cedula.verificarResultado();
        cedula.verificarCedula();

        // Imprimir
        cedula.presentar();
    }
}
