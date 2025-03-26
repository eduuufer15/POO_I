package aparatos;


public class Telefono {
    private String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public void marcarNumero() {
        System.out.println("Marcando el número: " + numero);
    }

    public void colgar() {
        System.out.println("Colgando el teléfono...");
    }
}
