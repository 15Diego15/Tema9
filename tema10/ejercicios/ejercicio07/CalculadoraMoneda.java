package com.diegocayo.tema10.ejercicios.ejercicio07;

import java.util.HashMap;
import java.util.Scanner;

public class CalculadoraMoneda {
    private HashMap<Double, Double> calculadoramoneda;
    private Scanner lector = new Scanner(System.in);
    private Ej7Menu ej7Menu = new Ej7Menu();

    public CalculadoraMoneda() {
        calculadoramoneda = new HashMap<>();
    }

    public void cambioMoneda() {
        ej7Menu.menu();
        int opcionMoneda = lector.nextInt();
        double cantidadMoneda;
        switch (opcionMoneda) {
            case 1:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*1.07);
                cambio(cantidadMoneda);
            case 2:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*0.86);
                cambio(cantidadMoneda);
            case 3:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*89.3);
                cambio(cantidadMoneda);
            case 4:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*1.65);
                cambio(cantidadMoneda);
            case 5:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*1.47);
                cambio(cantidadMoneda);
            case 6:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*936.3);
                cambio(cantidadMoneda);
            case 7:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*7.34);
                cambio(cantidadMoneda);
            case 8:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*1014.87);
                cambio(cantidadMoneda);
            case 9:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*4201.29);
                cambio(cantidadMoneda);
            case 10:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*535.05);
                cambio(cantidadMoneda);
            case 11:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*25.73);
                cambio(cantidadMoneda);
            case 12:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*62.71);
                cambio(cantidadMoneda);
            case 13:
                System.out.println("Introduzca el valor que quiere cambiar");
                cantidadMoneda = lector.nextDouble();
                calculadoramoneda.put(cantidadMoneda, cantidadMoneda*18.42);
                cambio(cantidadMoneda);

        }
    }

    public void cambio(double cantidadMoneda){
        double cambio = calculadoramoneda.get(cantidadMoneda);
        System.out.println(cambio);
    }




}
