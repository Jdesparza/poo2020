package Disenopoo;

public class Cerveza {
    // Definir atributos globales
    private double precio;
    private int unidades_vendidas;
    private String nombre;
    private String tipo;

    /**
     * Método Constructor de la clase Cerveza
     * @param precio
     * @param unidades_vendidas
     * @param nombre
     * @param tipo
     */
    public Cerveza(double precio, int unidades_vendidas, String nombre, String tipo){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Método para calcular las ventas
     * @return total_ventas
     */
    public double calcular_ventas(){
        double total_ventas = this.precio * this.unidades_vendidas;
        return total_ventas;
    }

    /**
     * Método para presentar el informe de ventas
     * @return
     */
    public String presentar_total(){
        String presentar = "Total de Ventas de la Cerveza\nPrecio: "+this.precio+
                "\nUnidades Vendidas: "+this.unidades_vendidas+"\nNombre de la Cerveza: "+
                this.nombre+"\nTipo de Cerveza: "+this.tipo+"\n\nTotal de Ventas: "+calcular_ventas();
        return presentar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
