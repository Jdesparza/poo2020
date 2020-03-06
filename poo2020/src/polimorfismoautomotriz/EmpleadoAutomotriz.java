package polimorfismoautomotriz;

public abstract class EmpleadoAutomotriz {
    // Definicion de atributos protegidos para que puedan ser heredados
    protected String rfc;
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldoQuincena;

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

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

    public double getSueldoQuincena() {
        return sueldoQuincena;
    }

    /**
     * Método abstracto que sera implementado dentro de las clases hijas
     */
    public abstract void calcularSueldoQuincenal();
}
