/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_try_catch;

import com.sun.source.tree.CatchTree;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EVA3_5_TRY_CATCH {

    public static void main(String[] args) {
        
    try{
        Scanner captu = new Scanner(System.in);
        System.out.println("Introducir el numerador; ");
        int nume = captu.nextInt();
        System.out.println("Introducir el divisor; ");
        int divi = captu.nextInt();
        int resu=0;
        resu = nume / divi;
        System.out.println("Resultado; " + resu);
    }catch(InputMismatchException e){
      e.printStackTrace();
    }catch(ArithmeticException e)     {
      e.printStackTrace();
    }
    System.out.println("FIN DEL PROGRAMA");
 }
}


    

    

