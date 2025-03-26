package aparatos;

public class Reloj {
    private int horas = 0;
    private int minutos = 0;
    private String modelo = "BASIC-WATCH";
    private boolean en24Horas = true;

    public void mostrarHora() {
        if (en24Horas) {
            System.out.printf("Reloj (%s): %02d:%02d.%n", modelo, horas, minutos);
        } else {
            System.out.printf("Reloj (%s): %d:%02d %s.%n", modelo, horas % 12, minutos, horas < 12 ? "AM" : "PM");
        }
    }

    public boolean incrementarMinuto() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            return incrementarHora();
        }
        return true;
    }

    public boolean incrementarHora() {
        horas++;
        if (horas == 24) {
            horas = 0;
            return true;
        }
        return true;
    }

    public boolean cambiarFormato() {
        en24Horas = !en24Horas;
        return true;
    }

    public boolean reiniciar() {
        horas = 0;
        minutos = 0;
        return true;
    }

    public boolean setHora(int horas, int minutos) {
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60) {
            this.horas = horas;
            this.minutos = minutos;
            return true;
        }
        return false;
    }
}