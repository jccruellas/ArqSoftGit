/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import edu.upc.etsetb.arqsoft.chess.services.ProtocolManager;

/**
 *
 * @author JuanCarlos
 */
public class ChessGame {

    private Board board;

    private Player wPiecesPlayer;

    private Player bPiecesPlayer;

    private ProtocolManager protocolMgr;

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
    
}
