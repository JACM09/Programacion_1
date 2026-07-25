/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

import java.util.Locale;

/**
 *
 * @author Joseph Castro
 */
public class Hola_mundo {

    /**
     * @param args the command line arguments
     */
    
    //Sirve para comentar una sola linea 
    /*
    Abrir el bloque de comentario y cerrar eñ bloque de comentario 
    Todo lo de en medio es un comentario 
    */
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        /*
        1.Imprimir en pantalla
        a.Salida formateadas
        b.caracteres de Escape 
        2.Captura de Datos   
        */
        
        System.out.println("Hola.. me llamo Joseph");
        System.out.println("Este sera mi 1er");
        System.out.println("PROGRAMAAAA!!!!!");
        
        //sout + tab
        System.out.print("vamos camino a ");
        System.out.print("la clase de ");
        System.out.print("Progra!!");
        System.out.println("");
        
        System.out.printf("Tu apellido es %S \n","Castro");
        //System.out.println(""); 
        //\n = alt + 92
        
        System.out.printf("%S Tu apellido es \n","Castro");
        //System.out.println("");
        
        System.out.printf("Tu apellido %S es \n","Castro");
        
        System.out.println("Hola \neste es \nun nuevo \namanecer");
        System.out.println("Hola \teste es \tun nuevo \tamanecer");
        
        //Variables
        int edad;       //Tipo Entero
        double peso;    //Tipo Decimal 
        char inicial;   //Tipo Caracter 
        String nombre;  //Tipo Cadena
        boolean estado; //Tipo Estado -true(verdadero) / false(falso)
        
        edad = 21;
        peso = 60.5;
        inicial = 'D'; // alt + 39 ''
        nombre = "Joseph";
        
        System.out.printf("Tengo %d anios \n",edad);
        System.out.printf("Mi peso ideal es %.2f \n",peso);
        System.out.printf("Dime %c por mi inicial \n",inicial);
        System.out.printf("%s es mi nombre",nombre);
        
    }//Fin de Main 
    
} //Fin de Class
