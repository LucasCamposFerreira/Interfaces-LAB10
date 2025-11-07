public class Computador {

    public void conectarDispositivo(DispositivoConectavel dispositivo) {
        System.out.println("Conectando: " + dispositivo.getTipo());
        dispositivo.conectar();
        System.out.println();
    }

    public void desconectarDispositivo(DispositivoConectavel dispositivo) {
        System.out.println("Desconectando: " + dispositivo.getTipo());
        dispositivo.desconectar();
        System.out.println();
    }
}
