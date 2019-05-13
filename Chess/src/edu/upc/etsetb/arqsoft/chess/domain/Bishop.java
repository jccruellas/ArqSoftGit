/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

/**
 *
 * @author JuanCarlos
 */
public class Bishop extends Piece{

    public Bishop(PieceColor color) {
        super(color);
    }    
    
    public void isPieceMovement(int f1, int c1, int f2, int c2) throws NoPieceMoveException{
        
        if (f2-f1 != c2-c1){
            throw new NoPieceMoveException();
        }
        
    }

    @Override
    public void isPathFree(int f1, int c1, int f2, int c2, Board b) throws NoPathFreeException {
        boolean pathFree = true;
        for (int i  = 0; i <= f2 ; i++ ){
            if (b.getPiece(f1+i, c1+i) != null) {
                pathFree = false;
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
