/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_13_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author nacho
 */
public class EVA3_13_ESCRIBIR_ARCHIVOS {
    final static String miRuta ="C:\\Archivos\\";
 public static void main(String[] args) {
        try {
            escribirFiles(miRuta + "files.txt", "Hola mundo!!\n" + "Prueba de la clase files");
            escribirFileWriter(miRuta + "FileWriter.txt", "Segundo método para escritura\n" + "Prueba con la clase writer y ya ");
            escribirBufferedWriter(miRuta + "BufferedWriter.txt", "Tercer método para escritura" + "Prueba con la clase BufferedWriter y ya");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Clase files
    public static void escribirFiles(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta);// Abrir el archivo
        Files.write(path, datos.getBytes());// Guardar los datos
    }

    public static void escribirFileWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }

    public static void escribirBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(datos);
        bw.close();
    }
}