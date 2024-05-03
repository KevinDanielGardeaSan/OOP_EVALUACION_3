/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_11_custom_exception;

/**
 *
 * @author nacho
 */
public class EVA3_11_CUSTOM_EXCEPTION {
    
    public static void main(String[] args) {
   try{
   mensaje();
   }catch (MiException ex) {
   ex.printStackTrace();  
   }
  }
    
    public static void mensaje() throws MiException {
        System.out.println("mensaje");
        throw new MiException("Falla del sistema!!!");
    }
}

class MiException extends Exception{

    public MiException() {
    }

    public MiException(String message) {
        super(message);
    }
}