/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Sala_04
 */
public class Triqui {
    
    private String jugada;
    private int posicion;
    private String [][] tablero= new String[3][3];

    public Triqui() {
        
    }
    
    public String devolverJugada(String pJugada, int pPosicion) throws Exception{
        
        if((pPosicion>0 && pPosicion<9) && (pJugada.equalsIgnoreCase("o") || pJugada.equalsIgnoreCase("x"))){
              
            
            
        }
        else{
            throw new Exception("Jugada invalida");
        }
        
        return null;
    }
    
}
