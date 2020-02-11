package diseniopoo;

public class Nota {
    // Definir atributos globales
    private String nombre_estudiante;
    private String asignatura;
    private double nota_1bim;
    private double nota_2bim;

    /**
     * Método constructor de la clase Nota
     * @param nombre_estudiante
     * @param asignatura
     * @param nota_1bim
     * @param nota_2bim
     */
    public Nota(String nombre_estudiante, String asignatura, double nota_1bim, double nota_2bim){
        this.nombre_estudiante = nombre_estudiante;
        this.asignatura = asignatura;
        this.nota_1bim = nota_1bim;
        this.nota_2bim = nota_2bim;
    }

    /**
     * Método para calcular el promedio final
     * @return nota_final
     */
    public double promedio_final(){
        double nota_final = this.nota_1bim + this.nota_2bim;
        return nota_final;
    }

    /**
     * Método para determinar si pasa o no la materia
     * @return aprueba
     */
    public String estado(){
        String aprueba = "";
        if (promedio_final() >= 28){
            aprueba = "Aprueba la materia";
        } else {
            aprueba = "No aprueba la materia." +
                    "\n\tTiene que rendir el examen supletorio";
        }
        return aprueba;
    }

    /**
     * Método para presentar el informe final del estudiante
     */
    public void presentar_nota(){
        System.out.println("Universidad Técnica Particular de Loja\n\tLa Universidad Católica de Loja\n" +
                "Estudiante: "+this.nombre_estudiante+"\nAsignatura: "+this.asignatura+"\nNotas:\n\t" +
                "Primer Bimestre: "+this.nota_1bim+"\n\tSegundo Bimestre: "+this.nota_2bim+"\n\tFinal: "+
                promedio_final()+"\nEstado: "+estado());
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota_1bim() {
        return nota_1bim;
    }

    public void setNota_1bim(double nota_1bim) {
        this.nota_1bim = nota_1bim;
    }

    public double getNota_2bim() {
        return nota_2bim;
    }

    public void setNota_2bim(double nota_2bim) {
        this.nota_2bim = nota_2bim;
    }
}
