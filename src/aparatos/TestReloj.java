package aparatos;


public class TestReloj {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(10, 30, 45);
        reloj.mostrarHora();
        reloj.ajustarHora(12, 45, 0);
        reloj.mostrarHora();
    }
}
