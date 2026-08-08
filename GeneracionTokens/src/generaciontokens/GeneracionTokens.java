/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciontokens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 */
public class GeneracionTokens {

    /**
     * @param args the command line arguments
     * Objetivos 
        * 1. Utilizar el ciclo de repeticion DO - WHILE
        * 2. Uso de Nuevas Librerias
        *      a. Random
        * 3. Uso de Otras Funciones de String
     */
    public static void main(String[] args) {

        /**
         * Desarrollar un algoritmo que me permita registrar un dispositivo y
         * generar un token para su sesion de validacion mientras se esta
         * navegando con dicho dispositivo.
         *
         * Contexto del problema: Un sistema de gestión de red necesita
         * registrar nuevos enrutadores (routers) y asignarles una clave de
         * sesión única generada aleatoriamente. * Sin embargo, el canal de
         * comunicación tiene "ruido", por lo que la generación de la clave no
         * siempre es constante.
         */
        Scanner entrada = new Scanner(System.in);
        Random RD = new Random();

        String nomequipo = "n";
        boolean longitudcorrecta = true;
        boolean prefijocorrecto = true;
        boolean validacioncorrecta = true;
        int tipocaracter =0;
        int numerotoken =0;
        char letratoken ='a';
        String token = "";

        do {

            System.out.println("Bienvenido, ingrese el nombre de su equipo");
            nomequipo = entrada.nextLine().toUpperCase();

            System.out.printf("El nombre del equipo es %s\n", nomequipo);

            longitudcorrecta = nomequipo.length() == 8;
            prefijocorrecto = nomequipo.startsWith("RT") || nomequipo.startsWith("SW");

            /*System.out.println(longitudcorrecta);
            System.out.println(prefijocorrecto);*/
            validacioncorrecta = longitudcorrecta && prefijocorrecto;

        } while (!validacioncorrecta);
        
        System.out.println("Registro Correcto");
        
        while (token.length()<12){
        
            tipocaracter = RD.nextInt(2);
            
            if (tipocaracter == 0){
                numerotoken = RD.nextInt(10);
                token = token + numerotoken;
            }else{
                letratoken = (char) (RD.nextInt(26)+65);
                token = token + letratoken;
            }
            
        }
        System.out.printf("Token es: %s",token);

    } //Fin de Main
    
} //Fin de Class
