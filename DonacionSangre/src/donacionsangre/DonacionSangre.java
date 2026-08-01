/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacionsangre;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class DonacionSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int edad=0;
        double peso=0;
        char res='a';
        char sexo='a';
        int hierro=0;
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese su peso en lbs.");
        peso = entrada.nextDouble();
        
        System.out.printf("Su edad es %d anios y su peso es de %.2flbs.\n",edad,peso);
        
        if (edad >= 18 && edad <= 65 && peso > 110) {
            System.out.println("Si se puede donar");
            entrada.nextLine();
            System.out.println("Ya comio x=si y=no");
            res = entrada.nextLine().charAt(0);

            if (res == 'x' || res == 'X') {
                System.out.println("Si se puede donar");
                entrada.nextLine();
                System.out.println("Ingrese su sexo F(Femenino) M(Masculino)");
                sexo = entrada.nextLine().charAt(0);
                System.out.println("Ingrese su nivel de hierro");
                entrada.nextInt();
                hierro = entrada.nextInt();
                System.out.printf("Su sexo es %s y su nivel de hierro es %d\n", sexo, hierro);

                if (sexo == 'm' || sexo == 'M' && hierro >= 14) {
                    System.out.println("Es apto para donar");
                } else if (sexo == 'f' || sexo == 'F' && hierro >= 12) {
                    System.out.println("Es apta para donar");
                } else {
                    System.out.println("No puede donar");
                }

            } else {
                System.out.println("Necesita comer");
            }
        } else {
            System.out.println("No se puede donar");
        }
    }
    
}
