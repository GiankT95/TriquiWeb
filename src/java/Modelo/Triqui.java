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

    private final String[][] tablero;

    public Triqui() {

        this.tablero = new String[3][3];
        
    }

    public void asignarJugada(int pPosicion, String pJugada) throws Exception {

        switch (pPosicion){
            case 1:
               tablero[0][0] = pJugada;
               break;
            case 2:
               tablero[0][1] = pJugada;
               break;
            case 3:
               tablero[0][2] = pJugada;
               break;
            case 4:
               tablero[1][0] = pJugada;
               break;
            case 5:
               tablero[1][1] = pJugada;
               break;
            case 6:
               tablero[1][2] = pJugada;
               break;
            case 7:
               tablero[2][0] = pJugada;
               break;
            case 8:
               tablero[2][1] = pJugada;
               break;
            case 9:
               tablero[2][2] = pJugada;
               break;
            default:
                throw new Exception("Jugada invalida");
                
        }
        
        
    }

    /*public void asignarJugada(int posicion) throws Exception {
        if ((tablero[Integer.valueOf(convertirPosicion(posicion, "").split(",")[0])][Integer.valueOf(convertirPosicion(posicion, "").split(",")[1])].isEmpty())) {
            throw new Exception("Esta casillas ya esta ocupada");
        } else {
            tablero[Integer.valueOf(convertirPosicion(posicion, "").split(",")[0])][Integer.valueOf(convertirPosicion(posicion, "").split(",")[1])] = "1";
        }
    }*/

    public void mostrarTablero() {
        
        for (int x = 0; x < tablero.length; x++) {
            System.out.print("|");
            for (int y = 0; y < tablero[x].length; y++) {
                System.out.print(tablero[x][y]);
                if (y != tablero[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        
    }

    public boolean matrizVacia() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; i++) {
                if (!tablero[i][j].isEmpty()) {
                    return false;
                }
            }
        }

        return true;
    }

    public String[][] getTablero() {
        return tablero;
    }
    
    

}
