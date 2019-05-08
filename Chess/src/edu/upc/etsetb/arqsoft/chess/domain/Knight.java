/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

/**
 *
 * @author luisalberto
 */
public class Knight extends Piece {

    public Knight(PieceColor color) {
        super(color);
    }
    
    @Override
    public void isPieceMovement(int f1, int c1, int f2, int c2) throws NoPieceMoveException{
        int f = f2-f1;
        int c = c2-c1;
        if(!((f==2 || f==-2) && (c==1 || c==-1)) && !((f==1 || f==-1) && (c==2 || c==-2))){
            //Movimiento no válido
            throw new NoPieceMoveException();
        }
    }

    @Override
    public void isPathFree(int f1, int c1, int f2, int c2, Board b) throws NoPathFreeException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
