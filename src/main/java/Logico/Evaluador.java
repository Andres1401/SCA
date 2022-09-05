/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logico;

import java.io.*;
import static java.util.Arrays.copyOf;

/**
 *
 * @author Andres Rodriguez
 */
public class Evaluador {
    
    int Calificado;
    int Pendiente;
    float promedio;
    float [] calificacion=new float[50];
    String [] motivo=new String[50];
    Capturador capturado=new Capturador();

    public Evaluador() {
        Calificado=0;
        Pendiente=capturado.getNumeroEntregas();
        promedio=0;
    }
    
        
        public void Calificar(String Datos){
            String [] temas=Datos.split(","); 
            int ContadorDeIncidencias=0;
            int pal=0;
            for(int j=0;j<capturado.getNumeroEntregas();j++){
            String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(capturado.Enlace[j]));
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
        String [] Palabras;
        String Entregado [];
        Palabras=texto.split(" ");
        Entregado=copyOf(Palabras,Palabras.length);
            pal+=Palabras.length;
        for(int a=0;a<Entregado.length;a++){
            for(int b=0;b<temas.length;b++){
                if(Entregado[a].equals(temas[b])){
                    ContadorDeIncidencias++;
                }
            }
        }
        float cal=(float)ContadorDeIncidencias/temas.length*100;
        calificacion[j]=cal;
        motivo[j]="Se tuvieron "+ContadorDeIncidencias+" incidencias con los temas solicitados";
            } 
        }
        public void Resultados(){
            int total=0;

           
           File f;
           FileWriter w;
           BufferedWriter bw;
           PrintWriter wr;
            try {
                f=new File("Resultados.txt");
                w=new FileWriter(f);
                bw=new BufferedWriter(w);
                wr=new PrintWriter(bw);
 for (int i=0;i<calificacion.length;i++){
               if(calificacion[i]!=0){
                   int v=i+1;
               wr.println(v+". "+calificacion[i]+", "+motivo[i]);
               promedio+=calificacion[i];
               total++;
               }
           }
 wr.println("El promedio general de grupo fue de: "+promedio/total);
                wr.close();
                bw.close();
            } catch (Exception e) {
            }
        }
}
