/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.ui.text;

import edu.upc.etsetb.arqsoft.chess.ui.PieceUI;

/**
 *
 * @author JuanCarlos
 */
public class PieceTextUI extends PieceUI{

    private PieceTypesTextUI type;

    public PieceTextUI(PieceTypesTextUI type) {
        this.type = type;
    }
    
    

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public PieceTypesTextUI getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(PieceTypesTextUI type) {
        this.type = type;
    }

    
    public void draw(Object canvas){
        if(canvas.getClass().equals (StringBuilder.class)){
            StringBuilder myCanvas = (StringBuilder)canvas ;
            myCanvas.append(this.type) ;
        }
    }
    
}
