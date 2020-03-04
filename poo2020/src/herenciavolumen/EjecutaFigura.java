package herenciavolumen;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        double arista, radio, altura;
        boolean nuevaFigura;
        int opcion;

        // Inicialización de bandera
        nuevaFigura = true;

        do {
            // Imprimir menú de opciones
            System.out.println("-----AREA FIGURA-----");
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
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la arista del cubo: ");
                    arista = scanner.nextDouble();
                    scanner.nextLine();
                    // Creacion de objeto de la clase Cubo
                    Cubo cubo = new Cubo(nombre, arista);
                    // Calcular
                    cubo.calcularVolumen();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+cubo.getNombre());
                    System.out.println("\tY su volumen es: "+cubo.getVolumen());
                    System.out.println();
                    break;
                case 2:

                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el radio del cilindro: ");
                    radio = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del cilindro: ");
                    altura = scanner.nextDouble();
                    scanner.nextLine();
                    // Creacion de objeto de la clase Cilindro
                    Cilindro cilindro = new Cilindro(nombre, altura, radio);
                    // Calcular
                    cilindro.calcularVolumen();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+cilindro.getNombre());
                    System.out.println("\tY su volumen es: "+cilindro.getVolumen());
                    System.out.println();
                    break;
                case 3:
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el radio del cono: ");
                    radio = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del cono: ");
                    altura = scanner.nextDouble();
                    scanner.nextLine();
                    // Creación de objeto de la clase Cono
                    Cono cono = new Cono(nombre, altura, radio);
                    // Calcular
                    cono.calcularVolumen();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+cono.getNombre());
                    System.out.println("\tY su volumen es: "+cono.getVolumen());
                    System.out.println();
                    break;
                case 4:
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el radio de la esfera: ");
                    radio = scanner.nextDouble();
                    scanner.nextLine();
                    // Creación de objeto de la clase Circulo
                    Esfera esfera = new Esfera(nombre, radio);
                    // Calcular
                    esfera.calcularVolumen();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+esfera.getNombre());
                    System.out.println("\tY su volumen es: "+esfera.getVolumen());
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
