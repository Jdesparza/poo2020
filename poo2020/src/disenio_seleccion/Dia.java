package disenio_seleccion;

public class Dia {
    // Definir atributos globales
    private int numero_dia;
    private String nombre_dia;

    /**
     * Método para actualizar el numero del dia
     * @param numero_dia
     */
    public void setNumero_dia(int numero_dia) {
        this.numero_dia = numero_dia;
    }

    /**
     * Método para calcular el nombre del dia
     * @return nombre_dia
     */
    public String calcular_nombre_dia(){
        switch (numero_dia){
            case 1:
                nombre_dia = "Domingo";
                break;
            case 2:
                nombre_dia = "Lunes";
                break;
            case 3:
                nombre_dia = "Martes";
                break;
            case 4:
                nombre_dia = "Miércoles";
                break;
            case 5:
                nombre_dia = "Jueves";
                break;
            case 6:
                nombre_dia = "Viernes";
                break;
            case 7:
                nombre_dia = "Sabado";
                break;
            default:
                nombre_dia = "Opción incorrecta";
        }
        return getNombre_dia();
    }

    /**
     * Método para obtener el nombre del dia
     * @return nombre_dia
     */
    public String getNombre_dia() {
        return nombre_dia;
    }
}
