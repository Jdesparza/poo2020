package deber_seleccion;

import java.util.Scanner;

public class EjecutaAlumno {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de atributos
        String nombre;
        double calificacion1;
        double calificacion2;
        double calificacion3;
        double calificacion4;

        // Creacion de objeto
        Alumno alumno = new Alumno();

        // Datos por teclado
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la Primera calificación del estudiante: ");
        calificacion1 = scanner.nextDouble();
        System.out.print("Ingrese la Segunda calificación del estudiante: ");
        calificacion2 = scanner.nextDouble();
        System.out.print("Ingrese la Tercera calificación del estudiante: ");
        calificacion3 = scanner.nextDouble();
        System.out.print("Ingrese la Cuarta calificación del estudiante: ");
        calificacion4 = scanner.nextDouble();

        // Establecer
        alumno.setNombre(nombre);
        alumno.setCalificacion1(calificacion1);
        alumno.setCalificacion2(calificacion2);
        alumno.setCalificacion3(calificacion3);
        alumno.setCalificacion4(calificacion4);

        // Calcular
        alumno.calcularPromedio();
        alumno.calcularObservacion();

        // Imprimir
        System.out.println(alumno.getNombre());
        System.out.println(alumno.getPromedio());
        System.out.println(alumno.getObservacion());
    }
}
