package aparatos;


public class Smartwatch extends Reloj {
    public Smartwatch(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    public void mostrarNotificaciones() {
        System.out.println("Mostrando notificaciones...");
    }

    public void medirRitmoCardiaco() {
        System.out.println("Midiendo ritmo cardíaco...");
    }

    public void sincronizarConTelefono() {
        System.out.println("Sincronizando con el teléfono...");
    }
}
