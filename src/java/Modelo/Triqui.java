/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sala_04
 */
public class Triqui {

    private int[][] tablero = new int[3][3];
    public static Triqui instance = null;
    private int movs = 0;
    private boolean jugadaPC = false;
    private boolean ganador = false;
    private boolean empate = false;
    private int ganadosMaquina = 0;
    private int ganadosHumano = 0;

    public static Triqui instance() {

        if (instance == null) {
            instance = new Triqui();
        }

        return instance;
    }

    public void asignarJugada(int posicion, int jugador) throws Exception {

        switch (jugador) {
            case 1:
                switch (posicion) {
                    case 1:
                        if (tablero[0][0] == 0) {
                            tablero[0][0] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;

                    case 2:
                        if (tablero[0][1] == 0) {
                            tablero[0][1] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;
                    case 3:
                        if (tablero[0][2] == 0) {
                            tablero[0][2] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;
                    case 4:
                        if (tablero[1][0] == 0) {
                            tablero[1][0] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;
                    case 5:
                        if (tablero[1][1] == 0) {
                            tablero[1][1] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;
                    case 6:
                        if (tablero[1][2] == 0) {
                            tablero[1][2] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;
                    case 7:
                        if (tablero[2][0] == 0) {
                            tablero[2][0] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;
                    case 8:
                        if (tablero[2][1] == 0) {
                            tablero[2][1] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;
                    case 9:
                        if (tablero[2][2] == 0) {
                            tablero[2][2] = 1;
                            movs++;
                        } else {
                            System.out.println("Posicion ocupada");
                        }
                        //mostrarTablero();
                        break;
                    default:
                        throw new Exception("Jugada invalida");
                }

            case 2:
                switch (posicion) {
                    case 1:
                        if (tablero[0][0] == 0) {
                            tablero[0][0] = 2;
                            jugadaPC = true;
                            movs++;
                        }
                        mostrarTablero();
                        break;

                    case 2:
                        if (tablero[0][1] == 0) {
                            tablero[0][1] = 2;
                            jugadaPC = true;
                            movs++;
                        }
                        mostrarTablero();
                        break;
                    case 3:
                        if (tablero[0][2] == 0) {
                            tablero[0][2] = 2;
                            jugadaPC = true;
                            movs++;
                        }
                        mostrarTablero();
                        break;
                    case 4:
                        if (tablero[1][0] == 0) {
                            tablero[1][0] = 2;
                            jugadaPC = true;
                            movs++;
                        }
                        mostrarTablero();
                        break;
                    case 5:
                        if (tablero[1][1] == 0) {
                            tablero[1][1] = 2;
                            jugadaPC = true;
                            movs++;
                        }
                        mostrarTablero();
                        break;
                    case 6:
                        if (tablero[1][2] == 0) {
                            tablero[1][2] = 2;
                            jugadaPC = true;
                            movs++;
                        } 
                        mostrarTablero();
                        break;
                    case 7:
                        if (tablero[2][0] == 0) {
                            tablero[2][0] = 2;
                            jugadaPC = true;
                            movs++;
                        }
                        mostrarTablero();
                        break;
                    case 8:
                        if (tablero[2][1] == 0) {
                            tablero[2][1] = 2;
                            jugadaPC = true;
                            movs++;
                        }
                        mostrarTablero();
                        break;
                    case 9:
                        if (tablero[2][2] == 0) {
                            tablero[2][2] = 2;
                            jugadaPC = true;
                            movs++;
                        }
                        mostrarTablero();
                        break;
                    default:
                        throw new Exception("Jugada invalida");
                }
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

        System.out.println();

    }

    public boolean matrizVacia() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public void victoriaFilas(int jugador) {

        switch (jugador) {
            case 1:
                if (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1) {
                    ganador = true;
                }

                if (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1) {
                    ganador = true;
                }

                if (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1) {
                    ganador = true;
                }
                break;

            case 2:
                if (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2) {
                    ganador = true;
                }

                if (tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2) {
                    ganador = true;
                }

                if (tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2) {
                    ganador = true;
                }
                break;
        }
    }

    public void victoriaColumnas(int jugador) {
        
        switch (jugador) {
            case 1:
                if (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1) {
                    ganador = true;
                }

                if (tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1) {
                    ganador = true;
                }

                if (tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1) {
                    ganador = true;
                }
                break;
            case 2:
                if (tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2) {
                    ganador = true;
                }

                if (tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2) {
                    ganador = true;
                }

                if (tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2) {
                    ganador = true;
                }
                break;
        }
    }

    public void victoriaDiagonales(int jugador) {

        switch (jugador) {

            case 1:
                if (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1) {
                    ganador = true;
                }

                if (tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1) {
                    ganador = true;
                }
                break;
                
            case 2:
                if (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2) {
                    ganador = true;
                }

                if (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2) {
                    ganador = true;
                }
                break;
        }
    }

    public void verificarGanador(int jugador) {

        victoriaFilas(jugador);
        victoriaColumnas(jugador);
        victoriaDiagonales(jugador);

    }

    public void verificarEmpate() {
        
        if (movs == 9) {
            empate = true;
            reiniciarTablero();
            System.out.println("Juego empatado.");
        }
    }

    public void jugarCentroPC() throws Exception {
        if (tablero[1][1] == 0) {
            asignarJugada(5, 2);
        }
    }

    public void prevenirJugadaHumano() throws Exception {

        if (((tablero[0][0] == 1) && (tablero[1][1] == 2) && (tablero[2][2] == 1) && (tablero[2][1] == 0) && (jugadaPC = false))
                || ((tablero[0][2] == 1) && (tablero[1][1] == 2) && (tablero[2][0] == 1) && (jugadaPC = false))) {

            asignarJugada(8, 2);
        }

        if (((tablero[0][0] == 1) && (tablero[1][1] == 2) && (tablero[1][2] == 1) && (tablero[2][1] == 0) && (jugadaPC = false))
                || ((tablero[1][2] == 1) && (tablero[1][1] == 2) && (tablero[2][0] == 1) && (tablero[2][1] == 0) && (jugadaPC = false))) {

            asignarJugada(8, 2);
        }

        if ((tablero[2][1] == 1) && (tablero[1][1] == 2) && (tablero[1][2] == 1) && (jugadaPC = false) && (tablero[0][2] == 0)) {

            asignarJugada(3, 2);
        }
        
        if ((tablero[2][2] == 1) && (tablero[1][1] == 1) && (tablero[0][0] == 2) && (jugadaPC = false) && (tablero[0][2] == 0)) {

            asignarJugada(3, 2);
        }

        if ((tablero[2][1] == 1) && (tablero[1][1] == 2) && (tablero[0][0] == 1) && (jugadaPC = false) && (tablero[2][0] == 0)) {

            asignarJugada(7, 2);
        }

        if (((tablero[0][1] == 1) && (tablero[1][1] == 2) && (tablero[2][2] == 1) && (jugadaPC = false) && (tablero[1][0] == 0))
                || ((tablero[2][1] == 1) && (tablero[1][1] == 2) && (tablero[0][2] == 1) && (jugadaPC = false) && (tablero[1][0] == 0))) {

            asignarJugada(4, 2);
        }

        if ((tablero[1][0] == 1) && (tablero[1][1] == 2) && (tablero[2][2] == 1) && (jugadaPC = false) && (tablero[0][1] == 0)) {

            asignarJugada(2, 2);
        }

        if ((tablero[0][0] == 2) && (tablero[1][1] == 1) && (tablero[2][2] == 1) && (jugadaPC = false) && (tablero[2][0] == 0)) {

            asignarJugada(7, 2);
        }

    }

    public void buscarPeligroFilas() throws Exception {

        if (tablero[0][0] == 1 && tablero[0][1] == 1 && jugadaPC == false && tablero[0][2] == 0) {
            asignarJugada(3, 2);
        }

        if (tablero[0][0] == 1 && tablero[0][2] == 1 && jugadaPC == false && tablero[0][1] == 0) {
            asignarJugada(2, 2);
        }

        if (tablero[0][1] == 1 && tablero[0][2] == 1 && jugadaPC == false && tablero[0][0] == 0) {
            asignarJugada(1, 2);
        }

        if (tablero[1][0] == 1 && tablero[1][1] == 1 && jugadaPC == false && tablero[1][2] == 0) {
            asignarJugada(6, 2);
        }

        if (tablero[1][0] == 1 && tablero[1][2] == 1 && jugadaPC == false && tablero[1][1] == 0) {
            asignarJugada(5, 2);
        }

        if (tablero[1][1] == 1 && tablero[1][2] == 1 && jugadaPC == false && tablero[1][0] == 0) {
            asignarJugada(4, 2);
        }

        if (tablero[2][0] == 1 && tablero[2][1] == 1 && jugadaPC == false && tablero[2][2] == 0) {
            asignarJugada(9, 2);
        }

        if (tablero[2][0] == 1 && tablero[2][2] == 1 && jugadaPC == false && tablero[2][1] == 0) {
            asignarJugada(8, 2);
        }

        if (tablero[2][1] == 1 && tablero[2][2] == 1 && jugadaPC == false && tablero[2][0] == 0) {
            asignarJugada(7, 2);
        }

    }

    public void buscarPeligroColumnas() throws Exception {
        if (tablero[0][0] == 1 && tablero[1][0] == 1 && jugadaPC == false && tablero[2][0] == 0) {
            asignarJugada(7, 2);
        }

        if (tablero[0][0] == 1 && tablero[2][0] == 1 && jugadaPC == false && tablero[1][0] == 0) {
            asignarJugada(4, 2);
        }

        if (tablero[1][0] == 1 && tablero[2][0] == 1 && jugadaPC == false && tablero[0][0] == 0) {
            asignarJugada(1, 2);
        }
        
        if (tablero[0][1] == 1 && tablero[1][1] == 1 && jugadaPC == false && tablero[2][1] == 0) {
            asignarJugada(8, 2);
        }

        if (tablero[0][1] == 1 && tablero[2][1] == 1 && jugadaPC == false && tablero[1][1] == 0) {
            asignarJugada(5, 2);
        }

        if (tablero[1][1] == 1 && tablero[2][1] == 1 && jugadaPC == false && tablero[0][1] == 0) {
            asignarJugada(2, 2);
        }
        
        if (tablero[0][2] == 1 && tablero[1][2] == 1 && jugadaPC == false && tablero[2][2] == 0) {
            asignarJugada(9, 2);
        }

        if (tablero[0][2] == 1 && tablero[2][2] == 1 && jugadaPC == false && tablero[1][2] == 0) {
            asignarJugada(6, 2);
        }

        if (tablero[1][2] == 1 && tablero[2][2] == 1 && jugadaPC == false && tablero[0][2] == 0) {
            asignarJugada(3, 2);
        }
    }
    
    public void buscarPeligroDiagonales() throws Exception{
        if(tablero[0][0] == 1 && tablero[1][1] == 1 && jugadaPC == false && tablero[2][2] == 0){
            asignarJugada(9, 2);
        }
        
        if(tablero[0][0] == 1 && tablero[2][2] == 1 && jugadaPC == false && tablero[1][1] == 0){
            asignarJugada(5, 2);
        }
        
        if(tablero[1][1] == 1 && tablero[2][2] == 1 && jugadaPC == false && tablero[0][0] == 0){
            asignarJugada(1, 2);
        }
        
        if(tablero[0][2] == 1 && tablero[1][1] == 1 && jugadaPC == false && tablero[2][0] == 0){
            asignarJugada(7, 2);
        }
        
        if(tablero[0][2] == 1 && tablero[2][0] == 1 && jugadaPC == false && tablero[1][1] == 0){
            asignarJugada(5, 2);
        }
        
        if(tablero[1][1] == 1 && tablero[2][0] == 1 && jugadaPC == false && tablero[0][2] == 0){
            asignarJugada(3, 2);
        }
    }
    
    public void evitarVictoriaHumano() throws Exception{
        buscarPeligroFilas();
        buscarPeligroColumnas();
        buscarPeligroDiagonales();
    }

    public void derrotarHumanoFilas() throws Exception{
        
        if(tablero[0][0] == 2 && tablero[0][1] == 2 && jugadaPC == false){
            asignarJugada(3, 2);
        }
        if(tablero[0][0] == 2 && tablero[0][2] == 2 && jugadaPC == false){
            asignarJugada(2, 2);
        }
        if(tablero[0][1] == 2 && tablero[0][2] == 2 && jugadaPC == false){
            asignarJugada(1, 2);
        }
        
        if(tablero[1][0] == 2 && tablero[1][1] == 2 && jugadaPC == false){
            asignarJugada(6, 2);
        }
        if(tablero[1][0] == 2 && tablero[1][2] == 2 && jugadaPC == false){
            asignarJugada(5, 2);
        }
        if(tablero[1][1] == 2 && tablero[1][2] == 2 && jugadaPC == false){
            asignarJugada(4, 2);
        }
        
        if(tablero[2][0] == 2 && tablero[2][1] == 2 && jugadaPC == false){
            asignarJugada(9, 2);
        }
        if(tablero[2][0] == 2 && tablero[2][2] == 2 && jugadaPC == false){
            asignarJugada(8, 2);
        }
        if(tablero[2][1] == 2 && tablero[2][2] == 2 && jugadaPC == false){
            asignarJugada(7, 2);
        }
    }
    
    public void derrotarHumanoColumnas() throws Exception{
        
        if(tablero[0][0] == 2 && tablero[1][0] == 2 && jugadaPC == false){
            asignarJugada(7, 2);
        }
        if(tablero[0][0] == 2 && tablero[2][0] == 2 && jugadaPC == false){
            asignarJugada(4, 2);
        }
        if(tablero[1][0] == 2 && tablero[2][0] == 2 && jugadaPC == false){
            asignarJugada(1, 2);
        }
        
        if(tablero[0][1] == 2 && tablero[1][1] == 2 && jugadaPC == false){
            asignarJugada(8, 2);
        }
        if(tablero[0][1] == 2 && tablero[2][1] == 2 && jugadaPC == false){
            asignarJugada(5, 2);
        }
        if(tablero[1][1] == 2 && tablero[2][1] == 2 && jugadaPC == false){
            asignarJugada(2, 2);
        }
        
        if(tablero[0][2] == 2 && tablero[1][2] == 2 && jugadaPC == false){
            asignarJugada(9, 2);
        }
        if(tablero[0][2] == 2 && tablero[2][2] == 2 && jugadaPC == false){
            asignarJugada(6, 2);
        }
        if(tablero[1][2] == 2 && tablero[2][2] == 2 && jugadaPC == false){
            asignarJugada(3, 2);
        }
    }
    
    public void derrotarHumanoDiagonales() throws Exception{
        
        if(tablero[0][0] == 2 && tablero[1][1] == 2 && jugadaPC == false){
            asignarJugada(9, 2);
        }
        if(tablero[0][0] == 2 && tablero[2][2] == 2 && jugadaPC == false){
            asignarJugada(5, 2);
        }
        if(tablero[1][1] == 2 && tablero[2][2] == 2 && jugadaPC == false){
            asignarJugada(1, 2);
        }
        
        if(tablero[0][2] == 2 && tablero[1][1] == 2 && jugadaPC == false){
            asignarJugada(7, 2);
        }
        if(tablero[0][2] == 2 && tablero[2][0] == 2 && jugadaPC == false){
            asignarJugada(5, 2);
        }
        if(tablero[1][1] == 2 && tablero[2][0] == 2 && jugadaPC == false){
            asignarJugada(3, 2);
        }
    }
    
    public void derrotarHumano() throws Exception{
        derrotarHumanoFilas();
        derrotarHumanoColumnas();
        derrotarHumanoDiagonales();
    }
    
    public void forzarJugada() throws Exception {
            int tiro = 1;
            for (int fila = 0; fila < 3; fila++) {
                for (int col = 0; col < 3; col++) {
                    if (tablero[fila][col] == 0 && jugadaPC == false) {
                        asignarJugada(tiro, 2);
                        
                        fila = 4;
                        col = 4;
                    }
                    tiro++;
                }
            }
        }
    
    public void juegaMaquina() throws Exception{
        
        derrotarHumano();
        evitarVictoriaHumano();
        prevenirJugadaHumano();
        jugarCentroPC();
        forzarJugada();
            
        if(jugadaPC == true){
            verificarGanador(2);
            jugadaPC = false;
        }
        
    }
    
    public void reiniciarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    public int[][] getTablero() {
        return tablero;
    }

    public int getMovs() {
        return movs;
    }

    public int getGanadosMaquina() {
        return ganadosMaquina;
    }

    public int getGanadosHumano() {
        return ganadosHumano;
    }

    public boolean hayGanador() {
        return ganador;
    }

    public boolean hayEmpate(){
        return empate;
    }
    
}