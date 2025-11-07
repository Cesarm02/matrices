package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Filetxt {

    private String fileName;
    private String filePath;

    public Filetxt(String fileName, String filePath){
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public void createRegistry(String text){
        File registry = new File(filePath + fileName);
        try{
            if(registry.createNewFile()){
                System.out.print(" Archivo creado exitosamente");
                FileWriter fw = new FileWriter(registry, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(text);
                bw.newLine();;
                bw.close();
            }else{
                System.out.println("Archivo ya existe");
            }
        }catch (IOException e ){
            System.out.println("Ocurrio un error en el archivo");
            e.printStackTrace();
        }
    }

    public void writeRegistry(String text){
        File registry = new File(filePath + fileName);
        try{
            FileWriter fw = new FileWriter(registry, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.newLine();
            bw.close();
            System.out.println("Se ha escrito correctamente");
        }catch (IOException e ){
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }
    }

    public void readAndShowRegistry(){
        File registry = new File(filePath + fileName);
        try{
            FileReader fr = new FileReader(registry);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("Contenido del archivo");
            while((line = br.readLine()) != null ){
                System.out.println(line);
            }
            br.close();
        }catch (IOException e ){
            System.out.println("Ocurrio un error al leer el archivo");
            e.printStackTrace();
        }
    }


}
