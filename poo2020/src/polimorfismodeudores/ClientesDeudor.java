package polimorfismodeudores;

public abstract class ClientesDeudor {
    // Definición de atributos protegidos para que puedan ser heredados
    protected int noCliente;
    protected int noCuenta;
    protected int plazoInversion;
    protected String nombre;
    protected double capPrestado;
    protected double tasaAnual;
    protected double interesPagar;

    public int getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(int noCliente) {
        this.noCliente = noCliente;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public int getPlazoInversion() {
        return plazoInversion;
    }

    public void setPlazoInversion(int plazoInversion) {
        this.plazoInversion = plazoInversion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapPrestado() {
        return capPrestado;
    }

    public void setCapPrestado(double capPrestado) {
        this.capPrestado = capPrestado;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public double getInteresPagar() {
        return interesPagar;
    }

    /**
     * Método abstracto que sera implementado dentro de las clases hijas
     */
    public abstract void calcularInteresPagar();
}
