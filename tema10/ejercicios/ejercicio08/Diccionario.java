package com.diegocayo.tema10.ejercicios.ejercicio08;

import java.util.HashMap;

class Diccionario {
    private final HashMap<String, String> diccionario = new HashMap<>();

    public void anadirPalabra(String palabra, String definicion) {
        diccionario.put(palabra, definicion);
    }

    public void modificarPalabra(String palabra, String nuevaDefinicion) {
        diccionario.put(palabra, nuevaDefinicion);
    }

    public void eliminarPalabra(String palabra) {
        diccionario.remove(palabra);
    }

    public String consultarDefinicion(String palabra) {
        return diccionario.get(palabra);
    }

    public void mostrarDiccionario() {
        System.out.println("Palabras en el diccionario:");
    }
}