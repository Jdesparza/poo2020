package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaEmpleados {
    public static void main(String[] args) {
        // Declaración de Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String rfc, nombre, departamento, puesto;
        int opcion, trab_mecanico, autos_vendedor, i;
        int total_empleados = 0;
        double totalSueldoQuincenal = 0;
        double sueldoMensual, salarioMinimo;
        boolean nuevoEmpleado = true;
        String cad = "";

        do {
            // Imprimir menú de opciones
            System.out.println("----------EMPRESA AUTOMOTRIZ----------");
            System.out.println("| Calcular sueldo de:                |");
            System.out.println("| 1. Empleado administrativo         |");
            System.out.println("| 2. Empleado mecánico               |");
            System.out.println("| 3. Empleado vendedor               |");
            System.out.println("| 4. Salir y mostrar reporte         |");
            System.out.println("--------------------------------------");
            // Datos por teclado y lectura
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el Registro Federal de causantes: ");
                    rfc = scanner.nextLine();
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el departamento en el que trabaja el empleado: ");
                    departamento = scanner.nextLine();
                    System.out.print("Ingrese el puesto que ocupa el empleado: ");
                    puesto = scanner.nextLine();
                    System.out.print("Ingrese el sueldo mensual del empleado: ");
                    sueldoMensual = scanner.nextDouble();
                    scanner.nextLine();

                    // Creación de objeto de la clase EmpAdmvo
                    EmpAdmvo empAdmvo = new EmpAdmvo(rfc, nombre, departamento, puesto, sueldoMensual);

                    // Calcular
                    empAdmvo.calcularSueldoQuincenal();

                    // Guardar dato para presentar
                    cad = String.format("%s%s\t%s\t%s\t%s\t%.2f\n", cad, empAdmvo.getRfc(), empAdmvo.getNombre(),
                            empAdmvo.getDepartamento(), empAdmvo.getPuesto(), empAdmvo.getSueldoQuincena());
                    // Incremento del contador de empleados
                    total_empleados += 1;
                    // Suma total del sueldo quincenal
                    totalSueldoQuincenal += empAdmvo.getSueldoQuincena();
                    break;
                case 2:
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el Registro Federal de causantes: ");
                    rfc = scanner.nextLine();
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el departamento en el que trabaja el empleado: ");
                    departamento = scanner.nextLine();
                    System.out.print("Ingrese el puesto que ocupa el empleado: ");
                    puesto = scanner.nextLine();
                    System.out.print("Ingrese la catidad de trabajos que realizo el empleado: ");
                    trab_mecanico = scanner.nextInt();
                    scanner.nextLine();

                    // Declaración de arreglo
                    double [] precio_mecanico = new double[trab_mecanico];

                    for (i = 0; i < trab_mecanico; i++) {
                        System.out.print("Ingrese el costo del "+(i+1)+" trabajo: ");
                        precio_mecanico[i] = scanner.nextDouble();

                    }

                    // Creación de objeto de la clase EmpMecanico
                    EmpMecanico empMecanico = new EmpMecanico(rfc, nombre, departamento, puesto,
                            trab_mecanico, precio_mecanico);

                    // Calcular
                    empMecanico.sumaPrecio();
                    empMecanico.calcularSueldoQuincenal();

                    // Guardar dato para presentar
                    cad = String.format("%s%s\t%s\t%s\t%s\t%.2f\n", cad, empMecanico.getRfc(), empMecanico.getNombre(),
                            empMecanico.getDepartamento(), empMecanico.getPuesto(), empMecanico.getSueldoQuincenal());
                    // Incremento del contador de empleados
                    total_empleados += 1;
                    // Suma total del sueldo quincenal
                    totalSueldoQuincenal += empMecanico.getSueldoQuincenal();
                    break;
                case 3:
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el Registro Federal de causantes: ");
                    rfc = scanner.nextLine();
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el departamento en el que trabaja el empleado: ");
                    departamento = scanner.nextLine();
                    System.out.print("Ingrese el puesto que ocupa el empleado: ");
                    puesto = scanner.nextLine();
                    System.out.print("Ingrese el salario minimo del empleado: ");
                    salarioMinimo = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese la catidad de autos que vendio el empleado: ");
                    autos_vendedor = scanner.nextInt();
                    scanner.nextLine();

                    // Declaración de arreglo
                    double [] precio_vendedor = new double[autos_vendedor];

                    for (i = 0; i < autos_vendedor; i++) {
                        System.out.print("Ingrese el costo del "+(i+1)+" auto vendido: ");
                        precio_vendedor[i] = scanner.nextDouble();
                    }

                    // Creación de objeto de la clase EmpMecanico
                    EmpVendedor empVendedor = new EmpVendedor(rfc, nombre, departamento, puesto,
                            autos_vendedor, precio_vendedor, salarioMinimo);
                    // Calcular
                    empVendedor.sumaPrecio();
                    empVendedor.calcularSueldoQuincenal();

                    // Guardar dato para presentar
                    cad = String.format("%s%s\t%s\t%s\t%s\t%.2f\n", cad, empVendedor.getRfc(), empVendedor.getNombre(),
                            empVendedor.getDepartamento(), empVendedor.getPuesto(), empVendedor.getSueldoQuincenal());
                    // Incremento del contador de empleados
                    total_empleados += 1;
                    // Suma total del sueldo quincenal
                    totalSueldoQuincenal += empVendedor.getSueldoQuincenal();
                    break;
                case 4:
                    nuevoEmpleado = false;
                    // Imprimir
                    System.out.println("\tREPORTE DE NÓMINA QUINCENAL");
                    System.out.println("RFC\tNOMBRE\tDEPARTAMENTO\tPUESTO\tSUELDO QUINCENA");
                    System.out.println(cad);
                    System.out.println("TOTAL "+total_empleados+" EMPLEADOS\t\t\t\t\t\t"+totalSueldoQuincenal);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (nuevoEmpleado == true);
    }
}
