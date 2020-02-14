package diseno_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoWhile {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        int horas;
        double cuota;
        String opcion;
        boolean nuevoEmpleado;

        // Datos por teclado y lectura
        System.out.print("Ingrese la cuota por hora de trabajo: ");
        cuota = scanner.nextDouble();
        // Limpieza de buffer
        scanner.nextLine();

        // Inicialización de bandera
        nuevoEmpleado = true;

        // En caso de querer ingresar datos
        System.out.print("Desea calcular el sueldo de un empleado si/no: ");
        opcion = scanner.nextLine();
        if (opcion.equals("si")) {
            nuevoEmpleado = true;
        } else {
            if (opcion.equals("no")) {
                System.out.println("Ud. ha decidido no ingresar datos");
                nuevoEmpleado = false;
            } else {
                System.out.println("Opción no valida");
                nuevoEmpleado = false;
            }
        }

        while (nuevoEmpleado == true){
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
            System.out.println(empleado.getNombre());
            System.out.println(empleado.getSueldo());
            // En caso de querer ingresar  más datos
            System.out.print("Desea calcular el sueldo de otro empleado si/no: ");
            opcion = scanner.nextLine();
            if (opcion.equals("si")) {
                nuevoEmpleado = true;
            } else {
                if (opcion.equals("no")) {
                    System.out.println("Ud. ha decidido no ingresar datos");
                    nuevoEmpleado = false;
                } else {
                    System.out.println("Opción no valida");
                    nuevoEmpleado = false;
                }
            }
        }
    }
}
