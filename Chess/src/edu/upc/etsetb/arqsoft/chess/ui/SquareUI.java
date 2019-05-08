/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.ui;

/**
 *
 * @author JuanCarlos
 */
public class SquareUI {
    
    protected PieceUI piece;

    public SquareUI() {
    }

    /**
     * Get the value of piece
     *
     * @return the value of piece
     */
    public PieceUI getPiece() {
        return piece;
    }

    /**
     * Set the value of piece
     *
     * @param piece new value of piece
     */
    public void setPiece(PieceUI piece) {
        this.piece = piece;
    }

    public boolean isOccupied(){
        return this.piece!=null ;
    }
    
}
