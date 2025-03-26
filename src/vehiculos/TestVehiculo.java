package vehiculos;


public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        vehiculo.arrancar();
        vehiculo.detener();
    }
}
