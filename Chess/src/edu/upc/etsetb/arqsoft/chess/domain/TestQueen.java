/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author alexg
 */
public class TestQueen extends TestCase{
    
    public TestQueen(String str){
        super(str);
    }
    
    
    public void testQueen1_OK(){
        
        // Given a queen
        Queen queen = new Queen(PieceColor.WHITE);

        try{
            // When a correct vertical/horizontal movement is done
            queen.isPieceMovement(2, 3, 4, 3); // Horizontal-right
            queen.isPieceMovement(2, 3, 2, 7); // Vertical-top
            queen.isPieceMovement(2, 3, 1, 3); // Horizontal-left
            queen.isPieceMovement(2, 3, 2, 1); // Vertical-down
            System.out.println("Correct vertical/horizontal movements");
            // When a correct diagonal movement is done
            queen.isPieceMovement(2, 3, 5, 6); // Top-right
            queen.isPieceMovement(2, 3, 1, 2); // Down-left
            queen.isPieceMovement(2, 3, 1, 4); // Top-left
            queen.isPieceMovement(2, 3, 3, 2); // Down-right
            System.out.println("Correct diagonal movements");

            
            // The movements do not throw any exception
            Assert.assertTrue(true);
            
        }catch(NoPieceMoveException ex){
            // The movement is not correct
            Assert.assertTrue(false);
        }
    } 
    
    public void testQueen1_KO(){
        
        // Given a queen
        Queen queen = new Queen(PieceColor.WHITE);

        try{
            // When an incorrect movement is done
            queen.isPieceMovement(2, 3, 7, 4);
            //queen.isPieceMovement(2, 3, 5, 7);
            //queen.isPieceMovement(2, 3, 5, 6);
            //queen.isPieceMovement(2, 3, 1, 2);
            
            // The movements do not throw any exception
            Assert.assertTrue(false);
            
        }catch(NoPieceMoveException ex){
            // The movement is not correct
            System.out.println("Incorrect movement detected");
            Assert.assertTrue(true);
        }
    }
    
    
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(new TestQueen("testQueen1_OK"));
        suite.addTest(new TestQueen("testQueen1_KO"));
        return suite;
    }
}
