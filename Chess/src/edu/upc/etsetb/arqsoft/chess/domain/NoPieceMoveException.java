package edu.upc.etsetb.arqsoft.chess.domain;

public class NoPieceMoveException extends Exception{
    
    public NoPieceMoveException(){
        
    }
    public NoPieceMoveException(String msg) {
        super(msg);
    }

}