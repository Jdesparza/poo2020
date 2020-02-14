package diseno_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoFor {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        int horas;
        double cuota;
        String opcion;
        int nuevoEmpleado;

        // Datos por teclado y lectura
        System.out.print("Ingrese la cuota por hora de trabajo: ");
        cuota = scanner.nextDouble();
        // Limpieza de buffer
        scanner.nextLine();

        // En caso de querer ingresar datos
        System.out.print("Desea calcular el sueldo de un empleado si/no: ");
        opcion = scanner.nextLine();
        if (opcion.equals("si")) {
            System.out.print("El sueldo de cuantos empleados desea calcular: ");
            nuevoEmpleado = scanner.nextInt();
            // Limpieza de buffer
            scanner.nextLine();

            for (int contador = 0; contador < nuevoEmpleado; contador++){
                // Datos por teclado y lectura
                System.out.print("Ingrese el nombre del empleado: ");
                nombre = scanner.nextLine();
                System.out.print("Ingrese cuantas horas ha trabajado el empleado: ");
                horas = scanner.nextInt();
                // Limpieza de buffer
                scanner.nextLine();
                // Creación de objeto
                Empleado empleado = new Empleado(nombre, horas);
                empleado.setCuota(cuota);
                empleado.calcularSueldo();
                // imprimir
                System.out.println("Empleado "+(contador+1));
                System.out.println(empleado.getNombre());
                System.out.println(empleado.getSueldo());
            }
        } else {
            if (opcion.equals("no")) {
                System.out.println("Ud. ha decidido no ingresar datos");
            } else {
                // en caso de que ingrese una opcion que no sea si/no
                System.out.println("Opcion no valida");
            }
        }

    }
}
