/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_uso_exception;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author nacho
 */
public class EVA3_7_USO_EXCEPTION {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;
        
        while (!numeroValido) {
            try {
                System.out.print("Por favor ingresa un número entero: ");
                numero = scanner.nextInt();
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingresa un número entero válido.");
                scanner.nextLine(); // Limpia el buffer del scanner
            }
        }
        
        System.out.println("El número ingresado es: " + numero);
    }
    
}