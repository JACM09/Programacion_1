/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificaciondescuento;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class ClasificacionDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * 2. Clasificación de Descuentos en Tienda de Software Enunciado Una
         * tienda de software ofrece descuentos basados en la edad del cliente y
         * si tiene una membresía premium. Se tiene que solicitar la edad y si
         * tiene membresía ('S' para sí, 'N' para no). • Primero, se tiene que
         * verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
         * o Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene
         * membresía. Si cumple alguna de las condiciones, recibe un 20% de
         * descuento. Si no, recibe un 10%. o Si es menor de edad: Verificar si
         * tiene membresía 'S' y tiene más de 12 años. Si es así, recibe un 15%
         * de descuento. De lo contrario, no tiene descuento (0%). El programa
         * debe calcular y mostrar el descuento final aplicado y también el
         * precio de venta original y el nuevo total que se tiene que pagar por
         * el juego.
         */
        
        Scanner entrada = new Scanner(System.in);
        
        int edad = 0;
        char res= 'a';
        double precioriginal = 0;
        double preciodescuento = 0;
        double preciofinal = 0;
        
        System.out.println("Bienvenido a VideoGames");
        
        System.out.println("Ingrese el total de su compra");
        precioriginal = entrada.nextDouble();
        
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        
        System.out.println("usted cuenta con una tarjeta de membresia? S = SI N = NO");
        entrada.nextLine();
        res = entrada.nextLine().toUpperCase().charAt(0);
        
        if (edad >= 18) {

            if (edad >= 65 || res == 'S') {

                System.out.println("Felicidades tiene un descuento del 20%");
                preciodescuento = precioriginal * 0.20;
                preciofinal = precioriginal - preciodescuento;
                System.out.println("--------------------------------------");
                System.out.printf("Su pago inicial era de %.2f\n", precioriginal);
                System.out.printf("Su descuento del 20xciento es %.2f\n", preciodescuento);
                System.out.printf("Su pago final es %.2f\n", preciofinal);

            } else {

                System.out.println("Felicidades tiene un descuento del 10%");
                preciodescuento = precioriginal * 0.10;
                preciofinal = precioriginal - preciodescuento;
                System.out.println("--------------------------------------");
                System.out.printf("Su pago inicial era de %.2f\n", precioriginal);
                System.out.printf("Su descuento del 10xciento es %.2f\n", preciodescuento);
                System.out.printf("Su pago final es %.2f\n", preciofinal);

            }

        } else if (edad <= 17 && edad >= 12 && res == 'S') {

            System.out.println("Felicidades tiene un descuento del 15%");
            preciodescuento = precioriginal * 0.15;
            preciofinal = precioriginal - preciodescuento;
            System.out.println("--------------------------------------");
            System.out.printf("Su pago inicial era de %.2f\n", precioriginal);
            System.out.printf("Su descuento del 15xciento es %.2f\n", preciodescuento);
            System.out.printf("Su pago final es %.2f\n", preciofinal);

        } else {
        
            System.out.println("Lo sentimos de momento no cuenta con ningun descuento");
            preciofinal = precioriginal;
            System.out.println("--------------------------------------");
            System.out.printf("Su pago final es %.2f\n", preciofinal);
            
        }
        
    } //Fin de Main
    
} //Fin de Class
