package com.diegocayo.tema09.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    private Scanner lector = new Scanner(System.in);

    public Ejercicio01() {
        solicitarNumeros();
    }

    public void solicitarNumeros() {
        int[] numeros = new int[30];
        int numero;

        while (true) {
            try {
                System.out.println("Ingrese un número. ");
                numero = Integer.parseInt(lector.nextLine());
                if (numero < 0) {
                    System.out.println("Saliendo...");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido. ");
            }
        }

    }
}

