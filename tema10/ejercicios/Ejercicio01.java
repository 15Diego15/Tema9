/*
Implementa un método que reciba como parámetro una Array de números enteros
y devuelva una lista (ArrayList) en la que primero aparezcan los números pares
y después los impares. Posteriormente, genera una lista de 10 números enteros
aleatorios entre 0 y 50 y aplica el método anterior. Un ejemplo de ejecución del programa sería:
* */

package com.diegocayo.tema10.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ejercicio01 {


    public Ejercicio01(){
        Random random = new Random();
        //datos[i] = random.nextInt(51);

       // System.out.println(Arrays.toString(datos));
        ArrayList<Integer> datosArrayList = new ArrayList<>();
        System.out.println(datosArrayList);
    }


    public List<Integer> numParOImpar(int[] array){
        ArrayList<Integer> numeros = new ArrayList<>(array.length);

        for (int i = 0; i < array.length; i++) {
            numeros.add(0);
        }

        int indexImpares = 0;
        int indexPares = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numeros.set(indexPares--,array[i]);
            } else {
                numeros.set(indexImpares--, array[i]);
            }
        }
        return numeros;
    }



}
