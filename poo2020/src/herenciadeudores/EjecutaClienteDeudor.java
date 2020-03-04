package herenciadeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        // Declaración de Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        int noCuenta, plazoInversion, opcion;
        int noCliente = 0;
        String nombre;
        double capPrestado;
        double totalInteresPagar = 0;
        boolean nuevoDeudor = true;
        String cad = "";

        do {
            // Imprimir menú de opciones
            System.out.println("-----------------BANCO----------------");
            System.out.println("| CALCULAR INTERES POR PAGAR         |");
            System.out.println("|    DE DEUDORES CON:                |");
            System.out.println("| 1. Prestamo Personal               |");
            System.out.println("| 2. Prestamo Hipotecario            |");
            System.out.println("| 3. Prestamo de Automóvil           |");
            System.out.println("| 4. Salir y Mostrar reporte         |");
            System.out.println("--------------------------------------");
            // Datos por teclado y lectura
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Prestamo Personal");
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    noCuenta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el capital prestado al cliente: ");
                    capPrestado = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    plazoInversion = scanner.nextInt();
                    scanner.nextLine();

                    // Creación de objeto de la clase PrestamoPersonal
                    PrestamoPersonal prestamoPersonal = new PrestamoPersonal(noCliente, nombre, noCuenta,
                            capPrestado, plazoInversion);

                    // Calcular
                    prestamoPersonal.calcularInteresPagar();

                    // Guardar datos para presentar
                    cad = String.format("%s%d\t\t\t\t%s\t\t%d\t\t%.2f\n", cad, prestamoPersonal.getNoCliente(),
                            prestamoPersonal.getNombre(), prestamoPersonal.getNoCuenta(),
                            prestamoPersonal.getInteresPagar());
                    // Suma total del interes por pagar
                    totalInteresPagar += prestamoPersonal.getInteresPagar();
                    break;
                case 2:
                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Prestamo Hipotecario");
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    noCuenta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el capital prestado al cliente: ");
                    capPrestado = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    plazoInversion = scanner.nextInt();
                    scanner.nextLine();

                    // Creación de objeto de la clase PrestamoPersonal
                    PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(noCliente, nombre, noCuenta,
                            capPrestado, plazoInversion);

                    // Calcular
                    prestamoHipotecario.calcularInteresPagar();

                    // Guardar datos para presentar
                    cad = String.format("%s%d\t\t\t\t%s\t\t%d\t\t%.2f\n", cad, prestamoHipotecario.getNoCliente(),
                            prestamoHipotecario.getNombre(), prestamoHipotecario.getNoCuenta(),
                            prestamoHipotecario.getInteresPagar());
                    // Suma total del interes por pagar
                    totalInteresPagar += prestamoHipotecario.getInteresPagar();
                    break;
                case 3:
                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Prestamo de automóvil");
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    noCuenta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el capital prestado al cliente: ");
                    capPrestado = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    plazoInversion = scanner.nextInt();
                    scanner.nextLine();

                    // Creación de objeto de la clase PrestamoPersonal
                    PrestamoAuto prestamoAuto = new PrestamoAuto(noCliente, nombre, noCuenta,
                            capPrestado, plazoInversion);

                    // Calcular
                    prestamoAuto.calcularInteresPagar();

                    // Guardar datos para presentar
                    cad = String.format("%s%d\t\t\t\t%s\t\t%d\t\t%.2f\n", cad, prestamoAuto.getNoCliente(),
                            prestamoAuto.getNombre(), prestamoAuto.getNoCuenta(),
                            prestamoAuto.getInteresPagar());
                    // Suma total del interes por pagar
                    totalInteresPagar += prestamoAuto.getInteresPagar();
                    break;
                case 4:
                    // Finalización de ciclo while
                    nuevoDeudor = false;
                    // Imprimir
                    System.out.println("\tREPORTE DE CLIENTES DEUDORES");
                    System.out.println("No.Cliente\t\tNombre\t\tNo.Cuenta\t\tInterés por pagar");
                    System.out.println(cad);
                    System.out.println("TOTAL "+noCliente+" CLIENTES\t\t\t\t\t\t"+totalInteresPagar);
                    break;
                default:
                    System.out.println("Opción Incorrecta");
            }
        } while (nuevoDeudor == true);
    }
}
