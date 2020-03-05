package polimorfismodeudores;

import java.util.Scanner;

public class EjecutaClientesDeudor {
    public static void main(String[] args) {
        // Declaración de Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        int opcion;
        int noCliente = 0;
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
                    // Creación de objeto de la clase PrestamoPersonal
                    PrestamoPersonal prestamoPersonal = new PrestamoPersonal();

                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Prestamo Personal");
                    System.out.print("Ingrese el nombre del cliente: ");
                    prestamoPersonal.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    prestamoPersonal.setNoCuenta(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingrese el capital prestado al cliente: ");
                    prestamoPersonal.setCapPrestado(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    prestamoPersonal.setPlazoInversion(scanner.nextInt());
                    scanner.nextLine();

                    // Establecer
                    prestamoPersonal.setNoCliente(noCliente);

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
                    // Creación de objeto de la clase PrestamoHipotecario
                    PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario();

                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Prestamo Hipotecario");
                    System.out.print("Ingrese el nombre del cliente: ");
                    prestamoHipotecario.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    prestamoHipotecario.setNoCuenta(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingrese el capital prestado al cliente: ");
                    prestamoHipotecario.setCapPrestado(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    prestamoHipotecario.setPlazoInversion(scanner.nextInt());
                    scanner.nextLine();

                    // Establecer
                    prestamoHipotecario.setNoCliente(noCliente);

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
                    // Creación de objeto de la clase PrestamoAuto
                    PrestamoAuto prestamoAuto = new PrestamoAuto();

                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Prestamo de automóvil");
                    System.out.print("Ingrese el nombre del cliente: ");
                    prestamoAuto.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    prestamoAuto.setNoCuenta(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingrese el capital prestado al cliente: ");
                    prestamoAuto.setCapPrestado(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    prestamoAuto.setPlazoInversion(scanner.nextInt());
                    scanner.nextLine();

                    // Establecer
                    prestamoAuto.setNoCliente(noCliente);

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
