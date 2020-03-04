package herenciavolumen;

public class Cono extends Figura {
    // Atributos propios de la clase Cono
    private double altura;
    private double radio;
    private double volumen;

    /**
     * Constructor de la clase Cono
     * @param nombre
     * @param altura
     * @param radio
     */
    public Cono(String nombre, double altura, double radio) {
        this.nombre = nombre;
        this.setAltura(altura);
        this.setRadio(radio);
    }

    /**
     * Método para calcular el volumen de un cono
     */
    public void calcularVolumen() {
        volumen = (Math.PI * Math.pow(radio, 2) * altura) * 1/3;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumen() {
        return volumen;
    }
}
