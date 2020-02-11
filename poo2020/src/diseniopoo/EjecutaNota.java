package diseniopoo;

import java.util.Scanner;

public class EjecutaNota {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Datos por teclado
        System.out.print("Ingrese el nombre del Estudiante: ");
        String nombre_estudiante = scanner.nextLine();
        System.out.print("Ingrese el nombre de la Asignatura: ");
        String asignatura = scanner.nextLine();
        System.out.print("Ingrese la nota del Primer Bimestre del Estuadiante: ");
        double nota_1bim = scanner.nextDouble();
        System.out.print("Ingrese la nota del Segundo Bimestre del Estuadiante: ");
        double nota_2bim = scanner.nextDouble();

        // Creación de objeto
        Nota nota = new Nota(nombre_estudiante, asignatura, nota_1bim, nota_2bim);

        // Presentación de resultados
        nota.presentar_nota();
    }
}
