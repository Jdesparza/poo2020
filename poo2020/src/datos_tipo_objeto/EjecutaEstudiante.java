package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Declaración de variables
        int contador;
        int opcion;
        Estudiante estudiante;
        boolean bandera = true;
        Estudiante [] estudiantes = new Estudiante[3];
        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        for (contador = 0; contador < estudiantes.length; contador++) {
            System.out.println("INGRESO DE NUEVO ESTUDIANTE");
            // Creacion de objeto de la clase estudiante
            Estudiante est = new Estudiante();
            // Datos por teclado de la información de los estudiantes
            System.out.print("Ingresar el nombre del estudiante: ");
            est.setNombre(scanner.nextLine());
            System.out.print("Ingresar la cedula del estudiante: ");
            est.setCedula(scanner.nextLine());
            System.out.print("Ingresar la edad del estudiante: ");
            est.setEdad(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Ingresar la carrera del estudiante: ");
            est.setCarrera(scanner.nextLine());
            System.out.print("Ingresar el correo del estudiante: ");
            est.setCorreo(scanner.nextLine());

            // Asignamos el objeto est a la variable estudiante
            estudiantes[contador] = est;

        }
        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("Cédula\tNombre");
        int edad_acumulador = 0;
        for (contador = 0; contador < estudiantes.length; contador++) {
            edad_acumulador += estudiantes[contador].getEdad();
            System.out.println(estudiantes[contador].getCedula()+"\t"+estudiantes[contador].getNombre());
        }
        System.out.println("EDAD PROMEDIO DE LOS ESTUDIANTES: "+(edad_acumulador/estudiantes.length));
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("");
    }
}
