/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.ui;

import edu.upc.etsetb.arqsoft.chess.ui.text.BoardTextUI;

/**
 *
 * @author JuanCarlos
 */
public class UserInterface {
    
    public static void main(String[] args){
        /*
        Este código debería ser sustituido por código que presente un menú 
        de opciones al usuario y gestione las interacciones con el mismo.
        Ahora se limita a generar un Tablero textual y presentarlo por consola.
        */
        
        BoardTextUI boardText = new BoardTextUI(true) ;
        boardText.redraw(); 
        boardText.move(1, 0, 2, 0);
        boardText.redraw();
        boardText.move(3, 0, 4, 0);
        boardText.redraw(); 
    }
}
