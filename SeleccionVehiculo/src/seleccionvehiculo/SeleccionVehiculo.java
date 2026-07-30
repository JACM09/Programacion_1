/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccionvehiculo;

import java.util.Scanner;

/**
 *
 * @author Joseph Castro
 * Objetivo
 * Estructuras de Seleccion 
 * 1. Estructuras de Seleccion
 *      a.Palabras Claves
 *      b.Bloques
 *      c.Terminaciones 
 *      d.Condiciones
 * 2. Tipos de Seleccion
 *      a.Simple
 *      b.Doble
 * 3. Condiciones 
 *      a.Tipos de Condiciones
 *      b.Tipos de Comparacion
 */
public class SeleccionVehiculo {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita determinar los siguientes elementos
     * de un vehivulo:
     *      a.Si el tamaño del tanque de combustible agarra mas de 30 litros    (Dato Numerico)
     *      b.El tipo de combustible si es o no Diesel                          (Dato tipo Caracter)
     *      c.Si es energeticamente eficiente y ecologico                       (Dato Cadena )
     */ 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int cantidadLitros=0;
        char respuestaTipo = 'a';
        String respuestaCadena = "John Doe";
        
        System.out.println("Me dijieron que eres duenio de un vehiculo \"verde\"");
        System.out.println("Tienes que echarle biodiesel");
        System.out.print("Cuantos litros agarra ");
        cantidadLitros = entrada.nextInt();
        
        if(cantidadLitros>30){
            System.out.println("Es un vehiculo con");
            System.out.println("Grandes capacidades");
            System.out.println("Seguro la factura es alta!!!");
        }
        System.out.println("");
        
        entrada.nextLine();
        System.out.println("Tu vehiculo es Diesel Verde? (x = si, y = no)");
        respuestaTipo = entrada.nextLine().charAt(0);
        
        if (respuestaTipo == 'x'){
            System.out.println("Si es Diesel verde!!");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");
        }
        else
        {
            System.out.println("UUYYYYY....eres anticlimatico");
            System.out.println("Calentamiento Globlal!!!!!!!!");
        } 
        
        System.out.println("\nTu carro es energeticamente eficiente?");
        respuestaCadena = entrada.nextLine();
        
        /*
        System.out.printf("Respuests Ingresada: %s",respuestaCadena);
        
        System.out.println("\nSeguro que es asi?");
        respuestaCadena = entrada.nextLine().toUpperCase();
        System.out.printf("Respuests Ingresada: %s",respuestaCadena);
        
        System.out.println("\n1000% seguro que es asi?");
        respuestaCadena = entrada.nextLine().toLowerCase();
        System.out.printf("Respuests Ingresada: %s",respuestaCadena);
        */
        
        if(respuestaCadena.equals("si")){
            System.out.println("Excelente");
            System.out.println("Amigable con el ambiente");
        }
        else{
            System.out.println("UUYYYYYY..... busca que se puede hacer");
        }
        
    } //Fin de Main 
    
} //Fin de Class
