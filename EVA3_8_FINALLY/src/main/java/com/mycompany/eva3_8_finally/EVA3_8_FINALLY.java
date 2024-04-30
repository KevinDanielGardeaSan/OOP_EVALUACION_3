/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EVA3_8_FINALLY {

    public static void main(String[] args) {
        try{
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un numero entero: ");
        int nume = captu.nextInt();
        System.out.println("El volor capturado fue "+ nume);
        }catch(InputMismatchException e){
        //lo que queremmos hacer con la exception
        System.out.println("El valor introducido no es un numero entero");
        }finally{
        //usar para ejecutar codigo critico par el programa
        //terminar procesos cerrar archivos o conexiones 
        //nada evita que se pueda prodicir una exception en este bloque de codigo
        

        System.out.println("ESTA INSTRUCCION SIMPRE SE VA A EJECUTAR");
    
        }
}
}

