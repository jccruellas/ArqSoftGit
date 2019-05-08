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
    public void testPawn1_OK() throws Exception {
        System.out.println("testPawn1_OK()");
        Pawn p = new Pawn(PieceColor.BLACK);
        //first move check, constructor initializes at firstmove = true
        try {
            p.isPieceMovement(1, 4, 3, 4);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    public void testPawn2_OK() throws Exception {
        System.out.println("testPawn1_OK()");
        Pawn p = new Pawn(PieceColor.BLACK);
        // Kill to the front right
        try {
            p.isPieceMovement(2, 3, 3, 4);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    public void testPawn3_OK() throws Exception {
        System.out.println("testPawn1_OK()");
        Pawn p = new Pawn(PieceColor.BLACK);
        // Kill to the front left
        try {
            p.isPieceMovement(2, 3, 3, 2);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }

    public void testPawn4_OK() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // Move one to the front
        try {
            p.isPieceMovement(2, 3, 3, 3);
            Assert.assertTrue(true);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(false);
        }
    }
    
    public void testPawn1_KO() throws Exception {
        System.out.println("testPawn1_KO()");
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

    public void testPawn2_KO() throws Exception {
        System.out.println("testPawn1_OK()");
        Pawn p = new Pawn(PieceColor.BLACK);
        // We only move to the right, not straight
        try {
            p.isPieceMovement(3, 4, 3, 5);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
    
    public void testPawn3_KO() throws Exception {
        System.out.println("testPawn1_OK()");
        Pawn p = new Pawn(PieceColor.BLACK);
        // We only move to the left, not straight
        try {
            p.isPieceMovement(2, 4, 2, 3);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
    public void testPawn4_KO() throws Exception {
        System.out.println("testPawn1_OK()");
        Pawn p = new Pawn(PieceColor.BLACK);
        // We move backwards
        try {
            p.isPieceMovement(2, 3, 1, 3);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }
        
    public void testPawn5_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // Kill back left
        try {
            p.isPieceMovement(2, 3, 1, 2);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }

    public void testPawn6_KO() throws Exception {
        Pawn p = new Pawn(PieceColor.BLACK);
        // We Kill back right
        try {
            p.isPieceMovement(2, 3, 1, 4);
            Assert.assertTrue(false);
        } catch( NoPieceMoveException e ){
            Assert.assertTrue(true);
        }
    }


    
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestPawn("testPawn1_OK"));
        suite.addTest(new TestPawn("testPawn2_OK"));
        suite.addTest(new TestPawn("testPawn3_OK"));
        suite.addTest(new TestPawn("testPawn4_OK"));
        
        suite.addTest(new TestPawn("testPawn1_KO"));
        suite.addTest(new TestPawn("testPawn2_KO"));
        suite.addTest(new TestPawn("testPawn3_KO"));
        suite.addTest(new TestPawn("testPawn4_KO"));
        suite.addTest(new TestPawn("testPawn5_KO"));
        suite.addTest(new TestPawn("testPawn6_KO"));
        return suite;
    }
}
