/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logico;


/**
 *
 * @author Andres Rodriguez
 */
public class Capturador {

    int NumeroEntregas;
    String [] Enlace;
    public Capturador() {
    }
    
    public void AñadirEntrega(String enlace){
        Enlace[Enlace.length]=enlace;
        NumeroEntregas++;
    }

    public int getNumeroEntregas() {
        return NumeroEntregas;
    }

    public String[] getEnlace() {
        return Enlace;
    }

    
}
