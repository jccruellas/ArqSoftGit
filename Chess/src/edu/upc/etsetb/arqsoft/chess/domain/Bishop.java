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
//        for (int i  = 0; i <= f2 ; i++ ){
//            if (b.getPiece(f1+i, c1+i) != null) {
//                throw new NoPathFreeException();
//            }
//        }

        if (b.getPiece(f2, c2) != null) {
            if (b.getPiece(f2, c2).getColor() == this.color) {
                throw new NoPathFreeException();
            }
        }

        if ((f2 - f1) > 0 && (c2 - c1) > 0) {
                //upright
                for (int i = 0; i < f2; i++) {
                    if (b.getPiece(f1 + i, c1 + i) != null) {
                        throw new NoPathFreeException();
                    }

                }
            } else if ((f2 - f1) < 0 && (c2 - c1) > 0) {
                //upleft
                for (int i = 0; i < f2; i++) {
                    if (b.getPiece(f1 - i, c1 + i) != null) {
                        throw new NoPathFreeException();
                    }
                }
            } else if ((f2 - f1) > 0 && (c2 - c1) < 0) {
                //downright
                for (int i = 0; i < f2; i++) {
                    if (b.getPiece(f1 + i, c1 - i) != null) {
                        throw new NoPathFreeException();
                    }
                }
            } else if ((f2 - f1) < 0 && (c2 - c1) < 0) {
                //downleft
                for (int i = 0; i < f2; i++) {
                    if (b.getPiece(f1 - i, c1 - i) != null) {
                        throw new NoPathFreeException();
                    }
                }
            }
    }
    
}
