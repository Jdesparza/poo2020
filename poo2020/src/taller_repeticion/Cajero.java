package taller_repeticion;

public class Cajero {
    // Declaración de atributos globales
    private String nombre;
    private double saldo;

    /**
     * Método para actualizar el saldo despues de depositar
     * @param saldoDeposito
     * @return saldo
     */
    public double depositar(int saldoDeposito) {
        if (saldoDeposito > 0) {
            saldo = saldo + saldoDeposito;
        }else{
            System.out.println("El valor ingresado no es correcto");
        }
        return saldo;
    }

    /**
     * Método para actualizar el saldo despues de retirar
     * @param saldoRetiro
     * @return saldo
     */
    public double retirar(int saldoRetiro) {
        if (saldoRetiro <= saldo) {
            saldo = saldo - saldoRetiro;

        }else{
            System.out.println("El valor ingresado no es correcto");
        }
        return saldo;
    }

    /**
     * Método que contiene las opciones del cajero
     */
    public void opcionesCajero(){
        System.out.println("------- CAJERO AUTOMÁTICO ------");
        System.out.println("| Opciones:                    |");
        System.out.println("|  1: Depositar                |");
        System.out.println("|  2: Retirar                  |");
        System.out.println("|  3: Consultar Saldo          |");
        System.out.println("|  4: Salir                    |");
        System.out.println("--------------------------------");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
