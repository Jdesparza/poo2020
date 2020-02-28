package herenciafigura;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        double base, altura, lado, radio;
        boolean nuevaFigura;
        int opcion;

        // Inicialización de bandera
        nuevaFigura = true;

        do {
            // Imprimir menú de opciones
            System.out.println("-----AREA FIGURA-----");
            System.out.println("| 1. Triángulo      |");
            System.out.println("| 2. Rectángulo     |");
            System.out.println("| 3. Circulo        |");
            System.out.println("| 4. Cuadrado       |");
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
                    System.out.print("Ingrese la base del triángulo: ");
                    base = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del triángulo: ");
                    altura = scanner.nextDouble();
                    scanner.nextLine();
                    // Creacion de objeto de la clase Triangulo
                    Triangulo triangulo = new Triangulo(nombre, base, altura);
                    // Calcular
                    triangulo.calcularArea();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+triangulo.getNombre());
                    System.out.println("\tY su area es: "+triangulo.getArea());
                    System.out.println();
                    break;
                case 2:

                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la base del rectangulo: ");
                    base = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    altura = scanner.nextDouble();
                    scanner.nextLine();
                    // Creacion de objeto de la clase Rectangulo
                    Rectangulo rectangulo = new Rectangulo(nombre, base, altura);
                    // Calcular
                    rectangulo.calcularArea();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+rectangulo.getNombre());
                    System.out.println("\tY su area es: "+rectangulo.getArea());
                    System.out.println();
                    break;
                case 3:
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el radio del circulo: ");
                    radio = scanner.nextDouble();
                    scanner.nextLine();
                    // Creación de objeto de la clase Circulo
                    Circulo circulo = new Circulo(nombre, radio);
                    // Calcular
                    circulo.calcularArea();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+circulo.getNombre());
                    System.out.println("\tY su area es: "+circulo.getArea());
                    System.out.println();
                    break;
                case 4:
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el valor del lado del cuadrado: ");
                    lado = scanner.nextDouble();
                    scanner.nextLine();
                    // Creación de objeto de la clase Circulo
                    Cuadrado cuadrado = new Cuadrado(nombre, lado);
                    // Calcular
                    cuadrado.calcularArea();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+cuadrado.getNombre());
                    System.out.println("\tY su area es: "+cuadrado.getArea());
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
