/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author natal
 */
public class TestPawn extends TestCase {

    public TestPawn(String str) {
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
    @Test
    public void testPawn1Black_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        //first move check, constructor initializes at firstmove = true
        try {
            p.isPieceMovement(1, 4, 3, 4);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    public void testPawn2Black_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // Kill to the front right
        try {
            p.isPieceMovement(2, 3, 3, 4);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    public void testPawn3Black_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // Kill to the front left
        try {
            p.isPieceMovement(2, 3, 3, 2);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }

    public void testPawn4Black_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // Move one to the front
        try {
            p.isPieceMovement(2, 3, 3, 3);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    
    public void testPawn1Black_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        p.isPieceMovement(1, 4, 3, 4);
        //we make a move before test, first move will be false, and we try to make to at once
        try {
            p.isPieceMovement(3, 4, 6, 4);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }

    public void testPawn2Black_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // We only move to the right, not straight
        try {
            p.isPieceMovement(3, 4, 3, 5);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
    
    public void testPawn3Black_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // We only move to the left, not straight
        try {
            p.isPieceMovement(2, 4, 2, 3);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
    public void testPawn4Black_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // We move backwards
        try {
            p.isPieceMovement(2, 3, 1, 3);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
        
    public void testPawn5Black_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // Kill back left
        try {
            p.isPieceMovement(1, 3, 2, 2);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }

    public void testPawn6Black_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // We Kill back right
        try {
            p.isPieceMovement(1, 3, 2, 4);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }


        public void testPawn1White_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        //first move check, constructor initializes at firstmove = true
        try {
            p.isPieceMovement(3, 4, 1, 4);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    public void testPawn2White_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // Kill to the front right
        try {
            p.isPieceMovement(3, 3, 2, 4);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    public void testPawn3White_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // Kill to the front left
        try {
            p.isPieceMovement(3, 3, 2, 2);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }

    public void testPawn4White_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // Move one to the front
        try {
            p.isPieceMovement(3, 3, 2, 3);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    
    public void testPawn1White_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        p.isPieceMovement(3, 4, 2, 4);
        //we make a move before test, first move will be false, and we try to make to at once
        try {
            p.isPieceMovement(6, 4, 3, 4);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }

    public void testPawn2White_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // We only move to the right, not straight
        try {
            p.isPieceMovement(3, 4, 3, 5);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
    
    public void testPawn3White_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // We only move to the left, not straight
        try {
            p.isPieceMovement(2, 4, 2, 3);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
    public void testPawn4White_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // We move backwards
        try {
            p.isPieceMovement(1, 3, 2, 3);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
        
    public void testPawn5White_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // Kill back left
        try {
            p.isPieceMovement(1, 3, 2, 2);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }

    public void testPawn6White_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.WHITE);
        // We Kill back right
        try {
            p.isPieceMovement(1, 3, 2, 4);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
    
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestPawn("testPawn1Black_OK"));
        suite.addTest(new TestPawn("testPawn2Black_OK"));
        suite.addTest(new TestPawn("testPawn3Black_OK"));
        suite.addTest(new TestPawn("testPawn4Black_OK"));
        
        suite.addTest(new TestPawn("testPawn1Black_KO"));
        suite.addTest(new TestPawn("testPawn2Black_KO"));
        suite.addTest(new TestPawn("testPawn3Black_KO"));
        suite.addTest(new TestPawn("testPawn4Black_KO"));
        suite.addTest(new TestPawn("testPawn5Black_KO"));
        suite.addTest(new TestPawn("testPawn6Black_KO"));

        suite.addTest(new TestPawn("testPawn1White_OK"));
        suite.addTest(new TestPawn("testPawn2White_OK"));
        suite.addTest(new TestPawn("testPawn3White_OK"));
        suite.addTest(new TestPawn("testPawn4White_OK"));
        
        suite.addTest(new TestPawn("testPawn1White_KO"));
        suite.addTest(new TestPawn("testPawn2White_KO"));
        suite.addTest(new TestPawn("testPawn3White_KO"));
        suite.addTest(new TestPawn("testPawn4White_KO"));
        suite.addTest(new TestPawn("testPawn5White_KO"));
        suite.addTest(new TestPawn("testPawn6White_KO"));
        return suite;
    }
}
