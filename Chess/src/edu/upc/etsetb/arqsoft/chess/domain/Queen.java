/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import static java.lang.Math.abs;

/**
 *
 * @author JuanCarlos
 */
public class Queen extends Piece {

    public Queen(PieceColor color) {
        super(color);
    }

    public void isPieceMovement(int f1, int c1, int f2, int c2) throws NoPieceMoveException {

        if (!(f1 == f2 || c1 == c2 || (abs(f1 - f2) == abs(c1 - c2)))) {
            // Movimiento incorrecto
            throw new NoPieceMoveException("Not a valid movement for the Queen");
        }
    }

    @Override
    public void isPathFree(int f1, int c1, int f2, int c2, Board b) throws NoPathFreeException {
        boolean behavior; // If true -> Queen behaves like Bishop ; If false -> Queen behaves like Rook

        behavior = (c1 == c2 || f1 == f2) ? false : true;

        // If there is a piece in the last position of the same color the movement is invalid
        // If is not the same color you capture
        if (b.getPiece(f2, c2) != null) {
            if(b.getPiece(f2, c2).getColor() == this.color ) {
                throw new NoPathFreeException();
            }
        }
        if (behavior) {
            // Bishop Case
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
                for (int i = 0; i <= f2; i++) {
                    if (b.getPiece(f1 + i, c1 - i) != null) {
                        throw new NoPathFreeException();
                    }
                }
            } else if ((f2 - f1) < 0 && (c2 - c1) < 0) {
                //downleft
                for (int i = 0; i <= f2; i++) {
                    if (b.getPiece(f1 - i, c1 - i) != null) {
                        throw new NoPathFreeException();
                    }
                }
            }
        } else {
            // Rook Case
            if (c1 == c2) {
                // Row movement
                if (f1 < f2) {
                    // Right
                    for (int i = 0; i < f2; i++) {
                        if (b.getPiece(f1 + i, c1) != null) {
                            throw new NoPathFreeException();
                        }
                    }
                } else {
                    // Left
                    for (int i = 0; i < f1; i++) {
                        if (b.getPiece(f1 - i, c1) != null) {
                            throw new NoPathFreeException();
                        }
                    }
                }
            } else {
                // Column movement
                if (c1 < c2) {
                    // Up
                    for (int i = 0; i < c2; i++) {
                        if (b.getPiece(f1, c1 + 1) != null) {
                            throw new NoPathFreeException();
                        }
                    }
                } else {
                    // Down
                    for (int i = 0; i < f1; i++) {
                        if (b.getPiece(f1, c1 - 1) != null) {
                            throw new NoPathFreeException();
                        }
                    }
                }
            }
        }
    }
}
