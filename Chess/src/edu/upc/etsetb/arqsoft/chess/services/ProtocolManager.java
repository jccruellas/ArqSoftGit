/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.services;

import edu.upc.etsetb.arqsoft.chess.domain.ChessGame;
import edu.upc.etsetb.arqsoft.chess.domain.Piece;
import edu.upc.etsetb.arqsoft.chess.ui.UserInterface;

/**
 *
 * @author JuanCarlos
 */
public class ProtocolManager {
    
    ChessGame game;
    UserInterface userInterface;
    
    public ProtocolManager(UserInterface userInterface){
        this.game = new ChessGame(this);
        this.userInterface = userInterface;
    }
    
    public void move(int f1, int c1, int f2, int c2){
        game.move(f1, c1, f2, c2);
    }
    
    /*public static void main(String[] args){
        ProtocolManager p = new ProtocolManager(new UserInterface()) ;
    }*/

    public void badMoveOriginEmpty(int f1, int c1) {
        userInterface.printMessage("Bad movement: origin "+f1+", "+c1+" is empty.");
    }

    public void badMoveWrongColor(int f1, int c1, Piece piece) {
        userInterface.printMessage("Bad movement: piece in "+f1+", "+c1+" is "+piece.getColor().name()+", current user can't move that.");
    }
    
}
