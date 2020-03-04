package polimorfismofigura;

public class Circulo3 extends Figura3 {
    // Atributos propios de la clase Circulo3
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }
}
