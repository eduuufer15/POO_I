package vehiculos;

public class Vehiculo {
    private String matricula;
    private String tipo;
    private short anioFabricacion;
    private int kilometraje;
    private boolean requiereMantenimiento;

    public Vehiculo(String matricula, String tipo, short anioFabricacion, int kilometraje) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }

    public void mostrar() {
        System.out.printf("Vehículo [%s] (%s) del año %d con %d km. Requiere mantenimiento: %s.%n", 
            matricula, tipo, anioFabricacion, kilometraje, requiereMantenimiento ? "Si" : "No");
    }

    public boolean actualizarKilometraje(int nuevoKilometraje) {
        if (nuevoKilometraje > kilometraje) {
            kilometraje = nuevoKilometraje;
            return true;
        }
        return false;
    }

    public int calcularAntiguedad() {
        return 2024 - anioFabricacion;
    }
}