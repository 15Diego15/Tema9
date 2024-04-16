package com.diegocayo.tema09.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio03 {
    private Scanner lector = new Scanner(System.in);
    public Ejercicio03() {
        solicitarNumeros();
    }

    public void solicitarNumeros(){
        int numeroMayor = Integer.MIN_VALUE;
        boolean numeroIngresado = false;


        while (!numeroIngresado){
            try {
                System.out.println("Ingrese un número:");
                int numero = lector.nextInt();
                numeroIngresado = false;
                if (numero > numeroMayor) {
                    numeroMayor = numero;
                }
            } catch (InputMismatchException e) {
                numeroIngresado = true;
            }

        }
        System.out.println("El número más alto ingresado es: " + numeroMayor);

    }
}
