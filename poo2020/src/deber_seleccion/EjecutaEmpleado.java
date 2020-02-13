package deber_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de atributos
        String nombre;
        int horas;
        double cuota;

        // Creación de objeto
        Empleado empleado = new Empleado();

        // Datos por teclado
        System.out.print("Ingrese el nombre del Empleado: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese cuantas horas a trabajado el empleado: ");
        horas = scanner.nextInt();
        System.out.print("Ingrese la cuota por hora de trabajo: ");
        cuota = scanner.nextDouble();

        // Establecer
        empleado.setNombre(nombre);
        empleado.setHoras(horas);
        empleado.setCuota(cuota);

        // Calcular
        empleado.calcularSueldo();

        // se imprime los resultados
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getSueldo());
    }
}
