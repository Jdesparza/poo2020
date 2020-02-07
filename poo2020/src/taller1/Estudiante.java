package taller1;

public class Estudiante {
    // Definición de atributos globales
    private String nombre;
    private int edad;
    private int nro_cedula;
    private String grupo_sanguineo;
    private String nivel_academico;
    private String genero;

    /**
     * Método para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Método para obtener el valor de la variable edad
     * @return this.edad
     */
    public int obtener_edad(){
        return edad;
    }

    /**
     * Método para obtener el valor de la variable nro_cedula
     * @return this.nro_cedula
     */
    public int obtener_nro_cedula(){
        return nro_cedula;
    }

    /**
     * Método para obtener el valor de la variable grupo_sanguineo
     * @return this.grupo_sanguineo
     */
    public String obtener_grupo_sanguineo(){
        return grupo_sanguineo;
    }

    /**
     * Método para obtener el valor de la variable nivel_academico
     * @return this.nivel_academico
     */
    public String obtener_nivel_academico(){
        return nivel_academico;
    }

    /**
     * Método para obtener el valor de la variable genero
     * @return this.genero
     */
    public String obtener_genero(){
        return genero;
    }

    /**
     * Método que hace referencia a que el estudiante aprende en clases
     * @return aprende
     */
    public String aprender(){
        String aprender = "El estudiante aprende en clases";
        return aprender;
    }

    /**
     * Método que hace referencia a que el estudiante aprueba las materias
     * @return aprueba
     */
    public String aprobar(){
        String aprobar = "El estudiante aprueba las materias";
        return aprobar;
    }

    /**
     * Método que hace referencia a que el estudiante razona en clases
     * @return razona
     */
    public String razonar(){
        String razonar = "El estudiante razona en clases";
        return razonar;
    }

    /**
     * Método que hace referencia a que el estudiante suspendio sus clases
     * @return suspende
     */
    public String suspender(){
        String suspender = "El estudiante suspende sus clases";
        return suspender;
    }

    /**
     * Método para obtener una ficha con los datos del estudiante
     * @return estudiante
     */
    public String obtener_estudiante(){
        String estudiante = "Nombre: "+nombre+"\nEdad: "+edad+"\nID: "+nro_cedula+"\nGrupo Sanguineo: "+
                grupo_sanguineo+"\nNivel Academico: "+nivel_academico+"\nGénero: "+genero;
        return estudiante;
    }

    /**
     * Método para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para actualizar la variable edad
     * @param edad
     */
    public void actualizar_edad(int edad){
        this.edad = edad;
    }

    /**
     * Método para actualizar la variable nro_cedula
     * @param nro_cedula
     */
    public void actualizar_nro_cedula(int nro_cedula){
        this.nro_cedula = nro_cedula;
    }

    /**
     * Método para actualizar la variable grupo_sanguineo
     * @param grupo_sanguineo
     */
    public void actualizar_grupo_sanguineo(String grupo_sanguineo){
        this.grupo_sanguineo = grupo_sanguineo;
    }

    /**
     * Método para actualizar la variable nivel_academico
     * @param nivel_academico
     */
    public void actualizar_nivel_academico(String nivel_academico){
        this.nivel_academico = nivel_academico;
    }

    /**
     * Método para actualizar la variable genero
     * @param genero
     */
    public void actualizar_genero(String genero){
        this.genero = genero;
    }
}
