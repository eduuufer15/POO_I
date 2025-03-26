package main;

import aparatos.Reloj;
import aparatos.Telefono;
import utilidades.GeneradorContraseñas;
import vehiculos.Automovil;

public class EjemploUso {
    public static void main(String[] args) {
        // Usar la clase Reloj
        Reloj reloj = new Reloj(10, 30, 45);
        reloj.mostrarHora();

        // Usar la clase Telefono
        Telefono telefono = new Telefono("987654321");
        telefono.marcarNumero();

        // Usar la clase Automovil
        Automovil automovil = new Automovil("Ford", "Mustang", "Deportivo");
        automovil.arrancar();
        automovil.velocidadMaxima();

        // Usar la clase GeneradorContraseñas
        GeneradorContraseñas generador = new GeneradorContraseñas();
        String contraseña = generador.generarContraseña(12);
        System.out.println("Contraseña generada: " + contraseña);
    }
}
