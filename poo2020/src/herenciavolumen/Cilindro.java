package herenciavolumen;

public class Cilindro extends Figura {
    // Atributos Propios de la clase Cilindro
    private double altura;
    private double radio;
    private double volumen;

    /**
     * Constructor de la clase Cilindro
     * @param nombre
     * @param altura
     * @param radio
     */
    public Cilindro(String nombre, double altura, double radio) {
        this.nombre = nombre;
        this.altura = altura;
        this.radio = radio;
    }

    /**
     * Método para calcular el volumen de un cilindro
     */
    public void calcularVolumen() {
        volumen = Math.PI * Math.pow(radio, 2) * altura;
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
