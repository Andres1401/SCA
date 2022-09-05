/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logico;

import java.io.*;

/**
 *
 * @author Andres Rodriguez
 */
public class Evaluador {
    
    int Calificado;
    int Pendiente;
    float promedio;

    public Evaluador() {
        Capturador capturado=new Capturador(); 
        Calificado=0;
        Pendiente=capturado.getNumeroEntregas();
        promedio=0;
    }
    
        public String Leer(String direccion){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            
            texto = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return texto;
        
    }
        
        public void Calificar(){
            
        }
        
}
