package main;

import aparatos.Reloj;
import aparatos.Telefono;
import vehiculos.Automovil;

public class Main {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(10, 30, 45);
        reloj.mostrarHora();
        
        Telefono telefono = new Telefono("123456789");
        telefono.marcarNumero();
        
        Automovil auto = new Automovil("Toyota", "Corolla", "Sedan");
        auto.arrancar();
        auto.velocidadMaxima();
    }
}
