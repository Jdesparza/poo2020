package taller1;

public class Vehiculo {
    // Defenición de atributos globales
    private String marca;
    private int asientos;
    private String color;
    private String modelo;
    private String potencia;
    private String placa;

    /**
     * Método para obtener el valor de la variable marca
     * @return this.marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Método para obtener el valor de la variable asientos
     * @return this.asientos
     */
    public int obtener_asientos(){
        return asientos;
    }

    /**
     * Método para obtener el valor de la variable color
     * @return this.color
     */
    public String obtener_color(){
        return color;
    }

    /**
     * Método para obtener el valor de la variable modelo
     * @return this.modelo
     */
    public String obtener_modelo(){
        return modelo;
    }

    /**
     * Método para obtener el valor de la variable potencia
     * @return this.potencia
     */
    public String obtener_potencia(){
        return potencia;
    }

    /**
     * Método para obtener el valor de la variable placa
     * @return this.placa
     */
    public String obtener_placa(){
        return placa;
    }

    /**
     * Método que hace referencia a que los vehiculos transportan personas
     * @return transportar
     */
    public String transportar_personas(){
        String transportar = "Nos permite movilizarnos de un lugar a otro";
        return transportar;
    }

    /**
     * Método que hace referencia a que al ir en un vehiculo podemos escuchar música
     * @return musica
     */
    public String escuchar_musica(){
        String musica = "Nos permite escuchar música mientras nos movilizamos";
        return musica;
    }

    /**
     * Método para obtener los datos de un vehículo
     * @return vehiculo
     */
    public String obtener_vehiculo(){
        String vehiculo = "Marca: "+marca+"\nAsientos: "+asientos+"\nColor: "+color+"\nModelo: "+modelo+
                "\nPotencia: "+potencia+"\nPlaca: "+placa;
        return vehiculo;
    }

    /**
     * Método para actualizar la variable marca
     * @param marca
     */
    public void actualizar_marca(String marca){
        this.marca = marca;
    }

    /**
     * Método para actualizar la variable asientos
     * @param asientos
     */
    public void actualizar_asientos(int asientos){
        this.asientos = asientos;
    }

    /**
     * Método para actualizar la variable color
     * @param color
     */
    public void actualizar_color(String color){
        this.color = color;
    }

    /**
     * Método para actualizar la variable modelo
     * @param modelo
     */
    public void actualizar_modelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Método para actualizar la variable potencia
     * @param potencia
     */
    public void actualizar_potencia(String potencia){
        this.potencia = potencia;
    }

    /**
     * Método para actualizar la variable placa
     * @param placa
     */
    public void actualizar_placa(String placa){
        this.placa = placa;
    }
}
