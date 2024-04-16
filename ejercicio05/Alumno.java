package com.diegocayo.tema09.ejercicios.ejercicio05;

import java.util.Scanner;

public class Alumno {
    private String nombre;
    private int edad;
    private double altura;


    public Alumno(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }


    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

}
