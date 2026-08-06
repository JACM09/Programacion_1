/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkrestaurante;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class CheckRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Desarrollar un algoritmo que simule la cuenta de un restaurante
         * que se tiene que pagar entre un grupo de amigos (7) dividido 
         * en partes iguales
         */
        
        Scanner entrada = new Scanner(System.in);
        
        int numPersona = 1;
        double promedioPago=0;
        int gastoIndividual=0;
        int gastoAcumulado=0;
        
        while(numPersona<=7){
            System.out.printf("Persona %d. Cuanto consumiste\n",numPersona);
            gastoIndividual = entrada.nextInt();
            
            gastoAcumulado += gastoIndividual;
            
            System.out.printf("P: %d\tGasto Ind: %d\tGasto Acum: %d\n",
                    numPersona,
                    gastoIndividual,
                    gastoAcumulado);
            
            numPersona++;
        }
        numPersona--;
        
        System.out.printf("Total Persona: %d",numPersona);
        promedioPago = gastoAcumulado / numPersona;
        
        System.out.printf("\nGasto Promedio por Persona: %.2f",promedioPago);
        
    }//fin de Main
    
}//Fin de Class
