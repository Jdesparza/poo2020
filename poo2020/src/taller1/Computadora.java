package taller1;

public class Computadora {
    // Definición de atributos globales
    private String tamanio;
    private String tipo_computadora;
    private String sistema_operativo;
    private String tarjeta_video;
    private String disco_duro;
    private String memoria_ram;

    /**
     * Método para obtener el valor de la variable tamanio
     * @return this.tamanio
     */
    public String obtener_tamanio(){
        return tamanio;
    }

    /**
     * Método para obtener el valor de la variable tipo_computadora
     * @return this.tipo_computadora
     */
    public String obtener_tipo_computadora(){
        return tipo_computadora;
    }

    /**
     * Método para obtener el valor de la variable sistema_operativo
     * @return this.sistema_operativo
     */
    public String obtener_sistema_operativo(){
        return sistema_operativo;
    }

    /**
     * Método para obtener el valor de la variable tarjeta_video
     * @return this.tarjeta_video
     */
    public String obtener_tarjeta_video(){
        return tarjeta_video;
    }

    /**
     * Método para obtener el valor de la variable disco_duro
     * @return this.disco_duro
     */
    public String obtener_disco_duro(){
        return disco_duro;
    }

    /**
     * Método para obtener el valor de la variable memoria_ram
     * @return this.memoria_ram
     */
    public String obtener_memoria_ram(){
        return memoria_ram;
    }

    /**
     * Método que hace referencia a que una computadora procesa
     * @return procesar
     */
    public String procesar(){
        String procesar = "Una computadora procesa la información";
        return procesar;
    }

    /**
     * Método que hace referencia a que una computadora almacena
     * @return almacenar
     */
    public String almacenar(){
        String almacenar = "Una computadora almacena información";
        return almacenar;
    }

    /**
     * Método que hace referencia a que una computadora organiza
     * @return organizar
     */
    public String organizar(){
        String organizar = "Una computadora organiza la información";
        return organizar;
    }

    /**
     * Método que hace referencia a que una computadora transmite
     * @return transmitir
     */
    public String transmitir(){
        String transmitir = "Una computadora comparte la información entre usuarios de una manera rapida";
        return transmitir;
    }

    /**
     * Método para obtener las caracteristicas de una computadora
     * @return computadora
     */
    public String obtener_computadora(){
        String computadora = "Tamaño: "+tamanio+"\nTipo de Computadora: "+tipo_computadora+
                "\nSistema Operativo: "+sistema_operativo+"\nTarjeta de Video. "+tarjeta_video+
                "\nDisco Duro: "+disco_duro+"\nMemoria RAM: "+memoria_ram;
        return computadora;
    }

    /**
     * Método para actualizar la variable tamanio
     * @param tamanio
     */
    public void actualizar_tamanio(String tamanio){
        this.tamanio = tamanio;
    }

    /**
     * Método para actualizar la variable tipo_computadora
     * @param tipo_computadora
     */
    public void actualizar_tipo_computadora(String tipo_computadora){
        this.tipo_computadora = tipo_computadora;
    }

    /**
     * Método para actualizar la variable sistema_operativo
     * @param sistema_operativo
     */
    public void actualizar_sistema_operativo(String sistema_operativo){
        this.sistema_operativo = sistema_operativo;
    }

    /**
     * Método para actualizar la variable tarjeta_video
     * @param tarjeta_video
     */
    public void actualizar_tarjeta_video(String tarjeta_video){
        this.tarjeta_video = tarjeta_video;
    }

    /**
     * Método para actualizar la variable disco_duro
     * @param disco_duro
     */
    public void actualizar_disco_duro(String disco_duro){
        this.disco_duro = disco_duro;
    }

    /**
     * Método para actualizar la variable memoria_ram
     * @param memoria_ram
     */
    public void actualizar_memoria_ram(String memoria_ram){
        this.memoria_ram = memoria_ram;
    }
}
