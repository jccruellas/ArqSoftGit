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
public class Square {
    
        private Piece piece;

    public Square() {
    }

    public Square(Piece piece) {
        this.piece = piece;
    }

    /**
     * Get the value of piece
     *
     * @return the value of piece
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Set the value of piece
     *
     * @param piece new value of piece
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}
