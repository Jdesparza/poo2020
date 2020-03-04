package polimorfismofigura;

import java.util.Scanner;

public class EjecutaFigura3 {
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
                    // Creacion de objeto de la clase Triangulo3
                    Triangulo3 triangulo3 = new Triangulo3();

                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    triangulo3.setNomFigura(scanner.nextLine());
                    System.out.print("Ingrese la base del triángulo: ");
                    triangulo3.setBaseTria(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del triángulo: ");
                    triangulo3.setAlturaTria(scanner.nextDouble());
                    scanner.nextLine();
                    // Calcular
                    triangulo3.calcularArea();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+triangulo3.getNomFigura());
                    System.out.println("\tY su area es: "+triangulo3.getArea());
                    System.out.println();
                    break;
                case 2:
                    // Creacion de objeto de la clase Rectangulo3
                    Rectangulo3 rectangulo3 = new Rectangulo3();

                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    rectangulo3.setNomFigura(scanner.nextLine());
                    System.out.print("Ingrese la base del rectangulo: ");
                    rectangulo3.setBase(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    rectangulo3.setAltura(scanner.nextDouble());
                    scanner.nextLine();
                    // Calcular
                    rectangulo3.calcularArea();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+rectangulo3.getNomFigura());
                    System.out.println("\tY su area es: "+rectangulo3.getArea());
                    System.out.println();
                    break;
                case 3:
                    // Creación de objeto de la clase Circulo3
                    Circulo3 circulo3 = new Circulo3();

                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    circulo3.setNomFigura(scanner.nextLine());
                    System.out.print("Ingrese el radio del circulo: ");
                    circulo3.setRadio(scanner.nextDouble());
                    scanner.nextLine();
                    // Calcular
                    circulo3.calcularArea();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+circulo3.getNomFigura());
                    System.out.println("\tY su area es: "+circulo3.getArea());
                    System.out.println();
                    break;
                case 4:
                    // Creación de objeto de la clase Circulo3
                    Cuadrado3 cuadrado3 = new Cuadrado3();
                    // Datos por teclado y lectura
                    System.out.print("Ingrese el nombre de la figura: ");
                    cuadrado3.setNomFigura(scanner.nextLine());
                    System.out.print("Ingrese el valor del lado del cuadrado: ");
                    cuadrado3.setLado(scanner.nextDouble());
                    scanner.nextLine();
                    // Calcular
                    cuadrado3.calcularArea();
                    // Imprimir
                    System.out.println("El nombre de la figura es: "+cuadrado3.getNomFigura());
                    System.out.println("\tY su area es: "+cuadrado3.getArea());
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
