/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class CicloFor {

    /**
     * Se quiere contabilizar la cantidad de minutas que se entregan a los niños
     * y niñas en una fiesta.Con ello sacar el porcentaje de cuantos fueron
     * niños y niñas.
     */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.printf("Valor: %d\n", i);

        }

        System.out.println("");

        for (int i = 2; i < 10; i += 2) {

            System.out.printf("Valor: %d\n", i);

        }

        Scanner entrada = new Scanner(System.in);

        final int TOTAL = 10;
        int numVarones = 0;
        int numMujeres = 0;
        char seleccion = 'a';
        double porcentaje = 0.0;

        for (int i = 0; i < TOTAL; i++) {

            System.out.printf("%d)Quien viene x minuta",i+1);
            System.out.println("V: Varon / M: Mujer");
            System.out.println("Respuesta: ");
            seleccion = entrada.next().toUpperCase().charAt(0);

            switch (seleccion) {
                case 'V':
                    System.out.println("Varon comiendo minuta");
                    numVarones++;
                    break;
                case 'M':
                    System.out.println("Mujer comiendo minuta");
                    numMujeres++;
                    break;
                default:
                    System.out.println("Seleccion no valida");
            }

        }// Fin de For
        
        System.out.println("Porcentaje de Varones");
        porcentaje = (double)numVarones / TOTAL;
        System.out.printf("Porcentaje: %.2f\n",porcentaje);
        
        System.out.println("Porcentaje de Mujeres");
        porcentaje = (double)numMujeres / TOTAL;
        System.out.printf("Porcentaje: %.2f\n",porcentaje);

    } //Fin de Main
    
} //Fin de Class
