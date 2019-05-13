/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.services;

import edu.upc.etsetb.arqsoft.chess.domain.ChessGame;
import edu.upc.etsetb.arqsoft.chess.domain.Piece;

/**
 *
 * @author JuanCarlos
 */
public class ProtocolManager {
    
    ChessGame game;
    
    
    public ProtocolManager(){
        this.game = new ChessGame(this);
    }
    
    public void move(int f1, int c1, int f2, int c2){
        game.move(f1, c1, f2, c2);
    }
    
    public static void main(String[] args){
        ProtocolManager p = new ProtocolManager() ;
    }

    public void badMoveOriginEmpty(int f1, int c1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void badMoveWrongColor(int f1, int c1, Piece piece) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
