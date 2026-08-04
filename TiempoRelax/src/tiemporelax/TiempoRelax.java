/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro 1.Seleccion Multiples a.Estructura b.Tipos de Condicion
 * 2.Formateo de Cadenas (printf)
 */
public class TiempoRelax {

    /**
     * @param args the command line arguments
     */
    /**
     * Desarrollar un algoritmo que me permite escoger un pais a visitar.
     * Posterior a ello, debemos nosostros escoger las posibles ciudades. a
     * recorrer, sin embargo, solo se puede una ciudad.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int seleccionMenu = 0;
        char seleccionSubMenu = '@';

        System.out.println("Agencia de Viajes");
        System.out.printf("|%20s| |%-20s| \n", "Taniha's Travel", "Buen Viaje");
        System.out.println("--------------------------------------------");
        System.out.println("1.Japon");
        System.out.println("2.Francia");
        System.out.println("3.Nueva Zelanda");
        System.out.println("4.Canada");
        System.out.println("Respuesta: ");
        seleccionMenu = entrada.nextInt();

        switch (seleccionMenu) {
            case 1:
                System.out.println("Nihon e yokoso");
                System.out.println("Bienvenido a Japon");
                System.out.println("------------------");
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kioto");
                System.out.println("Respuesta: ");

                entrada.nextLine();
                seleccionSubMenu = entrada.nextLine().toUpperCase().charAt(0);

                switch (seleccionSubMenu) {
                    case 'A':
                        System.out.println("Super Nintendo World Tour");
                        break;
                    case 'B':
                        System.out.println("Car Meet");
                        break;
                    case 'C':
                        System.out.println("Pabellon Dorado segun Google");
                        break;
                    default:
                        System.out.println("Cualquier ciudad....");
                        System.out.println("Por que no esta la opcion");
                        System.out.println("Que escogiste");
                        break;
                }
                break;
            case 2:
                System.out.println("Bienvenue a France");
                System.out.println("Bienvenido a Francia");
                System.out.println("1. Paris");
                System.out.println("2. Marsella");
                System.out.println("3. Lyon");
                System.out.println("Respuesta: ");

                entrada.nextLine();
                seleccionSubMenu = entrada.nextLine().toUpperCase().charAt(0);

                switch (seleccionSubMenu) {
                    case '1':
                        System.out.println("Torre Eiffel");
                        break;
                    case '2':
                        System.out.println("Palacio de Marshella");
                        break;
                    case '3':
                        System.out.println("El Estadio!!");
                        break;
                    default:
                        System.out.println("Lea ombe...no esta la opcion esa");
                        break;
                }
                break;
            case 3:
                System.out.println("Nau mai, haere mai!");
                System.out.println("Bienvenido a Nueva Zelanda");
                System.out.println("--------------------------");
                System.out.println("A. Sky Tower");
                System.out.println("B. Hogbbiton");
                System.out.println("C. Mildford Sound");

                entrada.nextLine();
                seleccionSubMenu = entrada.nextLine().toUpperCase().charAt(0);

                if (seleccionSubMenu == 'A') {
                    System.out.printf("%s Sky Tower %s", "\u001B[31m", "\u001B[0m");

                } else if (seleccionSubMenu == 'B') {
                    System.out.printf("%s Hogbbiton %s", "\u001B[32m", "\u001B[0m");

                } else if (seleccionSubMenu == 'C') {
                    System.out.printf("%s Mildford Sound %s", "\u001B[34m", "\u001B[0m");
                } else {
                    System.out.println("Usted no lee va?!!!");
                }
                break;
            case 4:
                System.out.println("Welcome to Canada");
                System.out.println("Bienvenido a Canada");
                break;
        }//Fin switch

    }//Fin de main

}//Fin de class 
