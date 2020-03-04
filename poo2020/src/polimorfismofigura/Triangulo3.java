package polimorfismofigura;

public class Triangulo3 extends Figura3 {
    // Atributos propios de la clase Triangulo3
    private double baseTria;
    private double alturaTria;

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = (baseTria * alturaTria) / 2;
    }
}
