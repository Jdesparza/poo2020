package herenciainversionistas;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        // Declaración de Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        int noCuenta, plazoInversion, opcion;
        int noCliente = 0;
        String nombre;
        double capInvertido;
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
                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Cuenta de Ahorros");
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    noCuenta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el capital que invirtio el cliente: ");
                    capInvertido = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    plazoInversion = scanner.nextInt();
                    scanner.nextLine();

                    // Creación de objeto de la clase CuentaAhorro
                    CuentaAhorro cuentaAhorro = new CuentaAhorro(noCliente, nombre, noCuenta,
                            capInvertido, plazoInversion);

                    // Calcular
                    cuentaAhorro.calcularInteresGanado();

                    // Guardar datos para presentar
                    cad = String.format("%s%d\t\t\t\t%s\t\t%d\t\t%.2f\n", cad, cuentaAhorro.getNoCliente(),
                            cuentaAhorro.getNombre(), cuentaAhorro.getNoCuenta(), cuentaAhorro.getInteresGanado());
                    // Suma total del interes ganado
                    totalInteresGanado += cuentaAhorro.getInteresGanado();
                    break;
                case 2:
                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Pagare");
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    noCuenta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el capital que invirtio el cliente: ");
                    capInvertido = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    plazoInversion = scanner.nextInt();
                    scanner.nextLine();

                    // Creación de objeto de la clase Pagare
                    Pagare pagare = new Pagare(noCliente, nombre, noCuenta,
                            capInvertido, plazoInversion);

                    // Calcular
                    pagare.calcularInteresGanado();

                    // Guardar datos para presentar
                    cad = String.format("%s%d\t\t\t\t%s\t\t%d\t\t%.2f\n", cad, pagare.getNoCliente(),
                            pagare.getNombre(), pagare.getNoCuenta(), pagare.getInteresGanado());
                    // Suma total del interes ganado
                    totalInteresGanado += pagare.getInteresGanado();
                    break;
                case 3:
                    // Incremento del noCliente
                    noCliente += 1;

                    // Datos por teclado y lectura
                    System.out.println("Cuenta Maestra");
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el No. Cuenta del cliente: ");
                    noCuenta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el capital que invirtio el cliente: ");
                    capInvertido = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el plazo de la inversión: ");
                    plazoInversion = scanner.nextInt();
                    scanner.nextLine();

                    // Creación de objeto de la clase Pagare
                    CuentaMaestra cuentaMaestra = new CuentaMaestra(noCliente, nombre, noCuenta,
                            capInvertido, plazoInversion);

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
