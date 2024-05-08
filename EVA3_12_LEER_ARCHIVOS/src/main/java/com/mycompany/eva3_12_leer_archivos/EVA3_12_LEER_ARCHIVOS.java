/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_12_leer_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EVA3_12_LEER_ARCHIVOS {
    final static String miRuta = "C:\\Archivos\\Archivo_de_Texto.txt";

    public static void main(String[] args) {
      try{
        leerArchivosFiles(miRuta);
        leerArchivoBuffer(miRuta);
        leerArchivosFileReder(miRuta);
        leerArchivoScanner(miRuta);
      }catch (IOException ex ){
          ex.printStackTrace();
      }
    }
    /*
    Lectura de archivos usando la clase Files
    Se lee todo el archivo y se carga en memoria 
    Por lo tanto es util paara archivos pequeños.
    */
 public static void  leerArchivosFiles(String ruta) throws IOException{
 System.out.println("Lectura de archivos de texto con clase Files: ");
 Path path = Paths.get(ruta);// crea la ruta de tipo path
 byte[] datos = Files.readAllBytes(path);// Genera una IOException
                 //new String = convierte el arreglo 
                 //cadena de texto \n
 System.out.println(new String(datos));
 }  
 /*
 esw adecuado para leer archivos grandes
 nos permite procesar archivos de texto linea por linea
 es adecuado para multitarea
 es adecuado usar bufferedread
 */
 public static void leerArchivoBuffer(String ruta)throws FileNotFoundException, IOException{
 System.out.println("Lectura de archivos de texto con clase Bufered: ");
 //abrir el archivo
 //leer el archivo con informacion
 //convertir la informacion binaria a texto
  File file = new File(ruta);
  FileInputStream in = new FileInputStream(file); 
  InputStreamReader reader = new InputStreamReader(in);
  BufferedReader br = new BufferedReader(reader);
  String cade;
         //asignamos la linea  ala variable cade
         //si cade es diferencte de null estamos
         // leyendo texto, si leemos null 
         //llegamos al final del archivo
  while((cade = br.readLine())!= null){
  System.out.println(new String(cade ));
  } 
br.close();
 }
 
 public static void leerArchivosFileReder(String ruta) throws FileNotFoundException, IOException{
 System.out.println("Lectura de archivos de texto con clase File reader: ");
 File file = new File(ruta);    
 FileReader reader = new FileReader(file);    
 BufferedReader br = new BufferedReader(reader);
  String cade;
         //asignamos la linea  ala variable cade
         //si cade es diferencte de null estamos
         // leyendo texto, si leemos null 
         //llegamos al final del archivo
  while((cade = br.readLine())!= null){
  System.out.println(new String(cade ));
  } 
 }
 public static void leerArchivoScanner(String ruta) throws IOException{
 System.out.println("Lectura de archivos de texto con clase scanner: ");
 Path path = Paths.get(ruta);
 Scanner leer = new Scanner(path);
 while(leer.hasNextLine()){
  String cade =  leer.nextLine();
  System.out.println(cade);
  
 
 }
  leer.close();
 }
 
}

