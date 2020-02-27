package herencia;

import java.util.Date;
import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre, identificacion, estado_civil, fecha_nac , carrera, area, dependencia;

        // Declaración de scanner
        Scanner scanner = new Scanner(System.in);

        // Datos por teclado y lectura para la clase Estudiante
        System.out.println("CREACIÓN DE OBJETO ESTUDIANTE");
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la identificación: ");
        identificacion = scanner.nextLine();
        System.out.print("Ingrese el estado civil: ");
        estado_civil = scanner.nextLine();
        System.out.print("Ingrese la fecha nacimiento: ");
        fecha_nac = scanner.nextLine();
        System.out.print("Ingrese la carrera del estudiante: ");
        carrera = scanner.nextLine();

        // Creación de objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante(carrera, nombre, identificacion, estado_civil, fecha_nac);

        // Datos por teclado y lectura para la clase Docente
        System.out.println("CREACIÓN DE OBJETO DOCENTE");
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la identificación: ");
        identificacion = scanner.nextLine();
        System.out.print("Ingrese el estado civil: ");
        estado_civil = scanner.nextLine();
        System.out.print("Ingrese la fecha nacimiento: ");
        fecha_nac = scanner.nextLine();
        System.out.print("Ingrese el area del Docente: ");
        area = scanner.nextLine();

        // Creación de objeto de la clase Docente
        Docente docente = new Docente(nombre, identificacion, estado_civil, fecha_nac, area);

        // Datos por teclado y lectura para la clase Administrativo
        System.out.println("CREACIÓN DE OBJETO ADMINISTRATIVO");
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la identificación: ");
        identificacion = scanner.nextLine();
        System.out.print("Ingrese el estado civil: ");
        estado_civil = scanner.nextLine();
        System.out.print("Ingrese la fecha nacimiento: ");
        fecha_nac = scanner.nextLine();
        System.out.print("Ingrese la dependencia: ");
        dependencia = scanner.nextLine();

        // Creación de objeto de la clase Administrativo
        Administrativo administrativo = new Administrativo(nombre, identificacion, estado_civil, fecha_nac,
                dependencia);

        // Imprimir
        System.out.println("---------------------------------------------");
        System.out.println("Datos de Estudiante");
        System.out.println("Nombre: "+ estudiante.getNombre());
        System.out.println("Identificación: "+ estudiante.getIdentificacion());
        System.out.println("Carrera universitaria: "+ estudiante.getCarrera());
        System.out.println("Estado civil: "+ estudiante.getEstado_civil());
        System.out.println("Fecha nacimiento: "+ estudiante.getFecha_nacimiento());

        System.out.println("---------------------------------------------");
        System.out.println("Datos de Docente");
        System.out.println("Nombre: "+ docente.getNombre());
        System.out.println("Identificación: "+ docente.getIdentificacion());
        System.out.println("Area docente: "+ docente.getArea());
        System.out.println("Estado civil: "+ docente.getEstado_civil());
        System.out.println("Fecha nacimiento: "+ docente.getFecha_nacimiento());

        System.out.println("---------------------------------------------");
        System.out.println("Datos de Administrativo");
        System.out.println("Nombre: "+ administrativo.getNombre());
        System.out.println("Identificación: "+ administrativo.getIdentificacion());
        System.out.println("Dependencia: "+ administrativo.getDependencia());
        System.out.println("Estado civil: "+ administrativo.getEstado_civil());
        System.out.println("Fecha nacimiento: "+ administrativo.getFecha_nacimiento());


    }
}
