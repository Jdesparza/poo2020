package polimorfismofigura;

public class Rectangulo3 extends Figura3 {
    // Atributos propios de la clase Rectangulo3
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = (base * altura);
    }
}
