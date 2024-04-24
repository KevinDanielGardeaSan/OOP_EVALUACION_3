/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_unchecked_exceptions;

/**
 *
 * @author nacho
 */
public class EVA3_2_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
       
        //NULPOINTEREXCEPTION
        //CUANDO QUEREMOS USAR UN OBJETO QUE NO EXISTE 
        Persona persona = null ;
        System.out.println(persona.toString());
       
       //INDEXOUTOFBOUNDSEXCEPTION: Error de arreglos
       //leer una posicion que no existe
       int arreglo[]= new int [10]; //N =10
       //0 es la primera posicion, N - 1 es la ultima (9)
       arreglo[15] = 100;
       
       //ARITHMETICEXCEPTION: Division entre 0
       int x= 10, y = 0;
       int resu = x / y ;
       System.out.println(resu);
       
    }
    
}

class Persona {

}