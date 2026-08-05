/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Cálculo con dos variables Escribir un programa que solicite al usuario la base y la altura de un
           rectángulo. Utilice estas dos variables para calcular el área del rectángulo (Base X Altura) y el
           perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla.
         */
        
        Scanner entrada = new Scanner(System.in);
        
        //Declarar Variables
        
        double base=0;
        double altura=0;
        double area=0;
        double perimetro=0;
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese la base del rectangulo en cm.(Decimal o entero)");
        base=entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo en cm.(Decimal o entero)");
        altura=entrada.nextDouble();
        area=base*altura;
        perimetro=(base+altura)*2;
        System.out.printf("El area del rectangulo es %.2fcm y su perimetor es de %.2fcm",area,perimetro);
        
    }
    
}
