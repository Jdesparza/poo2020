package taller1;

public class EjecutarDocente {
    public static void main(String[] args) {
        // Creación de objeto docente
        Docente docente = new Docente();
        docente.actualizar_nombre("Alex");
        docente.actualizar_edad(37);
        docente.actualizar_nro_cedula(1914735893);
        docente.actualizar_grupo_sanguineo("O positivo");
        docente.actualizar_experiencia("3 años");
        docente.actualizar_genero("Masculino");
        String mostrar_docente = docente.obtener_docente();
        System.out.println(mostrar_docente);

        System.out.println("\nInformación:");
        System.out.println(docente.enseniar());
        System.out.println(docente.orientar());
    }
}
