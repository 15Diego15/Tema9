package com.diegocayo.tema10.ejercicios.ejercicio08;

import java.util.Scanner;

class Menu {
    private Scanner lector = new Scanner(System.in);
    private Diccionario diccionario;

    public Menu(Diccionario diccionario) {
        this.diccionario = diccionario;
    }
    public void menu(){
        System.out.println("***********************");
        System.out.println("* GESTIÓN DICCIONARIO *");
        System.out.println("***********************");
        System.out.println("1. Añadir palabra");
        System.out.println("2. Modificar palabra");
        System.out.println("3. Eliminar palabra");
        System.out.println("4. Consultar palabra");
        System.out.println("5. Mostrar diccionario");
        System.out.println("---------------------");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void mostrarMenu() {
        int opcion;
        do {
           menu();
           opcion = Integer.parseInt(lector.nextLine());


           switch (opcion) {
               case 1:
                   anyadirPalabra();
                   break;
               case 2:
                   modificarPalabra();
                   break;
               case 3:
                   eliminarPalabra();
                   break;
               case 4:
                   consultarPalabra();
                   break;
               case 5:
                   mostrarDiccionario();
                   break;
               case 0:
                   System.out.println("Saliendo...");
                   break;
               default:
                   System.out.println("Opción no válida.");
                   break;
           }
        } while (opcion != 0);
    }

    private void anyadirPalabra() {
        System.out.println("¿Cuántas palabras deseas introducir? ");
        int numPalabra = Integer.parseInt(lector.nextLine());;
        for (int i = 0; i < numPalabra; i++) {
            System.out.print("Introduce la palabra a añadir: ");
            String palabra = lector.nextLine();
            System.out.print("Introduce la definición de la palabra: ");
            String definicion = lector.nextLine();

            diccionario.anadirPalabra(palabra, definicion);
        }

    }

    private void modificarPalabra() {
        System.out.print("Introduce la palabra que desea modificar: ");
        String palabra = lector.nextLine();

        if (diccionario.consultarDefinicion(palabra) == null) {
            System.out.println("La palabra no existe en el diccionario.");
        } else {
            System.out.print("Introduce la nueva definición de la palabra: ");
            String nuevaDefinicion = lector.nextLine();
            diccionario.modificarPalabra(palabra, nuevaDefinicion);
            System.out.println("Palabra modificada correctamente.");

        }
    }

    private void eliminarPalabra() {
        System.out.print("Introduce la palabra a eliminar: ");
        String palabra = lector.nextLine();

        if (diccionario.consultarDefinicion(palabra) != null) {
            System.out.println("La palabra no existe en el diccionario.");
        } else {
            diccionario.eliminarPalabra(palabra);
            System.out.println("Palabra eliminada correctamente del diccionario.");
        }
    }

    private void consultarPalabra() {
        System.out.print("Introduce la palabra a consultar: ");
        String palabra = lector.nextLine();

        String definicion = diccionario.consultarDefinicion(palabra);
        System.out.println(definicion);
    }

    private void mostrarDiccionario() {
        diccionario.mostrarDiccionario();
    }
}
