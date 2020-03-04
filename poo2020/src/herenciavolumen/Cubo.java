package herenciavolumen;

public class Cubo extends Figura {
    // Atributos propios de la clase Cubo
    private double arista;
    private double volumen;

    /**
     * Constructor de la clase Cubo
     * @param nombre
     * @param arista
     */
    public Cubo(String nombre, double arista) {
        this.nombre = nombre;
        this.arista = arista;
    }

    /**
     * Método para calcular el volumen de un cubo
     */
    public void calcularVolumen() {
        volumen = Math.pow(arista, 3);
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getVolumen() {
        return volumen;
    }
}
