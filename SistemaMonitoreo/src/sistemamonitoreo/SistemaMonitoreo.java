/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Joseph Castro Desarrolla un programa en Java que simule la lectura de
 * sensores de temperatura en un cuarto de servidores. El programa debe
 * solicitar el nombre del operador encargado y cuántas lecturas de sensores se
 * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 y menor
 * o igual a 50. Por cada lectura, el sistema generará una temperatura aleatoria
 * en grados Celsius. El programa debe convertir cada lectura a Fahrenheit,
 * determinar si hay una alerta de sobrecalentamiento y, al final, mostrar un
 * resumen estadístico.
 */

/*
    1. Comprender el problema que se esta abordando.
        a. Que datos de Entrada necesito?
        b. Transformacion / Calculos Necesarios.
        c. Que resultados se presentan?
        
    2. Visualizacion / Diseño de la solucion.
        a. Diagrama de Flujo
        b. Pseudocodigo.

    3. Programacion Incremental.
        a. Listando las Tareas a Cumplir
            i. Declaracion de Variables
            ii. Estructuras de Seleccion
            iii. ciclos de Repeticion
            iiii. Validacion de Datos
        b. Validacion

    4. Prueba de Escritorio
        a. Casos
        b. Escenarios
        c. Resultados / Patrones Definidos
*/
public class SistemaMonitoreo {

    /**
     * @param args the command line arguments
     * Lista de Tareas
     * Comprension Problema
     * 1. Entradas:
     *      Nombre de Usario
     *      Numero de Lecturas
     *      Ingreso de Temperatura (RANDOM)
     * 2. Calculos / Transformacion:
     *      Definicion de Sobrecalentamiento
     *      Validacion Lcturas ( 0 > lectura menor 50)
     *      Contabilizar el numero calentamiento
     *      Promediar el monitoreo
     *      Validacion Temperatura
     * 3. Salida:
     *      Resumen Estadistico
     *      Alerta de Sobrecalentamiento
     * Lista de Tareas
     *      1. Capturar el nombre del Usuario
     *          a. Definicion de Libreria / Instancia SCANNER
     *          b. Declaracion de Variable para el usuario
     *      2. Captura de Numero de Lecturas
     *          a. Declaracion de Variables para numero de lectura
     *      3. Generacion de Temperatura
     *          a. Definicion de Libreria RANDOM
     *          b. Declaracion de Varible
     *          c. Mostrar el numero Random Generado Temporalmente 
     *          d. Rango de Temp 200 - 400
     *          e. Ciclo de Repeticion, WHILE
     *      4. Formula F = (C *9/5) + 32
     *      5. Limite de Sobrecalentamiento 350 C (602 F)
     *      6. Validacion de Lecturas (DO WHILE)
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String nombreUsuario = "John Doe";
        int numLectura = 0;
        int ciclo = 0;
        double tempC = 0;
        double tempF = 0;
        int numSobreCal = 0;
        double promedio = 0;
        double acumTEMP = 0;

        System.out.println("Nombre de Operacion");
        nombreUsuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar Captura: %s\n", nombreUsuario);
        
        do{
        System.out.println("Numero de Lecturas: ");
        numLectura = sc.nextInt();
        //System.out.printf("Validacion Captura :%d\n", numLectura);
        if(!(numLectura>0 && numLectura<50)){
            System.out.println("Valor no valido\nTiene que ser entre 0 y 50");}
        }while(!(numLectura>0 && numLectura<50));
        
        while (ciclo < numLectura) {

            tempC = rd.nextDouble(200, 400);
            tempF = (tempC * 9 / 5) + 32;

            System.out.printf("Num Lec: %d\tTemp C: %.2f\n", ciclo + 1, tempC);
            System.out.printf("Temp en Faren: %.2f\n", tempF);

            if (tempF > 662) {
                System.out.println("Alerta!!...SobreCalentamiento");
                numSobreCal++;
            } else {
            
                    acumTEMP += tempF;
                    
            }
            ciclo++;

        }
        
        promedio = acumTEMP / numLectura;
        
        System.out.println("---------------------------------------");
        System.out.println("                RESUMEN                ");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.printf("Promedio de TEMP: %.2f\n",promedio);
        System.out.printf("# SobreCalentamiento: %d",numSobreCal);

    }
    
}
