/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_throw;

/**
 *
 * @author nacho
 */
public class EVA3_9_THROW {

    public static void main(String[] args) {
    try{
        metodoProblematico();
    }catch(Exception ex) {
        ex.printStackTrace();
  }
}


public static void metodoProblematico() throws Exception{
 System.out.println("Holi!");
    throw new Exception ("FALLA DEL SISTEMA!!!");
    //System.out.println("Hello kitty!"); nunca se va a ejecutar 
  }
}