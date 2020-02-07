package taller1;

public class Universidad {
    // Defenición de atributos globales
    private String nombre;
    private String ubicacion;
    private int numero_alumnos;
    private int numero_docentes;
    private String areas;

    /**
     * Método para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Método para obtener el valor de la variable ubicacion
     * @return this.ubicacion
     */
    public String obtener_ubicacion(){
        return ubicacion;
    }

    /**
     * Método para obtener el valor de la variable numero_alumnos
     * @return this.numero_alumnos
     */
    public int obtener_numero_alumnos(){
        return numero_alumnos;
    }

    /**
     * Método para obtener el valor de la variable numero_docentes
     * @return this.numero_docentes
     */
    public int obtener_numero_docentes(){
        return numero_docentes;
    }

    /**
     * Método para obtener el valor de la variable areas
     * @return this.areas
     */
    public String obtener_areas(){
        return areas;
    }

    /**
     * Método que hace referencia a que los jovenes se matriculan en las universidades
     * @return matricular
     */
    public String matricular(){
        String matricular = "Los jovenes se matriculan a clases para obtener un título académico superior";
        return matricular;
    }

    /**
     * Método que hace referencia a que las universidades controlan sus eventos
     * @return administrar
     */
    public String administrar(){
        String administrar = "Ejerce un control de todo lo planeado para que no se cometa errores";
        return administrar;
    }

    /**
     * Método que hace referencia a que las universidades dan clases
     * @return clases
     */
    public String clases(){
        String clases = "Ponen a disposición docentes para que den clases a los estudiantes matriculados";
        return clases;
    }

    /**
     * Método que hace referencia a que las universidades dan becas a los estudiantes
     * @return becas
     */
    public String asignar_becas (){
        String becas = "Da becas a los jovenes con mejor promedio o a los de bajo recursos para que sigan estudiando";
        return becas;
    }

    /**
     * Método que hace referencia a que las universidades dan a los jovenes un mayor nivel académico
     * @return formacion
     */
    public String formacion_academica(){
        String formacion = "Dan a los jovenes un mejor nivel educativo";
        return formacion;
    }

    /**
     * Método para obtener los datos de una universidad
     * @return universidad
     */
    public String obtener_universidad(){
        String universidad = "Nombre: "+nombre+"\nUbicación: "+ubicacion+"\nNúmero de alumnos: "+
                numero_alumnos+"\nNúmero de docentes: "+numero_docentes+"\nAreas: "+areas;
        return universidad;
    }

    /**
     * Método para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para actualizar la variable ubicacion
     * @param ubicacion
     */
    public void actualizar_ubicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    /**
     * Método para actualizar la variable numero_alumnos
     * @param numero_alumnos
     */
    public void actualizar_numero_alumnos(int numero_alumnos){
        this.numero_alumnos = numero_alumnos;
    }

    /**
     * Método para actualizar la variable numero_docentes
     * @param numero_docentes
     */
    public void actualizar_numero_docentes(int numero_docentes){
        this.numero_docentes = numero_docentes;
    }

    /**
     * Método para actualizar la variable areas
     * @param areas
     */
    public void actualizar_areas(String areas){
        this.areas = areas;
    }
}
