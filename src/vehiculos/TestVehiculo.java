package vehiculos;

public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Coche", (short) 2015, 45000);
        v1.mostrar();
        v1.actualizarKilometraje(50000);
        v1.mostrar();
    }
}