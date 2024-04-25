package com.diegocayo.tema10.ejercicios.ejercicio06;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
    private HashMap<String, String> diccionario;
    private Scanner lector = new Scanner(System.in);

    public Diccionario() {
        diccionario = new HashMap<>();
    }


    public void introducirParejas() {
        System.out.println("¿Cuántas parejas deseas introducir? ");
        int numParejas = lector.nextInt();

        for (int i = 0; i < numParejas; i++) {
            System.out.println("Introduce palabra en inglés: ");
            String palabraIngles = lector.nextLine();
            System.out.println("Introduce traducción al valenciano: ");
            String palabraValenciano = lector.nextLine();

            diccionario.put(palabraIngles, palabraValenciano);
        }


    }

    public void traducirPalabra() {
        System.out.println("Introduce la palabra en ingles que deseas traducir: ");
        String palabraIngles = lector.nextLine();
        String palabra = diccionario.get(palabraIngles);
        diccionario.get(palabra);
        System.out.println("La palabra en valenciano es: " + palabra);
    }

}

