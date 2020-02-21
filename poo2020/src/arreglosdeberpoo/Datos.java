package arreglosdeberpoo;

public class Datos {
    // Declaración de atributos globales
    private String [] nombre = new String[5];
    private int [] edad = new int[5];
    private String [] universidad = new String[5];

    /**
     * Método para presentar los resultados
     */
    public void presentar() {
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Estudiante "+(i+1)+": ");
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Edad: "+edad[i]);
            System.out.println("Universidad: "+universidad[i]+"\n");
        }
    }


    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }
}
