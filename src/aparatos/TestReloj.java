package aparatos;

public class TestReloj {
    public static void main(String[] args) {
        Reloj r1 = new Reloj();
        r1.mostrarHora();
        r1.incrementarMinuto();
        r1.mostrarHora();
    }
}