package herenciafigura;

public class Triangulo extends Figura{
    // Atributos propios de la clase Triangulo
    private double base;
    private double altura;
    private double area;

    /**
     * Constructor de la clase Triangulo
     * @param nombre
     * @param base
     * @param altura
     */
    public Triangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para calcular el area de un triángulo
     */
    public void calcularArea(){
        area = (base * altura) / 2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }
}
