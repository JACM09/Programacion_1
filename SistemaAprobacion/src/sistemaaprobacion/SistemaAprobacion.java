/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaaprobacion;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class SistemaAprobacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * 1. Sistema de Aprobación de Materia
           Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
           calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
           promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
           estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".
           Requisito estricto: Solo puedes usar una estructura if/else simple.
         */
        
        Scanner entrada = new Scanner(System.in);
        
        String estudiante = "a";
        double parcial1 = 0;
        double parcial2 = 0;
        double prom = 0;
        
        System.out.println("Bienvenido al sistema de aprobacion");
        System.out.println("Ingrese el nombre del estudiante a evaluar");
        
        estudiante = entrada.nextLine();
        
        System.out.println("Ahora ingrese la nota del primer examen parcial");
        parcial1 = entrada.nextInt();
        
        System.out.println("Ahora ingrese la nota del segundo examen parcial");
        parcial2 = entrada.nextInt();
        
        prom = (parcial1 + parcial2)/2;
        
        if (prom >= 65) {
            
            System.out.printf("El nombre del estudiante es %s su promedio es de %.2f y su estado es APROBADO", estudiante, prom);
            
        } else {
            
            System.out.printf("El nombre del estudiante es %s su promedio es de %.2f y su estado es REPROBADO", estudiante, prom);
            
        }
        
    }
    
}
