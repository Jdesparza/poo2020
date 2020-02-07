package intropoo;

public class Tiempo {
    // Definición de atributos globales
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Método para obtener el valor de la variable hora
     * @return this.hora
     */
    public int obtener_hora() {
        return hora;
    }

    /**
     * Método para obtener el valor de la variable minuto
     * @return this.minuto
     */
    public int obtener_minuto() {
        return minuto;
    }

    /**
     * Método para obtener el valor de la variable segundo
     * @return this.segundo
     */
    public int obtener_segundo() {
        return segundo;
    }

    /**
     * método para obtener el tiempo en formato hh:mm:ss
     * @return tiempo
     */
    public String obtener_tiempo() {
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }

    /**
     * Método para actualizar la variable hora
     * @param hora
     */
    public void actualizar_hora(int hora) {
        // Con el this hacemos referencia a variables globales
        this.hora = hora;
    }

    /**
     * Método para actualizar la variable minuto
     * @param minuto
     */
    public void actualizar_minuto(int minuto){
        this.minuto = minuto;
    }

    /**
     * Método para actualizar la variable segundo
     * @param segundo
     */
    public void actualizar_segundo(int segundo) {
        this.segundo = segundo;
    }
}
