package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleadoAutomotriz {
    public static void main(String[] args) {
        // Declaración de Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        int opcion, i;
        int total_empleados = 0;
        double totalSueldoQuincenal = 0;
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
                    // Creación de objeto de la clase EmpAdmvo
                    EmpAdmvo empAdmvo = new EmpAdmvo();

                    // Datos por teclado y lectura
                    System.out.print("Ingrese el Registro Federal de causantes: ");
                    empAdmvo.setRfc(scanner.nextLine());
                    System.out.print("Ingrese el nombre del empleado: ");
                    empAdmvo.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el departamento en el que trabaja el empleado: ");
                    empAdmvo.setDepartamento(scanner.nextLine());
                    System.out.print("Ingrese el puesto que ocupa el empleado: ");
                    empAdmvo.setPuesto(scanner.nextLine());
                    System.out.print("Ingrese el sueldo mensual del empleado: ");
                    empAdmvo.setSueldoMensual(scanner.nextDouble());
                    scanner.nextLine();

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
                    // Creación de objeto de la clase EmpMecanico
                    EmpMecanico empMecanico = new EmpMecanico();

                    // Datos por teclado y lectura
                    System.out.print("Ingrese el Registro Federal de causantes: ");
                    empMecanico.setRfc(scanner.nextLine());
                    System.out.print("Ingrese el nombre del empleado: ");
                    empMecanico.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el departamento en el que trabaja el empleado: ");
                    empMecanico.setDepartamento(scanner.nextLine());
                    System.out.print("Ingrese el puesto que ocupa el empleado: ");
                    empMecanico.setPuesto(scanner.nextLine());
                    System.out.print("Ingrese la catidad de trabajos que realizo el empleado: ");
                    empMecanico.setTrabajos(scanner.nextInt());
                    scanner.nextLine();

                    // Declaración de arreglo
                    double [] precio_mecanico = new double[empMecanico.getTrabajos()];


                    for (i = 0; i < empMecanico.getTrabajos(); i++) {
                        System.out.print("Ingrese el costo del "+(i+1)+" trabajo: ");
                        precio_mecanico[i] = scanner.nextDouble();

                    }

                    // Establecer
                    empMecanico.setPrecio(precio_mecanico);

                    // Calcular
                    empMecanico.sumaPrecio();
                    empMecanico.calcularSueldoQuincenal();

                    // Guardar dato para presentar
                    cad = String.format("%s%s\t%s\t%s\t%s\t%.2f\n", cad, empMecanico.getRfc(), empMecanico.getNombre(),
                            empMecanico.getDepartamento(), empMecanico.getPuesto(), empMecanico.getSueldoQuincena());
                    // Incremento del contador de empleados
                    total_empleados += 1;
                    // Suma total del sueldo quincenal
                    totalSueldoQuincenal += empMecanico.getSueldoQuincena();
                    break;
                case 3:
                    // Creación de objeto de la clase EmpVendedor
                    EmpVendedor empVendedor = new EmpVendedor();

                    // Datos por teclado y lectura
                    System.out.print("Ingrese el Registro Federal de causantes: ");
                    empVendedor.setRfc(scanner.nextLine());
                    System.out.print("Ingrese el nombre del empleado: ");
                    empVendedor.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el departamento en el que trabaja el empleado: ");
                    empVendedor.setDepartamento(scanner.nextLine());
                    System.out.print("Ingrese el puesto que ocupa el empleado: ");
                    empVendedor.setPuesto(scanner.nextLine());
                    System.out.print("Ingrese el salario minimo del empleado: ");
                    empVendedor.setSalarioMinimo(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese la catidad de autos que vendio el empleado: ");
                    empVendedor.setAutos(scanner.nextInt());
                    scanner.nextLine();

                    // Declaración de arreglo
                    double [] precio_vendedor = new double[empVendedor.getAutos()];

                    for (i = 0; i < empVendedor.getAutos(); i++) {
                        System.out.print("Ingrese el costo del "+(i+1)+" auto vendido: ");
                        precio_vendedor[i] = scanner.nextDouble();
                    }

                    // Establecer
                    empVendedor.setPrecio(precio_vendedor);

                    // Calcular
                    empVendedor.sumaPrecio();
                    empVendedor.calcularSueldoQuincenal();

                    // Guardar dato para presentar
                    cad = String.format("%s%s\t%s\t%s\t%s\t%.2f\n", cad, empVendedor.getRfc(), empVendedor.getNombre(),
                            empVendedor.getDepartamento(), empVendedor.getPuesto(), empVendedor.getSueldoQuincena());
                    // Incremento del contador de empleados
                    total_empleados += 1;
                    // Suma total del sueldo quincenal
                    totalSueldoQuincenal += empVendedor.getSueldoQuincena();
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
