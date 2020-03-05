package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaFiguraVolumen {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        boolean nuevaFigura;
        int opcion;

        // Inicialización de bandera
        nuevaFigura = true;

        do {
            // Imprimir menú de opciones
            System.out.println("-----Volumen FIGURA-----");
            System.out.println("| 1. Cubo           |");
            System.out.println("| 2. Cilindro       |");
            System.out.println("| 3. Cono           |");
            System.out.println("| 4. Esfera         |");
            System.out.println("| 5. Salir          |");
            System.out.println("---------------------");
            // Datos por teclado y lectura
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Creacion de objeto de la clase CuboVolumen
                    CuboVolumen cuboVolumen = new CuboVolumen();
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    cuboVolumen.setNombre(scanner.nextLine());
                    System.out.print("Ingrese la arista del cubo: ");
                    cuboVolumen.setArista(scanner.nextDouble());
                    scanner.nextLine();
                    // Calcular
                    cuboVolumen.calcularVolumen();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+cuboVolumen.getNombre());
                    System.out.println("\tY su volumen es: "+cuboVolumen.getVolumen());
                    System.out.println();
                    break;
                case 2:
                    // Creacion de objeto de la clase CilindroVolumen
                    CilindroVolumen cilindroVolumen = new CilindroVolumen();
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    cilindroVolumen.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el radio del cilindro: ");
                    cilindroVolumen.setRadio(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del cilindro: ");
                    cilindroVolumen.setAltura(scanner.nextDouble());
                    scanner.nextLine();
                    // Calcular
                    cilindroVolumen.calcularVolumen();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+cilindroVolumen.getNombre());
                    System.out.println("\tY su volumen es: "+cilindroVolumen.getVolumen());
                    System.out.println();
                    break;
                case 3:
                    // Creación de objeto de la clase ConoVolumen
                    ConoVolumen conoVolumen = new ConoVolumen();
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    conoVolumen.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el radio del cono: ");
                    conoVolumen.setRadio(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del cono: ");
                    conoVolumen.setAltura(scanner.nextDouble());
                    scanner.nextLine();
                    // Calcular
                    conoVolumen.calcularVolumen();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+conoVolumen.getNombre());
                    System.out.println("\tY su volumen es: "+conoVolumen.getVolumen());
                    System.out.println();
                    break;
                case 4:
                    // Creación de objeto de la clase CirculoVolumen
                    EsferaVolumen esferaVolumen = new EsferaVolumen();
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    esferaVolumen.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el radio de la esfera: ");
                    esferaVolumen.setRadio(scanner.nextDouble());
                    scanner.nextLine();
                    // Calcular
                    esferaVolumen.calcularVolumen();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+esferaVolumen.getNombre());
                    System.out.println("\tY su volumen es: "+esferaVolumen.getVolumen());
                    System.out.println();
                    break;
                case 5:
                    // Imprimir
                    System.out.println("Gracias");
                    // Finalización del ciclo while
                    nuevaFigura = false;
                    break;
                default:
                    System.out.println("Opción Incorrecta");
                    break;
            }
        } while (nuevaFigura == true);
    }
}
