package com.diegocayo.tema09.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
    private Scanner lector = new Scanner(System.in);
    public Ejercicio04(){
        solicitarNumeros();
    }

    public void solicitarNumeros() {
        int[] numeros = new int[10];
        int numero;

            try {
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println("Ingrese un número. ");
                    numero = Integer.parseInt(lector.nextLine());
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido. ");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("El array esta completo. ");
                for (int i : numeros) {
                    System.out.println(i);
                }
                System.exit(0);
            }

    }
}
