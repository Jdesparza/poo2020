package arreglos_poo;

public class MediaDesviacion {
    // Declaracion de atributos globales
    private int [] numeros = new int[15];
    private double media;
    private double [] desviacion = new double[15];

    /**
     * Método para calcular la media
     * @return media
     */
    public double calcularMedia(){
        media = 0;
        for (int i = 0; i < numeros.length; i++) {
            media += numeros[i];
        }
        media = media / numeros.length;
        return media;
    }

    /**
     * Método para calcular la desviacion
     * @return desviacion
     */
    public double []calcularDesviacion() {
        for (int i = 0; i < numeros.length; i++) {
            desviacion[i] = numeros[i] - media;
        }
        return desviacion;
    }

    /**
     * Método para presentar el arreglo y la desviacion
     */
    public void presentar(){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("\t"+numeros[i]+"\t"+desviacion[i]);
        }
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }


    public int[] getNumeros() {
        return numeros;
    }

    public double getMedia() {
        return media;
    }

    public double[] getDesviacion() {
        return desviacion;
    }
}
