package taller1;

public class Animal {
    // Defenición de atributos globales
    private String nombre;
    private String tamanio;
    private String clasificacion;
    private String alimentacion;
    private String habitat;

    /**
     * Método para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }
    /**
     * Método para obtener el valor de la variable tamanio
     * @return this.tamanio
     */
    public String obtener_tamanio(){
        return tamanio;
    }

    /**
     * Método para obtener el valor de la variable clasificacion
     * @return this.clasificacion
     */
    public String obtener_clasificacion(){
        return clasificacion;
    }

    /**
     * Método para obtener el valor de la variable alimentacion
     * @return this.alimentacion
     */
    public String obtener_alimentacion(){
        return alimentacion;
    }

    /**
     * Método para obtener el valor de la variable habitat
     * @return this.habitat
     */
    public String obtener_habitat(){
        return habitat;
    }

    /**
     * Método que hace referencia a que dos animales de distinto sexo engendran hijos
     * @return procrear
     */
    public String procrear(){
        String procrear = "engendran decendencia";
        return procrear;
    }

    /**
     * Método que hace referencia a que los animales sirven como alimento para otros
     * @return nutrir
     */
    public String nutrir(){
        String nutrir = "los animales sirven como alimento para otros seres vivos";
        return nutrir;
    }
    /**
     * Método que hace referencia a que los animales se alimentan de otros seres vivos
     * @return cazar
     */
    public String cazar(){
        String cazar = "se alimentan de otros seres vivos (animales ó plantas)";
        return cazar;
    }

    /**
     * Método para obtener los datos de un animal
     * @return animal
     */
    public String obtener_animal(){
        String animal = "Nombre: "+nombre+"\nTamaño: "+tamanio+"\nClasificación: "+clasificacion+
                "\nAlimentación: "+alimentacion+"\nHabitat: "+habitat;
        return animal;
    }

    /**
     * Método para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para actualizar la variable tamanio
     * @param tamanio
     */
    public void actualizar_tamanio(String tamanio){
        this.tamanio = tamanio;
    }

    /**
     * Método para actualizar la variable clasificacion
     * @param clasificacion
     */
    public void actualizar_clasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }

    /**
     * Método para actualizar la variable alimentacion
     * @param alimentacion
     */
    public void actualizar_alimentacion(String alimentacion){
        this.alimentacion = alimentacion;
    }

    /**
     * Método para actualizar la variable habitat
     * @param habitat
     */
    public void actualizar_habitat(String habitat){
        this.habitat = habitat;
    }
}
