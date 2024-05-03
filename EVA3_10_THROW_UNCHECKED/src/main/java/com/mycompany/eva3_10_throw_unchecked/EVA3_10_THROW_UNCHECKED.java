/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_throw_unchecked;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EVA3_10_THROW_UNCHECKED {

  public static void main(String[] args) {
      try{
       String nombre = "Kevin";
       String apellido = "Garea";
        int edad = 10; // Cambia el valor de la edad aquí
        while (true) {
          try {
           if (edad < 0 || edad > 150) {
        throw new RuntimeException("El valor capturado en la edad no es válido");
        }
        break; // Rompe el bucle si la edad es válida
     } catch (RuntimeException ex) {
           System.out.println("Error: " + ex.getMessage());
          break; // Salir del bucle si hay un error
                }
            }
    Persona perso = new Persona("kevin","Gardea",-10);
    }catch(RuntimeException e){
        e.printStackTrace();
    }
      System.out.println("FIN DEL PROGRAMA: ");
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

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if (edad < 0 || edad > 150)
        throw new RuntimeException("El valor capturado en la edad no es válido");
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

    public void setEdad(int edad) {
        if (edad < 0 || edad > 150)
            throw new RuntimeException("El valor capturado en la edad no es válido");
        this.edad = edad;
        
    }
}