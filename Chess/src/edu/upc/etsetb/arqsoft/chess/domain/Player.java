/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import java.util.List;

/**
 *
 * @author JuanCarlos
 */
public class Player {
    private PieceColor color;
    private List<Piece> pieces;
    private int[] kingPos;
    
    public Player(PieceColor color, Board board){
        this.color = color;
        this.kingPos = new int[2];
        
        //Put pawns
        for (int i = 0; i < 8; i++) {
            if(color==PieceColor.WHITE)
                board.setPiece(6, i, new Pawn(color));
            else
                board.setPiece(1, i, new Pawn(color));
        }
        if(color==PieceColor.WHITE){
            //Put Rocks
            board.setPiece(7,0,new Rook(PieceColor.WHITE));
            board.setPiece(7,7,new Rook(PieceColor.WHITE));
            //Put Knights
            board.setPiece(7,1,new Knight(PieceColor.WHITE));
            board.setPiece(7,6,new Knight(PieceColor.WHITE));
            //Put Bishops
            board.setPiece(7,2,new Bishop(PieceColor.WHITE));
            board.setPiece(7,5,new Bishop(PieceColor.WHITE));
            //Put Queen
            board.setPiece(7,3,new Queen(PieceColor.WHITE));
            //Put King
            board.setPiece(7,4,new King(PieceColor.WHITE));
            //Put king position
            this.kingPos[0] = 7;
            this.kingPos[1] = 4;
        }else{
            //Put Rocks
            board.setPiece(0,0,new Rook(PieceColor.BLACK));
            board.setPiece(0,7,new Rook(PieceColor.BLACK));
            //Put Knights
            board.setPiece(0,1,new Knight(PieceColor.BLACK));
            board.setPiece(0,6,new Knight(PieceColor.BLACK));
            //Put Bishops
            board.setPiece(0,2,new Bishop(PieceColor.BLACK));
            board.setPiece(0,5,new Bishop(PieceColor.BLACK));
            //Put Queen
            board.setPiece(0,3,new Queen(PieceColor.BLACK));
            //Put King
            board.setPiece(0,4,new King(PieceColor.BLACK));
            //Put king position
            this.kingPos[0] = 0;
            this.kingPos[1] = 4;
        }
    }
}
