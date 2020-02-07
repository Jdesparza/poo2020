package taller1;

public class EjecutarComputadora {
    public static void main(String[] args) {
        // Creación de objeto computadora
        Computadora computadora = new Computadora();
        computadora.actualizar_tamanio("Grande");
        computadora.actualizar_tipo_computadora("Portatil");
        computadora.actualizar_sistema_operativo("Windows 10");
        computadora.actualizar_tarjeta_video("GTX1050");
        computadora.actualizar_disco_duro("HDD SATA de 500 GB");
        computadora.actualizar_memoria_ram("DDR4 integrada de 4 GB");
        String mostrar_computadora = computadora.obtener_computadora();
        System.out.println(mostrar_computadora);

        System.out.println("\nInformación:");
        System.out.println(computadora.procesar());
        System.out.println(computadora.almacenar());
        System.out.println(computadora.organizar());
        System.out.println(computadora.transmitir());
    }
}
