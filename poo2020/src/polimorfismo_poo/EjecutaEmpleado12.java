package polimorfismo_poo;

import herenciaempleado.EmpleadoAsalariado;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        // declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Obtener el sueldo quincenal de un empleado por horas
        EmpleadoPorHoras2 empleadoPorHoras2 = new EmpleadoPorHoras2();

        System.out.println("Calculo sueldo quincenal empleado por hora");
        System.out.print("Ingrese horas trabajadas: ");
        empleadoPorHoras2.setHorasTrab(scanner.nextInt());
        System.out.print("ingrese la cuota por hora: ");
        empleadoPorHoras2.setCuotaHora(scanner.nextDouble());
        empleadoPorHoras2.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: "+ empleadoPorHoras2.getSueldoQna());

        // Obtener el sueldo quincenal de un empleado asalariado
        EmpleadoAsalariado2 empleadoAsalariado2 = new EmpleadoAsalariado2();

        System.out.println("Calculo sueldo quincenal empleado por hora");
        System.out.print("Ingrese el sueldo mensual: ");
        empleadoAsalariado2.setSueldoMensual(scanner.nextDouble());
        empleadoAsalariado2.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: "+ empleadoAsalariado2.getSueldoQna());
    }
}
