package taller1;

public class EjecutarUniversidad {
    public static void main(String[] args) {
        // Creación de objeto universidad
        Universidad universidad = new Universidad();
        universidad.actualizar_nombre("UTPL");
        universidad.actualizar_ubicacion("San Cayetano Alto, Calle París, Loja");
        universidad.actualizar_numero_alumnos(5400);
        universidad.actualizar_numero_docentes(60);
        universidad.actualizar_areas("Técnica, Sociohumanística, Administrativa, Biológica y Biomédia");
        String mostrar_universidad = universidad.obtener_universidad();
        System.out.println(mostrar_universidad);

        System.out.println("\nInformación:");
        System.out.println(universidad.matricular());
        System.out.println(universidad.administrar());
        System.out.println(universidad.clases());
        System.out.println(universidad.asignar_becas());
        System.out.println(universidad.formacion_academica());
    }
}
