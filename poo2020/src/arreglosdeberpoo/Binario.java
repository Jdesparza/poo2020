package arreglosdeberpoo;

public class Binario {
    // Definir atributos globales
    private String numBinario;
    private int [] arrayBinario = new int[6];
    private int decimal;

    public void setNumBinario(String numBinario) {
        this.numBinario = numBinario;
    }

    public int getDecimal() {
        return decimal;
    }

    /**
     * Método para transformar el numero binario en un arreglo
     * @return arrayBinario
     */
    public int[] transformarDato(){
        if (numBinario.length() <= 6) {
            for (int i = 0; i < numBinario.length(); i++){
                arrayBinario[i] = Integer.parseInt(String.valueOf(numBinario.charAt(i)));
            }
        }
        return arrayBinario;
    }

    /**
     * Método para convertir de binario a decimal
     * @return decimal
     */
    public int convertirBinario() {
        if (numBinario.length() <= 6) {
            decimal = 0;
            for (int i = 0; i < numBinario.length(); i++) {
                decimal += (arrayBinario[i] * (int) Math.pow(2, ((numBinario.length()-1)-i)));
            }
        }
        return decimal;
    }

    /**
     * Método para presentar los resultados
     */
    public void presentar() {
        if (numBinario.length() <= 6) {
            System.out.println("Los números con caracter binario ingresados son:");
            for (int i = 0; i < numBinario.length(); i++) {
                System.out.println(arrayBinario[i]);
            }
            System.out.println("Su número en decimal es: "+getDecimal());
        } else {
            System.out.println("El número sobrepasa el tamaño especificado");
        }
    }
}
