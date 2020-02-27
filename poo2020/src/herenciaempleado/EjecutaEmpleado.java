package herenciaempleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre, cargo, dependencia;
        int opcion, horas;
        double cuota, valor_mensual;

        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Calcular sueldo de: ");
        System.out.println("1. Empleado por hora");
        System.out.println("2. Empleado con salario");
        System.out.print("Ingrese una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                // Datos por teclado y lectura para la clase EmpleadoPorHora
                System.out.println("Empleado por hora");
                System.out.print("Ingrese nombre del empleado: ");
                nombre = scanner.nextLine();
                System.out.print("Ingrese el cargo: ");
                cargo = scanner.nextLine();
                System.out.print("Ingrese la dependencia: ");
                dependencia = scanner.nextLine();
                System.out.print("ingrese las horas trabajadas del empleado: ");
                horas = scanner.nextInt();
                scanner.nextLine();
                System.out.print("ingrese la cuota por hora: ");
                cuota = scanner.nextDouble();
                scanner.nextLine();

                // Creacion de objeto de la clase EmpleadoPorHora
                EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora(nombre, cargo, dependencia, horas, cuota);

                // Calcular
                empleadoPorHora.calcularSueldo();

                // Imprimir
                System.out.println("Datos del empleado");
                System.out.println("Nombre: "+empleadoPorHora.getNombre());
                System.out.println("Cargo: "+ empleadoPorHora.getCargo());
                System.out.println("Dependencia: "+ empleadoPorHora.getDependencia());
                System.out.print("El sueldo del empleado es: "+empleadoPorHora.getSueldo());
                break;
            case 2:
                // Datos por teclado y lectura para la clase EmpleadoAsalariado
                System.out.println("Empleado Asalariado");
                System.out.print("Ingrese nombre del empleado: ");
                nombre = scanner.nextLine();
                System.out.print("Ingrese el cargo: ");
                cargo = scanner.nextLine();
                System.out.print("Ingrese la dependencia: ");
                dependencia = scanner.nextLine();
                System.out.print("Ingrese el sueldo mensual: ");
                valor_mensual = scanner.nextDouble();
                scanner.nextLine();
                // Creacion de objeto de la clase EmpleadoPorHora
                EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(nombre, cargo,
                        dependencia, valor_mensual);

                // Imprimir
                System.out.println("Datos del empleado");
                System.out.println("Nombre: "+empleadoAsalariado.getNombre());
                System.out.println("Cargo: "+ empleadoAsalariado.getCargo());
                System.out.println("Dependencia: "+ empleadoAsalariado.getDependencia());
                System.out.print("El sueldo del empleado es: "+empleadoAsalariado.getValor_mensual());
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}
