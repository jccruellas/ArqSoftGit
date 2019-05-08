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
public class Board {

    public static final int NUM_ROWS = 8;
    public static final int NUM_COLS = 8;

    private Square[][] squares;

    public Board(boolean putPiecesOnBoard) {
        this.squares = new Square[8][8];
        for(int i=0;i<Board.NUM_ROWS;i++){
            for(int j=0;j<Board.NUM_COLS;j++){
                this.squares[i][j] = new Square() ;
            }
        }
        Piece piece = null;
        if (putPiecesOnBoard) {
            //Put pawns
            for (int i = 0; i < NUM_COLS; i++) {
                this.squares[6][i].setPiece(new Pawn(PieceColor.WHITE));
                this.squares[1][i].setPiece(new Pawn(PieceColor.BLACK));
            }
            //Put Rocks
            this.squares[7][0].setPiece(new Rook(PieceColor.WHITE));
            this.squares[7][7].setPiece(new Rook(PieceColor.WHITE));
            this.squares[0][0].setPiece(new Rook(PieceColor.BLACK));
            this.squares[0][7].setPiece(new Rook(PieceColor.BLACK));
            //Put Knights
            this.squares[7][1].setPiece(new Knight(PieceColor.WHITE));
            this.squares[7][6].setPiece(new Knight(PieceColor.WHITE));
            this.squares[0][1].setPiece(new Knight(PieceColor.BLACK));
            this.squares[0][6].setPiece(new Knight(PieceColor.BLACK));
            //Put Bishops
            this.squares[7][2].setPiece(new Bishop(PieceColor.WHITE));
            this.squares[7][5].setPiece(new Bishop(PieceColor.WHITE));
            this.squares[0][2].setPiece(new Bishop(PieceColor.BLACK));
            this.squares[0][5].setPiece(new Bishop(PieceColor.BLACK));
            //Put Queens
            this.squares[7][3].setPiece(new Queen(PieceColor.WHITE));
            this.squares[0][3].setPiece(new Queen(PieceColor.BLACK));
            //Put Kings
            this.squares[7][4].setPiece(new King(PieceColor.WHITE));
            this.squares[0][4].setPiece(new King(PieceColor.BLACK));
            
        }

    }

}
