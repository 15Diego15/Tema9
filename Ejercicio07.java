package com.diegocayo.tema09.ejercicios;

import java.util.Arrays;
public class Ejercicio07 {
    private final String[] array;

    public Ejercicio07() {
        this.array = new String[]{
                "Hola mundo",
                "Hello world",
                null,
                null,
                "Hola mundo"
        };

        mostrarCadenasArray(array);
    }

    public void mostrarCadenasArray(String[] array) {
        for (String cadena : array) {
            try {
                if (!cadena.isEmpty()) {
                    System.out.println("El primer caracter de " + cadena + " es: " + cadena.charAt(0));
                }
            } catch (NullPointerException NPE) {
                System.out.println("La cadena es nula");
            }
        }
    }
}
