package taller1;

public class EjecutarCelular {
    public static void main(String[] args) {
        // Creación de objeto celular
        Celular celular = new Celular();
        celular.actualizar_marca("Samnsung");
        celular.actualizar_sistema_operativo("Android");
        celular.actualizar_bateria("3.400 mAh");
        celular.actualizar_almacenamiento("32 GB");
        celular.actualizar_ram("2 GB");
        celular.actualizar_color("Dorado");
        String mostrar_celular = celular.obtener_celular();
        System.out.println(mostrar_celular);

        System.out.println("\nInformación:");
        System.out.println(celular.llamar());
        System.out.println(celular.escuchar_musica());
        System.out.println(celular.tomar_fotos());
        System.out.println(celular.enviar_mensajes());
        System.out.println(celular.jugar());
    }
}
