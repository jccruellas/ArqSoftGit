/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

public class Pawn extends Piece {

    public boolean firstmove = true;

    public Pawn(PieceColor color) {
        super(color);
    }

    @Override
    public void isPieceMovement(int f1, int c1, int f2, int c2) throws NoPieceMoveException {
        /*
    * We assume black Pawn moves in increasing line numbers, whils white pawn moves in decreasing number
         */
        color = super.getColor();
        switch (color) {
            case BLACK:
                if (this.firstmove == true && f2 - f1 == 2 && c1 == c2) {
                    this.firstmove = false;
                    return;
                } else if (f2 - f1 == 1 && c1 == c2) {
                    if (this.firstmove == true) {
                        this.firstmove = false;
                    }
                    return;
                } else if (f2 - f1 == 1 && (c2 - c1 == 1 || c1 - c2 == 1)) {
                    if (this.firstmove == true) {
                        this.firstmove = false;
                    }
                    return;
                }
                throw new NoPieceMoveException("Invalid pawn movement");
            case WHITE:
                if (this.firstmove == true && f2 - f1 == -2 && c1 == c2) {
                    this.firstmove = false;
                    return;
                } else if (f2 - f1 == -1 && c1 == c2) {
                    if (this.firstmove == true) {
                        this.firstmove = false;
                    }
                    return;
                } else if (f2 - f1 == -1 && (c2 - c1 == 1 || c1 - c2 == 1)) {
                    if (this.firstmove == true) {
                        this.firstmove = false;
                    }
                    return;
                }
                throw new NoPieceMoveException("Invalid pawn movement");
        }
    }

    @Override
    public void isPathFree(int f1, int c1, int f2, int c2, Board b) throws NoPathFreeException {

        color = super.getColor();
        switch (color) {
            case BLACK: {
                if ((f2 - f1 == 2 && c1 == c2)) {
                    if ((b.getPiece(f2, c2) == null) && (b.getPiece(f2 - 1, c2) == null)) {
                        return;
                    }
                } else if (f2 - f1 == 1 && c1 == c2) {
                    if (b.getPiece(f2, c2) == null) {
                        return;
                    }
                } else if (f2 - f1 == 1 && (c2 - c1 == 1 || c1 - c2 == 1)) {
                    if (b.getPiece(f2, c2) != null) {
                        return;
                    }
                }
                throw new NoPathFreeException("Invalid path");
            }
            case WHITE: {
                if ((f2 - f1 == -2 && c1 == c2)) {
                    if ((b.getPiece(f2, c2) == null) && (b.getPiece(f2 + 1, c2) == null)) {
                        return;
                    }
                } else if (f2 - f1 == -1 && c1 == c2) {
                    if (b.getPiece(f2, c2) == null) {
                        return;
                    }
                } else if (f2 - f1 == -1 && (c2 - c1 == 1 || c1 - c2 == 1)) {
                    if (b.getPiece(f2, c2) != null) {
                        return;
                    }
                }
                throw new NoPathFreeException("Invalid path");
            }
        }

    }
    //To change body of generated methods, choose Tools | Templates.


}
