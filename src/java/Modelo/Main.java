/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Fuller 101
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        String humano = "x";
        //boolean jugando = true;
        
        while(Triqui.instance().hayGanador() == false){
            
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione posicion donde va a jugar"));
            Triqui.instance().asignarJugada(posicion, 1);
            
            Triqui.instance().verificarGanador(1);
            Triqui.instance().verificarEmpate();
            Triqui.instance().juegaMaquina();
            
            if(Triqui.instance().hayGanador() || Triqui.instance().hayEmpate()){
                //jugando = false;
                System.out.println("Juego terminado.");
                System.exit(0);
            }
            
        }
    }
    
}
