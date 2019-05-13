/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import edu.upc.etsetb.arqsoft.chess.services.ProtocolManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanCarlos
 */
public class ChessGame {
    private Board board;

    private Player wPiecesPlayer;

    private Player bPiecesPlayer;

    private ProtocolManager protocolMgr;
    
    private PieceColor playingColor;

    public ChessGame(ProtocolManager protocolMgr){
        this.board = new Board(false);
        this.playingColor = PieceColor.WHITE;
        this.wPiecesPlayer = new Player(PieceColor.WHITE, this.board);
        this.bPiecesPlayer = new Player(PieceColor.BLACK, this.board);
        this.protocolMgr = protocolMgr;
    }
    
    /**
     * Get the value of protocolMgr
     *
     * @return the value of protocolMgr
     */
    public ProtocolManager getProtocolMgr() {
        return protocolMgr;
    }

    /**
     * Set the value of protocolMgr
     *
     * @param protocolMgr new value of protocolMgr
     */
    public void setProtocolMgr(ProtocolManager protocolMgr) {
        this.protocolMgr = protocolMgr;
    }

    /**
     * Get the value of wPiecesPlayer
     *
     * @return the value of wPiecesPlayer
     */
    public Player getwPiecesPlayer() {
        return wPiecesPlayer;
    }

    /**
     * Set the value of wPiecesPlayer
     *
     * @param wPiecesPlayer new value of wPiecesPlayer
     */
    public void setwPiecesPlayer(Player wPiecesPlayer) {
        this.wPiecesPlayer = wPiecesPlayer;
    }

    /**
     * Get the value of bPiecesPlayer
     *
     * @return the value of bPiecesPlayer
     */
    public Player getbPiecesPlayer() {
        return bPiecesPlayer;
    }

    /**
     * Set the value of bPiecesPlayer
     *
     * @param bPiecesPlayer new value of bPiecesPlayer
     */
    public void setbPiecesPlayer(Player bPiecesPlayer) {
        this.bPiecesPlayer = bPiecesPlayer;
    }

    /**
     * Get the value of board
     *
     * @return the value of board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Set the value of board
     *
     * @param board new value of board
     */
    public void setBoard(Board board) {
        this.board = board;
    }
    
    public void move(int f1, int c1, int f2, int c2){
        Piece piece = this.board.getPiece(f1, c1);
        if(piece == null){
            protocolMgr.badMoveOriginEmpty(f1, c1);
            return ;
        }
        if(piece.getColor() != this.playingColor){
            protocolMgr.badMoveWrongColor(f1, c1, piece);
            return ;
        }
        try {
            piece.isPieceMovement(f1, c1, f2, c2);
            piece.isPathFree(f1, c1, f2, c2, board);
            this.board.movePiece(f1, c1, f2, c2, piece);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
        } catch (NoPathFreeException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
