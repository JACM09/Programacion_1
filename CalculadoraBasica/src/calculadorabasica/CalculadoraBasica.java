/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * 3. Calculadora Aritmética de Consola Crear un programa que actúe como
         * una calculadora básica. Debe solicitar al usuario dos números enteros
         * y un carácter (char) que represente la operación a realizar: • Suma •
         * Resta • División • Multiplicación • Módulo ‘%. Dependiendo del
         * carácter ingresado, el programa debe usar una estructura de selección
         * para realizar la operación aritmética correspondiente y mostrar el
         * resultado en formato decimal (cuidar las divisiones entre cero). Si
         * el usuario ingresa un carácter no válido, se debe mostrar "Operador
         * no reconocido".
         */
        
        Scanner entrada = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        char res = 'a';
        double total = 0;
        double porce = 0;
        
        System.out.println("Bienvenido a su Calculadora Basica");
        System.out.println("Por favor ingrese su primer numero");
        num1 = entrada.nextInt();
        
        System.out.println("Por favor ingrese su segundo numero");
        num2 = entrada.nextInt();
        
        System.out.println("Operaciones a realizar elija una");
        System.out.println("S = SUMA || R = RESTA || D = DIVISION || M = MULTIPLICACION || P = PORCENTAJE || % = MODULO ");
        entrada.nextLine();
        res = entrada.next().toUpperCase().charAt(0);
        
        switch (res){
            case 'S':
                total= num1 + num2;
                System.out.printf("La suma de %d + %d es: %.2f",num1,num2,total);
                break;
            case 'R':
                total= num1 - num2;
                System.out.printf("La resta de %d - %d es: %.2f",num1,num2,total);
                break; 
            case 'D':
                
                if(num2!=0){
                
                    total = num1 / (double)num2;
                    System.out.printf("La division de %d / %d es: %.2f",num1,num2,total);
                
                } else {
                
                    System.out.println("ERROOOR NO SE PUEDE DIVIDIR ENTRE CERO");
                
                }
                break;
            case 'M':
                total= num1 * num2;
                System.out.printf("La multiplicacion de %d * %d es: %.2f",num1,num2,total);
                break;
            case '%':
                if (num2 != 0) {
                    total = num1 % num2;
                    System.out.printf("El modulo (residuo) de %d %% %d es: %.2f",num1,num2,total);
                } else {
                    System.out.println("ERROOOR NO SE PUEDE SACAR MODULO ENTRE CERO");
                }
                break;    
            case 'P':
                porce = (double)num2 / 100;
                total = num1 * porce;
                System.out.printf("El primer numero que ingreso es %d el porcentaje que desea sacar es %d%% el total es %.2f%%",num1,num2,total);              
                break; 
            default:
                System.out.println("Opcion ingresada no valida");
        }
        
    } //Fin de Main
    
} //Fin de Class
