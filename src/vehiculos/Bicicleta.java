package vehiculos;


public class Bicicleta extends Vehiculo {
    private int tamanioRueda;

    public Bicicleta(String marca, String modelo, int tamanioRueda) {
        super(marca, modelo);
        this.tamanioRueda = tamanioRueda;
    }

    public void pedalear() {
        System.out.println("Pedaleando la bicicleta...");
    }

    public void frenar() {
        System.out.println("Frenando la bicicleta...");
    }
}
