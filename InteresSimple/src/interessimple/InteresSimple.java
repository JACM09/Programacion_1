/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * 3. Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema
              debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
              en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
         */
        
        Scanner entrada = new Scanner(System.in);
        
        //Declarar Variables
        
        int capinicial=0;
        int intanual=0;
        int años=0;
        int intgenerado=0;
        
        System.out.println("Bienvenido al banco");
        System.out.println("Ingrese su capital inicial");
        capinicial=entrada.nextInt();
        System.out.println("Ingrese el interes anual");
        intanual=entrada.nextInt();
        System.out.println("Ingrese el tiempo del prestamo");
        años=entrada.nextInt();
        intgenerado=(capinicial*intanual*años)/100;
        
        System.out.printf("Su capital inicial es de %dLps. Con un interes anual del %dporciento en un tiempo de "
                + "%danios",capinicial,intanual,años);
        System.out.printf("\nEl interes total generado es de %dLps.",intgenerado);
        
    }
    
}
