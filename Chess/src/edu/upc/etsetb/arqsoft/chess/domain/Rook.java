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
        int c_start = 0;
        int c_end = 0;
        int f_start = 0;
        int f_end = 0;
        
        if(c1<c2){
            c_start = c1;
            c_end = c2;
        }
        else{
            c_start = c2;
            c_end = c1;
        }
        
        if(f1<f2){
            c_start = f1;
            c_end = f2;
        }
        else{
            c_start = f2;
            c_end = f1;
        }
        
        for(int fi=f_start;fi<=f_end;++fi){
            for(int ci=c_start;ci<=c_end;++ci){
                Piece piece = b.getPiece(fi, ci);
                if(piece != null){
                    String msg = String.format("No path free, there is a piece in (%d,%d)", fi,ci);
                    throw new NoPathFreeException(msg);
                }
            }
        }
    }
}

