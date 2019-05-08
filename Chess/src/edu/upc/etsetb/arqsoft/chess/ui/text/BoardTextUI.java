/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.ui.text;

import edu.upc.etsetb.arqsoft.chess.ui.BoardUI;
import edu.upc.etsetb.arqsoft.chess.ui.SquareUI;

/**
 *
 * @author JuanCarlos
 */
public class BoardTextUI extends BoardUI {

    private SquareUI[][] squares;

    public BoardTextUI(boolean putPiecesOnBoard) {
        squares = new SquareUI[NUM_ROWS][NUM_COLS];
        for(int i=0;i<BoardUI.NUM_ROWS;i++){
            for(int j=0;j<BoardUI.NUM_COLS;j++){
                this.squares[i][j] = new SquareUI() ;
            }
        }
        PieceTextUI piece = null;
        if (putPiecesOnBoard) {
            //Put pawns
            for (int i = 0; i < NUM_COLS; i++) {
                this.squares[6][i].setPiece(new PieceTextUI(PieceTypesTextUI.PB));
                this.squares[1][i].setPiece(new PieceTextUI(PieceTypesTextUI.PN));
            }
            //Put Rocks
            this.squares[7][0].setPiece(new PieceTextUI(PieceTypesTextUI.TB));
            this.squares[7][7].setPiece(new PieceTextUI(PieceTypesTextUI.TB));
            this.squares[0][0].setPiece(new PieceTextUI(PieceTypesTextUI.TN));
            this.squares[0][7].setPiece(new PieceTextUI(PieceTypesTextUI.TN));
            //Put Knights
            this.squares[7][1].setPiece(new PieceTextUI(PieceTypesTextUI.CB));
            this.squares[7][6].setPiece(new PieceTextUI(PieceTypesTextUI.CB));
            this.squares[0][1].setPiece(new PieceTextUI(PieceTypesTextUI.CN));
            this.squares[0][6].setPiece(new PieceTextUI(PieceTypesTextUI.CN));
            //Put Bishops
            this.squares[7][2].setPiece(new PieceTextUI(PieceTypesTextUI.AB));
            this.squares[7][5].setPiece(new PieceTextUI(PieceTypesTextUI.AB));
            this.squares[0][2].setPiece(new PieceTextUI(PieceTypesTextUI.AN));
            this.squares[0][5].setPiece(new PieceTextUI(PieceTypesTextUI.AN));
            //Put Queens
            this.squares[7][3].setPiece(new PieceTextUI(PieceTypesTextUI.QB));
            this.squares[0][3].setPiece(new PieceTextUI(PieceTypesTextUI.QN));
            //Put Kings
            this.squares[7][4].setPiece(new PieceTextUI(PieceTypesTextUI.KB));
            this.squares[0][4].setPiece(new PieceTextUI(PieceTypesTextUI.KN));
        }
    }

    @Override
    public void redraw() {
        StringBuilder str = new StringBuilder() ;
        for (int i = 0; i < BoardUI.NUM_ROWS; i++) {
            for (int j = 0; j < BoardUI.NUM_ROWS; j++) {
                PieceTextUI piece = (PieceTextUI)this.squares[i][j].getPiece();
                if(piece!=null){
                    str.append("["); 
                    piece.draw(str);
                    str.append("]") ;
                }
                else{
                    str.append("[  ]") ;
                }
            }
            str.append("\n");
        }
        System.out.println(str.toString());
    }

    @Override
    public void move(int f1, int c1, int f2, int c2) {
        PieceTextUI piece = (PieceTextUI)this.squares[f1][c1].getPiece();
        if(piece!=null){
            this.squares[f1][c1].setPiece(null);
            this.squares[f2][c2].setPiece(piece);
        }
    }

}
