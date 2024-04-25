package com.diegocayo.tema10.ejercicios.ejercicio06;
import java.util.Scanner;
public class Ejercicio06 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        int opcionMenu;
        do {


        Ej6Menu.menu();
        opcionMenu = lector.nextInt();

        switch (opcionMenu) {
            case 0:
                System.out.println("Saliendo...");
                System.exit(1);
                break;
            case 1:
                diccionario.introducirParejas();
                break;
            case 2:
                diccionario.traducirPalabra();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        } while (opcionMenu != 0);
    }



}
