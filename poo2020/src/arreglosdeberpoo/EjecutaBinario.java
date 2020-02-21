package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaBinario {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String numBinario;

        // Creacion de objeto
        Binario binario = new Binario();

        // Datos por teclado y lectura
        System.out.print("Ingrese el número binario con un tamaño máximo de 6: ");
        numBinario = scanner.nextLine();

        // Establecer
        binario.setNumBinario(numBinario);

        // Calcular
        binario.transformarDato();
        binario.convertirBinario();

        // Imprimir
        binario.presentar();
    }
}
