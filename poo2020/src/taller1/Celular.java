package taller1;

public class Celular {
    // Defenición de atributos globales
    private String marca;
    private String sistema_operativo;
    private String bateria;
    private String almacenamiento;
    private String ram;
    private String color;

    /**
     * Método para obtener el valor de la variable marca
     * @return this.marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Método para obtener el valor de la variable sistema_operativo
     * @return this.sistema_operativo
     */
    public String obtener_sistema_operativo(){
        return sistema_operativo;
    }

    /**
     * Método para obtener el valor de la variable bateria
     * @return this.bateria
     */
    public String obtener_bateria(){
        return bateria;
    }

    /**
     * Método para obtener el valor de la variable almacenamiento
     * @return this.almacenamiento
     */
    public String obtener_almacenamiento(){
        return almacenamiento;
    }

    /**
     * Método para obtener el valor de la variable ram
     * @return this.ram
     */
    public String obtener_ram(){
        return ram;
    }

    /**
     * Método para obtener el valor de la variable color
     * @return this.color
     */
    public String obtener_color(){
        return color;
    }

    /**
     * Método que hace referencia a que los celulares sirven para hacer llamadas
     * @return llamar
     */
    public String llamar(){
        String llamar = "Sirve para hacer llamadas";
        return llamar;
    }

    /**
     * Método que hace referencia a que los celulares sirven para escuchar música
     * @return escuchar
     */
    public String escuchar_musica(){
        String escuchar = "Nos permite escuchar música";
        return escuchar;
    }

    /**
     * Método que hace referencia a que los celulares sirven para tomar fotos
     * @return fotos
     */
    public String tomar_fotos(){
        String fotos = "Nos permite tomar fotos";
        return fotos;
    }

    /**
     * Método que hace referencia a que los celulares sirven para enviar mensajes
     * @return mensajes
     */
    public String enviar_mensajes(){
        String mensajes = "Sirve para enviar mensajes";
        return mensajes;
    }

    /**
     * Método que hace referencia a que los celulares sirven para jugar videojuegos
     * @return jugar
     */
    public String jugar(){
        String jugar = "Nos permite distraernos en videojuegos";
        return jugar;
    }

    /**
     * Método para obtener las caracteristicas de un celular
     * @return celular
     */
    public String obtener_celular(){
        String celular = "Marca: "+marca+"\nSistema Operativo: "+sistema_operativo+"\nBateria: "+bateria
                +"\nAlmacenamiento: "+almacenamiento+"\nRAM: "+ram+"\nColor: "+color;
        return celular;
    }
    /**
     * Método para actualizar la variable marca
     * @param marca
     */
    public void actualizar_marca(String marca){
        this.marca = marca;
    }

    /**
     * Método para actualizar la variable sistema_operativo
     * @param sistema_operativo
     */
    public void actualizar_sistema_operativo(String sistema_operativo){
        this.sistema_operativo = sistema_operativo;
    }

    /**
     * Método para actualizar la variable bateria
     * @param bateria
     */
    public void actualizar_bateria(String bateria){
        this.bateria = bateria;
    }

    /**
     * Método para actualizar la variable almacenamiento
     * @param almacenamiento
     */
    public void actualizar_almacenamiento(String almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    /**
     * Método para actualizar la variable ram
     * @param ram
     */
    public void actualizar_ram(String ram){
        this.ram = ram;
    }

    /**
     * Método para actualizar la variable color
     * @param color
     */
    public void actualizar_color(String color){
        this.color = color;
    }
}
