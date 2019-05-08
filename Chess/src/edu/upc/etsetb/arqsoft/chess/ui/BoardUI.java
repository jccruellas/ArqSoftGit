/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.ui;

/**
 *
 * @author JuanCarlos
 */
public abstract class BoardUI {
    
    public static final int NUM_ROWS = 8 ;
    public static final int NUM_COLS = 8 ;
    
    public abstract void redraw() ;
    public abstract void move(int f1, int c1, int f2, int c2) ;
}
