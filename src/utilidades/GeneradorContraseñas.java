package utilidades;


import java.security.SecureRandom;

public class GeneradorContraseñas {
    private static final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    private static final SecureRandom random = new SecureRandom();

    public String generarContraseña(int longitud) {
        StringBuilder contraseña = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(indice));
        }
        return contraseña.toString();
    }
}
