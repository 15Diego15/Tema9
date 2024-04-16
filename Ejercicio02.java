package com.diegocayo.tema09.ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

    private static Scanner lector = new Scanner(System.in);

    public Ejercicio02(){
        solicitarNumeros();
    }

    public void solicitarNumeros(){
        int[] numeros = new int[10];
        int contadorExcepciones = 0;
        int contadorNumeros = 0;


        while (contadorNumeros <10){
            try{
                System.out.println("Introduce un número: ");
                int numero = Integer.parseInt(lector.nextLine());
                contadorNumeros++;
            } catch (NumberFormatException e){
                System.out.println("Ingrese un número válido. ");
                contadorExcepciones++;
            }
        }
        for (int i : numeros) {
            System.out.println(i);
        }

        System.out.println("El número de veces que ha saltado la excepción es: " + contadorExcepciones);

    }
}
