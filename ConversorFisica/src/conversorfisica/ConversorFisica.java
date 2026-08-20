/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorfisica;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class ConversorFisica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 0;
        double num = 0;
        double res = 0;

        System.out.println("Bienvenido al Conversor de unidades");
        do {
            System.out.println("Ingrese una de las siguientes opciones:");
            System.out.println("1-Metros a Pies");
            System.out.println("2-Kilogramos a Libras");
            System.out.println("3-Centimetros a Pulgadas");
            System.out.println("4-Salir");
            op = sc.nextInt();

            System.out.println("Ingrese la cantidad que desea convertir:");
            num = sc.nextDouble();

            switch (op) {
                case 1:
                    do {
                        if (num < 0) {
                            System.out.println("El numero que ingreso no es valido ingrese un numero positivo");
                            num = sc.nextDouble();
                        }
                    } while (num < 0);
                    res = num * 3.28084;
                    System.out.printf("La cantidad de %.2f M es igual %.2f P\n", num, res);
                    break;
                case 2:
                    do {
                        if (num < 0) {
                            System.out.println("El numero que ingreso no es valido ingrese un numero positivo");
                            num = sc.nextDouble();
                        }
                    } while (num < 0);
                    res = num * 2.20462;
                    System.out.printf("La cantidad de %.2f K es igual %.2f L\n", num, res);
                    break;
                case 3:
                    do {
                        if (num < 0) {
                            System.out.println("El numero que ingreso no es valido ingrese un numero positivo");
                            num = sc.nextDouble();
                        }
                    } while (num < 0);
                    res = num / 2.54;
                    System.out.printf("La cantidad de %.2f C es igual %.2f P\n", num, res);
                    break;
                case 4:
                    System.out.println("Gracias por su tiempo");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }//Fin de Switch
        } while (op != 4);//Fin de do while

    }//Fin de Main
    
}//Fin de Class
