package vehiculos;


public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println("El vehículo " + marca + " " + modelo + " está arrancando.");
    }

    public void detener() {
        System.out.println("El vehículo " + marca + " " + modelo + " está detenido.");
    }
}
