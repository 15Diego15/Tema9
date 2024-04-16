package com.diegocayo.tema09.ejercicios.ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el primer alumno: ");
        Alumno alumno = nuevoAlumno();
        System.out.println("Ingrese el segundo alumno: ");
        Alumno alumno2 = nuevoAlumno();
        System.out.println("Datos de los alumnos\n");
        mostrarInformacion(alumno);
        System.out.println("-------------");
        mostrarInformacion(alumno2);

        ordernarMayor(alumno, alumno2);
    }

    public static Alumno nuevoAlumno() {
        String nombre;
        int edad = 0;
        double altura = 0;
        boolean correcto = false;

        System.out.println("Introduce el nombre del alumno:");
        nombre = lector.nextLine();

        while(!correcto) {
            try {
                System.out.println("Introduce la edad del alumno:");
                edad = Integer.parseInt(lector.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Introduzca un número valido");
            }
        }
        correcto = false;
        while(!correcto) {
            try {
                System.out.println("Introduce la altura del alumno:");
                altura  = Double.parseDouble(lector.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Introduzca un número valido");
            }
        }

        return new Alumno(nombre, edad, altura);
    }

    public static void mostrarInformacion(Alumno alumno){
        System.out.println("nombre: " + alumno.getNombre());
        System.out.println("edad: " + alumno.getEdad());
        System.out.println("altura: " + alumno.getAltura());
    }
    public static void ordernarMayor(Alumno alumno1, Alumno alumno2){
        if (alumno1.getEdad() > alumno2.getEdad()) {
            System.out.println("\nEl alumno " + alumno1.getNombre() + " es mayor que el alumno " + alumno2.getNombre());
        } else if (alumno1.getEdad() < alumno2.getEdad()) {
            System.out.println("\nEl alumno " + alumno2.getNombre() + " es mayor que el alumno " + alumno1.getNombre());
        } else {
            System.out.println("\nAmbos tienen la misma edad");
        }
    }




}
