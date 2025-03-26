package vehiculos;


public class Automovil extends Vehiculo {
    private String tipoCarroceria;

    public Automovil(String marca, String modelo, String tipoCarroceria) {
        super(marca, modelo);
        this.tipoCarroceria = tipoCarroceria;
    }

    public void velocidadMaxima() {
        System.out.println("La velocidad máxima del " + tipoCarroceria + " es 200 km/h.");
    }
}
