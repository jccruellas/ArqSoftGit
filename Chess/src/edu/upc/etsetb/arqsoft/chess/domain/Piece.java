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
public abstract class Piece {
    
    protected PieceColor color;

    public Piece(PieceColor color) {
        this.color = color;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public PieceColor getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(PieceColor color) {
        this.color = color;
    }

    public abstract void isPieceMovement(int f1, int c1, int f2, int c2) throws NoPieceMoveException;
    
    public abstract void isPathFree(int f1, int c1, int f2, int c2, Board b) throws NoPathFreeException ;
}
