package herenciavolumen;

public class Esfera extends Figura {
    // Atributos propios de la clase Cono
    private double radio;
    private double volumen;

    /**
     * Constructor de la clase Esfera
     * @param nombre
     * @param radio
     */
    public Esfera(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    /**
     * Método para calcular el volumen de una esfera
     */
    public void calcularVolumen() {
        volumen = (Math.PI * Math.pow(radio, 3)) *  4/3;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumen() {
        return volumen;
    }
}
