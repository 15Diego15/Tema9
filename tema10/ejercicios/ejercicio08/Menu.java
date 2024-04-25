package com.diegocayo.tema10.ejercicios.ejercicio08;

import java.util.Scanner;

class Menu {
    private Scanner lector = new Scanner(System.in);
    private Diccionario diccionario;

    public Menu(Diccionario diccionario) {
        this.diccionario = diccionario;
    }
    /*
    * Método que contiene el menu
    * */
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

    /**
     * Muestra el menú de opciones y permite al usuario realizar operaciones en el diccionario.
     * El usuario puede elegir entre añadir palabra, modificar palabra, eliminar palabra,
     * consultar palabra, mostrar diccionario o salir del programa.
     */
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


    /**
     * Permite al usuario introducir una cantidad determinada de palabras y sus definiciones en el diccionario.
     *
     * Este método solicita al usuario que ingrese el número de palabras que desea agregar al diccionario.
     * Luego, solicita al usuario que ingrese cada palabra y su definición, y las agrega al diccionario utilizando el método `anadirPalabra`.
     */
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

    /**
     * Permite al usuario modificar la definición de una palabra existente en el diccionario.
     *
     * Este método solicita al usuario que ingrese la palabra que desea modificar.
     * Luego verifica si la palabra existe en el diccionario. Si la palabra existe,
     * solicita al usuario que ingrese la nueva definición de la palabra y realiza la modificación
     * utilizando el método `modificarPalabra`. Si la palabra no existe en el diccionario,
     * muestra un mensaje indicando que la palabra no existe.
     */
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

    /**
     * Permite al usuario eliminar una palabra del diccionario.
     *
     * Este método solicita al usuario que ingrese la palabra que desea eliminar.
     * Luego verifica si la palabra existe en el diccionario. Si la palabra existe,
     * la elimina utilizando el método `eliminarPalabra`. Si la palabra no existe en el diccionario,
     * muestra un mensaje indicando que la palabra no existe.
     */

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

    /**
     * Permite al usuario consultar la definición de una palabra en el diccionario.
     *
     * Este método solicita al usuario que ingrese la palabra que desea consultar.
     * Luego, utiliza el método `consultarDefinicion` del diccionario para obtener la definición de la palabra.
     * Finalmente, muestra la definición por pantalla.
     */
    private void consultarPalabra() {
        System.out.print("Introduce la palabra a consultar: ");
        String palabra = lector.nextLine();

        String definicion = diccionario.consultarDefinicion(palabra);
        System.out.println(definicion);
    }

    /**
     * Muestra todas las palabras y definiciones almacenadas en el diccionario.
     *
     * Este método invoca el método `mostrarDiccionario` del objeto diccionario,
     * el cual se encarga de mostrar por pantalla todas las palabras y sus definiciones almacenadas en el diccionario.
     */
    private void mostrarDiccionario() {
        diccionario.mostrarDiccionario();
    }
}
