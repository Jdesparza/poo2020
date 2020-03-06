package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        // Creación de una lista en java
        // para almacenar valores de tipo Vehiculo
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        // Declaración de bariables
        boolean bandera = true;
        int opcion;

        // Declaracion de Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE INGRESO DE ESTUDIANTES");
        do {
            // Menú de opciones
            System.out.println("|---------------MENÚ-------------|");
            System.out.println("| 1. Almacenar nuevo             |");
            System.out.println("| 2. Para presentar              |");
            System.out.println("| 3. Salir                       |");
            System.out.println("|--------------------------------|");
            System.out.print("Digite la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Creacion de objeto Estudiante
                    Estudiante estudiante = new Estudiante();

                    // Datos por teclado de la información de los estudiantes
                    System.out.print("Ingresar el nombre del estudiante: ");
                    estudiante.setNombre(scanner.nextLine());
                    System.out.print("Ingresar la cedula del estudiante: ");
                    estudiante.setCedula(scanner.nextLine());
                    System.out.print("Ingresar la edad del estudiante: ");
                    estudiante.setEdad(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Ingresar la carrera del estudiante: ");
                    estudiante.setCarrera(scanner.nextLine());
                    System.out.print("Ingresar el correo del estudiante: ");
                    estudiante.setCorreo(scanner.nextLine());

                    // agregamos objeto estudiante a la lista
                    estudiantes.add(estudiante);
                    break;
                case 2:
                    System.out.println("FICHAS DE ESTUDIANTES REGISTRADOS");
                    for (Estudiante e : estudiantes) {
                        System.out.println("--------------------------------");
                        System.out.println("Nombre: "+e.getNombre());
                        System.out.println("Cedula: "+e.getCedula());
                        System.out.println("Edad: "+ e.getEdad());
                        System.out.println("Carrera: "+ e.getCarrera());
                        System.out.println("Correo: "+ e.getCorreo());
                        System.out.println("--------------------------------");
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (bandera);

    }
}
