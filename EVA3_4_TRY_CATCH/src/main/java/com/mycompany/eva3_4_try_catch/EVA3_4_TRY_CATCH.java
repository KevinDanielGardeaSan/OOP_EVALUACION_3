/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_try_catch;

/**
 *
 * @author nacho
 */
public class EVA3_4_TRY_CATCH {

    public static void main(String[] args) {
        
        //arithmeticexception
        int x=10 , y =0;
        int resu = 0;
        
        try{//aqui va el codigo que puede fallar
        resu = x/y;
        }catch(ArithmeticException xxx){//aqui va la solucion
           //que queremos hacer   
           xxx.printStackTrace();
        }
        System.out.println("Resultado: "+ resu);
        
    }
    
}
