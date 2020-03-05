package polimorfismovolumen;

public class ConoVolumen extends FiguraVolumen {
    // Atributos propios de la clase ConoVolumen
    private double altura;
    private double radio;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularVolumen() {
        volumen = (Math.PI * Math.pow(radio, 2) * altura) * 1/3;
    }
}
