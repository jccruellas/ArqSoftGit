/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

/**
 * @author JuanCarlos
 */

public class Rook extends Piece{

    public Rook(PieceColor color) {
        super(color);
    }
    
    public void isPieceMovement(int f1, int c1, int f2, int c2) throws NoPieceMoveException {
        if(!(f1 == f2 || c1==c2)){
            String msg = String.format("The movement of the rook from (%d,%d) to (%d,%d) is not legal", f1, c1, f2, c2);
            throw new NoPieceMoveException(msg);
        }
    }

    @Override
    public void isPathFree(int f1, int c1, int f2, int c2, Board b) throws NoPathFreeException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

