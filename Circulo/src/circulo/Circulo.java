/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * 2. Uso de la librería Math Desarrolle un programa que pida al usuario el radio de un círculo. 
         * Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, 
         * calcule el área y circunferencia de dicho círculo y muestre el resultado al usuario.
         */
        
        Scanner entrada = new Scanner(System.in);
        
        //Declarar Variables
        
        double radio=0;
        double area=0;
        double circunferencia=0;
        
        System.out.println("Bienvenido, ingrese el radio de su circulo en cm");
        radio = entrada.nextDouble();
        area =Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.printf("El area de su circulo es %.2fcm2 y la circunferencia es de %.2fcm",area,circunferencia);
    }
    
}
