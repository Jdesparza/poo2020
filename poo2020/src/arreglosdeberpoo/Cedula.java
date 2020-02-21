package arreglosdeberpoo;

public class Cedula {
    // Declaracion de atributos globales
    private String numCedula;
    private int[] coheficiente = {1, 2};
    private int[] arrayCedula = new int[10];
    private int[] verificacion = new int[9];
    private int resultadoFinal;

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    /**
     * Método para transformar el numero de cédula en un arreglo
     * @return arrayCedula
     */
    public int[] transformarDatos() {
        if (numCedula.length() <= 10) {
            for (int i = 0; i < numCedula.length(); i++) {
                arrayCedula[i] = Integer.parseInt(String.valueOf(numCedula.charAt(i)));
            }
        }
        return arrayCedula;
    }

    /**
     * Método para calcular la multiplicaion de los arreglos coheficiente[] y arrayCedula[]
     * @return verificacion
     */
    public int[] calcularResultado() {
        if (numCedula.length() <= 10) {
            for (int i = 0; i < numCedula.length() - 1; i++) {
                if (i % 2 != 0) {
                    verificacion[i] = (coheficiente[0] * arrayCedula[i]);
                } else {
                    verificacion[i] = (coheficiente[1] * arrayCedula[i]);
                }
            }
        }
        return verificacion;
    }

    /**
     * Método para restar 9 en el caso de que la multiplicacion sobrepase o sea igual a 10
     * @return verificacion
     */
    public int[] verificarResultado() {
        if (numCedula.length() <= 10) {
            for (int i = 0; i < numCedula.length() - 1; i++) {
                if (verificacion[i] >= 10) {
                    verificacion[i] = (verificacion[i] - 9);
                }
            }
        }
        return verificacion;
    }

    /**
     * Método para verificar si la cédula es valida
     * @return resultadoFinal
     */
    public int verificarCedula() {
        if (numCedula.length() <= 10) {
            resultadoFinal = 0;
            for (int i = 0; i < numCedula.length() - 1; i++) {
                resultadoFinal = resultadoFinal + verificacion[i];
            }
            if ((resultadoFinal <= 10) && (resultadoFinal > 0)) {
                resultadoFinal = 10 - resultadoFinal;
            } else {
                if ((resultadoFinal <= 20) && (resultadoFinal > 10)) {
                    resultadoFinal = 20 - resultadoFinal;
                } else {
                    if ((resultadoFinal <= 30) && (resultadoFinal > 20)) {
                        resultadoFinal = 30 - resultadoFinal;
                    } else {
                        if ((resultadoFinal <= 40) && (resultadoFinal > 30)) {
                            resultadoFinal = 40 - resultadoFinal;
                        } else {
                            if ((resultadoFinal <= 50) && (resultadoFinal > 40)) {
                                resultadoFinal = 50 - resultadoFinal;
                            } else {
                                if ((resultadoFinal <= 60) && (resultadoFinal > 50)) {
                                    resultadoFinal = 60 - resultadoFinal;
                                } else {
                                    if ((resultadoFinal <= 70) && (resultadoFinal > 60)) {
                                        resultadoFinal = 70 - resultadoFinal;
                                    } else {
                                        if ((resultadoFinal <= 80) && (resultadoFinal > 70)) {
                                            resultadoFinal = 80 - resultadoFinal;
                                        } else {
                                            if ((resultadoFinal <= 90) && (resultadoFinal > 80)) {
                                                resultadoFinal = 90 - resultadoFinal;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return resultadoFinal;
    }

    /**
     * Método para presentar los resultados
     */
    public void presentar() {
        if (numCedula.length() <= 10) {
            if (arrayCedula[9] == resultadoFinal) {
                System.out.println("Su número de cédula es: "+numCedula);
                System.out.println("El último número de su cédula es: "+arrayCedula[9]+"\n\t" +
                        "Y tambien al realizar la verificación resulto ser: "+resultadoFinal+
                        "\n\t\tPor lo tanto su cédula es verdadera");
            } else {
                System.out.println("El número de cédula es invalido\n\tEl último numero de su cedula es: "
                +arrayCedula[9]+"\n\t\tY el número obtenido tras la verificación es: "+resultadoFinal);
            }
        } else {
            System.out.println("El número de cédula sobrepasa el tamaño");
        }
    }

}
