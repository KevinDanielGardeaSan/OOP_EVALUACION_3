/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_throw;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EVA3_10_THROW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     /*   try{
    Persona perso = new Persona("kevin","Gardea",80);
    }catch (Exception ex) {
     ex.printStackTrace();
}*/
        try {
            Persona perso = new Persona();
            perso.setNombre("Kevin");
            perso.setApellido("Garea");
            while (true) {
                try {
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    perso.setEdad(edad);
                    break; // Rompe el bucle si la edad es válida
                } catch (Exception ex) {
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Fin del programa");
    }
}

class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "-------";
        this.apellido = "------";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if (edad < 0 || edad > 150)
        throw new Exception("El valor capturado en la edad no es válido");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0 || edad > 150)
        throw new Exception("El valor capturado en la edad no es válido");
        this.edad = edad;
        
    }
}