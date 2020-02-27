package herencia;

import java.util.Date;

/**
 * Clase principal o superclase
 */

public class Persona {
    // atributos comunes para todas las clases
    protected String nombre;
    protected String identificacion;
    protected String estado_civil;
    protected String fecha_nac;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getFecha_nacimiento() {
        return fecha_nac;
    }

    public void setFecha_nacimiento(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
}
