package com.diegocayo.tema10.ejercicios.ejercicio08;

public class Ejercicio08 {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        Menu menu = new Menu(diccionario);

        menu.mostrarMenu();
    }
}
