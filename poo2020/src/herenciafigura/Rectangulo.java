package herenciafigura;

public class Rectangulo extends Figura{
    // Atributos propios de la clase Rectangulo
    private double base;
    private double altura;
    private double area;

    /**
     * Constructor de la clase Rectangulo
     * @param nombre
     * @param base
     * @param altura
     */
    public Rectangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para calcular el area de un rectangulo
     */
    public void calcularArea(){
        area = (base * altura);
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
