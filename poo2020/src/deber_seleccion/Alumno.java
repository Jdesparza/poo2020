package deber_seleccion;

public class Alumno {
    // Declaracion de atributos globales
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double calificacion4;
    private double promedio;
    private String observacion;

    /**
     * Método para actualizar la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para actualizar la variable calificacion1
     * @param calificacion1
     */
    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    /**
     * Método para actualizar la variable calificacion2
     * @param calificacion2
     */
    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    /**
     * Método para actualizar la variable calificacion3
     * @param calificacion3
     */
    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }

    /**
     * Método para actualizar la variable calificacion4
     * @param calificacion4
     */
    public void setCalificacion4(double calificacion4) {
        this.calificacion4 = calificacion4;
    }

    /**
     * Método para calcular el promedio del estudiante
     * @return promedio
     */
    public double calcularPromedio(){
        promedio = (calificacion1+calificacion2+calificacion3+calificacion4)/4;
        return promedio;
    }

    /**
     * Método para calcular si el estudiante aprueba o no
     * @return observacion
     */
    public String calcularObservacion(){
        if (promedio >= 60) {
            observacion = "Aprobado";
        } else {
            observacion = "Reprobado";
        }
        return observacion;
    }

    /**
     * Método para obtener el valor de la variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el valor de la variable promedio
     * @return promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Método para obtener el valor de la variable observacion
     * @return observacion
     */
    public String getObservacion() {
        return observacion;
    }
}
