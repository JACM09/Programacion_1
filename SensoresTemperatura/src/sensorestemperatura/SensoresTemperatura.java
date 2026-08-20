/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensorestemperatura;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class SensoresTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double temp = 0;
        double temMax = -Double.MAX_VALUE;
        double temMin = Double.MAX_VALUE;
        int tempCorrect = 0;
        double promTemp = 0;
        double acumTemp = 0;
        double diferTemp = 0;
        
        while (temp != -999) {

            System.out.println("Bienvenido al sistema de monitoreo de temperatura");
            System.out.println("Si desea salir ingrese el valor centinela = -999");
            System.out.println("Ingrese la temperatura actual registrada en grados Celsius");
            
            temp = sc.nextDouble();

            if (temp < -273.15 && temp != -999) {
                System.out.println("Error: La temperatura mas baja posible es -273.15C");
            } else {
                if (temp > temMax && temp != -999) {
                    temMax = temp;
                }//Fin de if
                if (temp < temMin && temp != -999){
                    temMin = temp;
                }//Fin de if
                if (temp != -999){
                    tempCorrect++;
                    acumTemp = acumTemp + temp;
                }//Fin de if
            }//Fin de if-else

        }//Fin de While
        promTemp = acumTemp / tempCorrect;
        diferTemp = temMax - temMin;
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("                         RESUMEN                           ");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("La temperatura maxima fue: %.2f\n",temMax);
        System.out.printf("La temperatura minima fue: %.2f\n",temMin);
        System.out.printf("El promedio de las temperaturas fue: %.2f\n",promTemp);
        System.out.printf("La diferencia termica es: %.2f\n",diferTemp);
        
    } //Fin de Main
    
}//Fin de Class
