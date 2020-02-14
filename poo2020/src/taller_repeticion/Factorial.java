package taller_repeticion;

public class Factorial {
    // Declaracion de atributos globales
    private int numero;
    private int numeroFactorial;

    /**
     * Método para calcular el factorial de un número
     * @param numero
     * @return numeroFactorial
     */
    public int calcularFactorial (int numero) {
        int contador;
        int contador2 = 1;

        if (numero == 0) {
            numeroFactorial = contador2;
        } else {
            if (numero > 0) {
                for (contador = 2; contador <= numero; contador++){
                    contador2 = contador2 * contador;
                }
                numeroFactorial = contador2;
            } else {
                System.out.print("Número no valido, solo se puede sacar el factorial de números naturales.\n\t" +
                        "Y el número que ud ingreso es: ");
                numeroFactorial = numero;
            }
        }
        return numeroFactorial;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getNumeroFactorial() {
        return numeroFactorial;
    }
}
