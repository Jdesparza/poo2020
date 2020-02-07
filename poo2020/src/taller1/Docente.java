package taller1;

public class Docente {
    // Definición de atributos globales
    private String nombre;
    private int edad;
    private int nro_cedula;
    private String grupo_sanguineo;
    private String experiencia;
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
     * Método para obtener el valor de la variable experiencia
     * @return this.experiencia
     */
    public String obtener_experiencia(){
        return experiencia;
    }

    /**
     * Método para obtener el valor de la variable genero
     * @return this.genero
     */
    public String obtener_genero(){
        return genero;
    }

    /**
     * Método que hace referencia a que el docente enseña al estudiante
     * @return ensenia
     */
    public String enseniar(){
        String enseniar = "El docente enseña en las horas de clase al estudiante";
        return enseniar;
    }

    /**
     * Método que hace referencia a que el docente orienta al estudiante
     * @return orienta
     */
    public String orientar(){
        String orientar = "El docente orienta en las horas de clase al estudiante";
        return orientar;
    }

    /**
     * Método para obtener una ficha con los datos del docente
     * @return docente
     */
    public String obtener_docente(){
        String docente = "Nombre: "+nombre+"\nEdad: "+edad+"\nID: "+nro_cedula+"\nGrupo Sanguineo: "+
                grupo_sanguineo+"\nExperiencia Académica: "+experiencia+"\nGénero: "+genero;
        return docente;
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
     * Método para actualizar la variable experiencia
     * @param experiencia
     */
    public void actualizar_experiencia(String experiencia){
        this.experiencia = experiencia;
    }

    /**
     * Método para actualizar la variable genero
     * @param genero
     */
    public void actualizar_genero(String genero){
        this.genero = genero;
    }
}
