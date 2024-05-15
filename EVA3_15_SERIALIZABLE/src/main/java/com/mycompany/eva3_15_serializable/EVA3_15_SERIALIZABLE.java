/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_15_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author nacho
 */
public class EVA3_15_SERIALIZABLE {

    public static void main(String[] args) throws IOException {
        try{
        
        Persona perso = new Persona ("Kevin", "Gardea", 18);
        guardarObjeto(perso);
        Persona perso2 = LeerObjeto();
        System.out.println(perso2);
    }catch (IOException ex){
     ex.printStackTrace();
    }catch (ClassNotFoundException ex ){
      ex.printStackTrace();  
    }
    }
    public static Persona LeerObjeto(Persona obj) throws FileNotFoundException, IOException, ClassNotFoundException{
        
    Persona perso = null;
        
        String ruta = "C:\\Archivos\\Archivo_de_Texto.txt";
        FileInputStream abrir = new FileInputStream(ruta);
        ObjectInputStream leerArchivo= new ObjectInputStream(abrir);
        perso = (Persona)leerArchivo.readObject();
   
     return perso;
    
}
     
     
    public static void guardarObjeto(Persona obj) throws FileNotFoundException, IOException{
    String ruta = "C:\\Archivos\\Archivo_de_Texto.txt";
    FileOutputStream abrirArch = new FileOutputStream(ruta);
    ObjectOutputStream GuardarDatos = new ObjectOutputStream(abrirArch);
    GuardarDatos.writeObject(obj);
    }
    
}

class Persona implements Serializable{
public String nombre;
public String apellido;
public int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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
        this.edad = edad;
    }
    

}