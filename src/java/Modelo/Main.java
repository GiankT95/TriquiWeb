/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Fuller 101
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Triqui triki = new Triqui();
        
        triki.asignarJugada(9, "x");
        triki.asignarJugada(5, "o");
        triki.asignarJugada(4, "o");
        triki.asignarJugada(6, "o");
        
        triki.mostrarTablero();
        
    }
    
}
