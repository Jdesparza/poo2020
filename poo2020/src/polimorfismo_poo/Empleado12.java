package polimorfismo_poo;

public abstract class Empleado12 {
    // Definición de atributos protegidos para que puedan ser heredados
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldoQna;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldoQna() {
        return sueldoQna;
    }

    /**
     * Método abstracto que sera implementado dentro de las clases hijas
     */
    public abstract void calcularSueldoQna();
}
