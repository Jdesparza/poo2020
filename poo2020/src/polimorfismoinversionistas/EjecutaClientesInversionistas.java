package polimorfismoinversionistas;

import java.util.Scanner;

public class EjecutaClientesInversionistas {
    public static void main(String[] args) {
        // Declaración de Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        int opcion;
        int noCliente = 0;
        double totalInteresGanado = 0;
        boolean nuevoInversionista = true;
        String cad = "";

        do {
            // Imprimir menú de opciones
            System.out.println("-----------------BANCO----------------");
            System.out.println("| CALCULAR INTERES GANADO DE         |");
            System.out.println("|    INVERSIONISTAS CON:             |");
            System.out.println("| 1. Cuenta de Ahorro                |");
            System.out.println("| 2. Pagare                          |");
            System.out.println("| 3. Cuenta Maestra                  |");
            System.out.println("| 4. Salir y Mostrar reporte         |");
            System.out.println("--------------------------------------");
            // Datos por teclado y lectura
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Creación de objeto de la clase CuentaAhorro
                    CuentaAhorro cuentaAhorro = new CuentaAhorro();

                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Cuenta de Ahorros");
                    System.out.print("Ingrese el nombre del cliente: ");
                    cuentaAhorro.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    cuentaAhorro.setNoCuenta(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingrese el capital que invirtio el cliente: ");
                    cuentaAhorro.setCapInvertido(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    cuentaAhorro.setPlazoInversion(scanner.nextInt());
                    scanner.nextLine();

                    // Establecer
                    cuentaAhorro.setNoCliente(noCliente);

                    // Calcular
                    cuentaAhorro.calcularInteresGanado();

                    // Guardar datos para presentar
                    cad = String.format("%s%d\t\t\t\t%s\t\t%d\t\t%.2f\n", cad, cuentaAhorro.getNoCliente(),
                            cuentaAhorro.getNombre(), cuentaAhorro.getNoCuenta(), cuentaAhorro.getInteresGanado());
                    // Suma total del interes ganado
                    totalInteresGanado += cuentaAhorro.getInteresGanado();
                    break;
                case 2:
                    // Creación de objeto de la clase Pagare
                    Pagare pagare = new Pagare();

                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Pagare");
                    System.out.print("Ingrese el nombre del cliente: ");
                    pagare.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    pagare.setNoCuenta(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingrese el capital que invirtio el cliente: ");
                    pagare.setCapInvertido(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    pagare.setPlazoInversion(scanner.nextInt());
                    scanner.nextLine();

                    // Establecer
                    pagare.setNoCliente(noCliente);

                    // Calcular
                    pagare.calcularInteresGanado();

                    // Guardar datos para presentar
                    cad = String.format("%s%d\t\t\t\t%s\t\t%d\t\t%.2f\n", cad, pagare.getNoCliente(),
                            pagare.getNombre(), pagare.getNoCuenta(), pagare.getInteresGanado());
                    // Suma total del interes ganado
                    totalInteresGanado += pagare.getInteresGanado();
                    break;
                case 3:
                    // Creación de objeto de la clase CuentaMaestra
                    CuentaMaestra cuentaMaestra = new CuentaMaestra();

                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Cuenta Maestra");
                    System.out.print("Ingrese el nombre del cliente: ");
                    cuentaMaestra.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    cuentaMaestra.setNoCuenta(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingrese el capital que invirtio el cliente: ");
                    cuentaMaestra.setCapInvertido(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    cuentaMaestra.setPlazoInversion(scanner.nextInt());
                    scanner.nextLine();

                    // Establecer
                    cuentaMaestra.setNoCliente(noCliente);

                    // Calcular
                    cuentaMaestra.calcularInteresGanado();

                    // Guardar datos para presentar
                    cad = String.format("%s%d\t\t\t\t%s\t\t%d\t\t%.2f\n", cad, cuentaMaestra.getNoCliente(),
                            cuentaMaestra.getNombre(), cuentaMaestra.getNoCuenta(), cuentaMaestra.getInteresGanado());
                    // Suma total del interes ganado
                    totalInteresGanado += cuentaMaestra.getInteresGanado();
                    break;
                case 4:
                    // Finalización del ciclo while
                    nuevoInversionista = false;
                    // Imprimir
                    System.out.println("\tREPORTE DE INVERSIONES");
                    System.out.println("No.Cliente\t\tNombre\t\tNo.Cuenta\t\tInterés ganado");
                    System.out.println(cad);
                    System.out.println("TOTAL "+noCliente+" INVERSIONES\t\t\t\t\t\t"+totalInteresGanado);
                    break;
                default:
                    System.out.println("Opción Incorrecta");
            }
        } while (nuevoInversionista == true);
    }
}
