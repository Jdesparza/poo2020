package disenio_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de atributos
        String nombre;
        double horas;
        double cuota;
        double sueldo;

        // Datos por teclado
        System.out.print("Ingrese el nombre del Empleado: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese cuantas horas a trabajado el empleado: ");
        horas = scanner.nextDouble();
        System.out.print("Ingrese la cuota por hora de trabajo: ");
        cuota = scanner.nextDouble();

        // Creación de objeto
        Empleado empleado = new Empleado();

        empleado.establecerNombre(nombre);
        empleado.establecerHoras(horas);
        empleado.establecerCuota(cuota);
        empleado.calcularSueldo();

        // se imprime los resultados
        System.out.println(empleado.obtenerNombre());
        System.out.println(empleado.obtenerSueldo());
    }
}
