/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author adribarja
 */
import org.junit.Assert;
public class TestRook  extends TestCase{
    
    public TestRook(String str) {
        super(str);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(new TestRook("testPieceMoveRook1_OK"));
        suite.addTest(new TestRook("testPieceMoveRook2_OK"));
        suite.addTest(new TestRook("testPieceMoveRook3_OK"));
        suite.addTest(new TestRook("testPieceMoveRook4_KO"));
        suite.addTest(new TestRook("testPieceMoveRook5_KO"));

        return suite;
    }

    public void testPieceMoveRook1_OK(){
        // Given a Rook
        Rook rookUnderTest = new Rook(PieceColor.WHITE);
        
        // When a valid movement is given
        try{
            rookUnderTest.isPieceMovement(0, 0, 0, 3);
            Assert.assertTrue(true);
        }
        catch (NoPieceMoveException ex){
            Assert.assertTrue(false);
        }
    }
    
    public void testPieceMoveRook2_OK(){
        // Given a Rook
        Rook rookUnderTest = new Rook(PieceColor.WHITE);
        
        // When a valid movement is given
        try{
            rookUnderTest.isPieceMovement(0, 0, 3, 0);
            Assert.assertTrue(true);
        }
        catch (NoPieceMoveException ex){
            Assert.assertTrue(false);
        }
    }
    public void testPieceMoveRook3_OK(){
        // Given a Rook
        Rook rookUnderTest = new Rook(PieceColor.WHITE);
        
        // When a valid movement is given
        try{
            rookUnderTest.isPieceMovement(0, 0, 0, 0);
            Assert.assertTrue(true);
        }
        catch (NoPieceMoveException ex){
            Assert.assertTrue(false);
        }
    }
    public void testPieceMoveRook4_KO(){
        // Given a Rook
        Rook rookUnderTest = new Rook(PieceColor.WHITE);
        
        // When a valid movement is given
        try{
            rookUnderTest.isPieceMovement(0, 0, 3, 3);
            Assert.assertTrue(false);
        }
        catch (NoPieceMoveException ex){
            Assert.assertTrue(true);
        }
    }
    public void testPieceMoveRook5_KO(){
        // Given a Rook
        Rook rookUnderTest = new Rook(PieceColor.WHITE);
        
        // When a valid movement is given
        try{
            rookUnderTest.isPieceMovement(1, 2, 3, 4);
            Assert.assertTrue(false);
        }
        catch (NoPieceMoveException ex){
            Assert.assertTrue(true);
        }
    }   
    
}
