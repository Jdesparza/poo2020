package disenio_seleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de atributos
        int numero_dia;

        // Datos por teclado
        System.out.print("Ingrese el número del día: ");
        numero_dia = scanner.nextInt();

        // Creación de objeto
        Dia dia = new Dia();
        dia.setNumero_dia(numero_dia);
        dia.calcular_nombre_dia();

        // Imprimir los resultados
        System.out.println(dia.getNombre_dia());
    }
}
