package taller1;

public class EjecutarEstudiante {
    public static void main(String[] args) {
        // Creación de objeto estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_nombre("David");
        estudiante.actualizar_edad(21);
        estudiante.actualizar_nro_cedula(1124653276);
        estudiante.actualizar_grupo_sanguineo("O negativo");
        estudiante.actualizar_nivel_academico("Secundaria");
        estudiante.actualizar_genero("Masculino");
        String mostrar_estudiante = estudiante.obtener_estudiante();
        System.out.println(mostrar_estudiante);

        System.out.println("\nInformación:");
        System.out.println(estudiante.aprender());
        System.out.println(estudiante.aprobar());
        System.out.println(estudiante.razonar());
        System.out.println(estudiante.suspender());
    }
}
