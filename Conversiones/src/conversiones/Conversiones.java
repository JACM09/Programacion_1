/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;
import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Objetivos
        1. Orden secuencial de instrucciones
        2. Capturar datos del teclado
        3. Operaciones aritmeticas 
        
        Desarrollar un algoritmo que me permita convertir los siguiuentes elementos:
        1. Pulgadas a Centimetros 
        2. Kilometros a Millas 
        3. Grados Farenheit a Grados Celsius
        */
        
        Scanner teclado = new Scanner(System.in);
        
        //Declarar Variables 
        
        int pulgadas = 0;
        double resultadoCM = 0;
        double gcelcius;
        double gfaren;
        double kilometros;
        double millas;
        
        pulgadas = 10; //Los datos van de der a izq -> = 
        resultadoCM = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadoCM);
        
        pulgadas = 35; //Los datos van de der a izq -> = 
        resultadoCM = pulgadas * 2.54;
        System.out.printf("\n%.2f cm es igual a %d pulgadas",resultadoCM,pulgadas);
        
        System.out.println("\nCuantos kilometros hay de TGU - SPS?");
        kilometros = teclado.nextDouble();
        millas = kilometros / 1.6;
        System.out.printf("%.2f km es igual a %.2f millas",kilometros,millas);
        
        System.out.println("\nIngrese los grados Farenheit");
        gfaren = teclado.nextDouble();
        gcelcius = (gfaren -32) * 5/9;
        System.out.printf("%.2f Grados Farenheit es igual %.2f Grados Celcius",gfaren,gcelcius);
    } //Fin de Main
    
} //Fin de Class
