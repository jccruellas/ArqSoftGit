/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 *
 * @author luisalberto
 */
public class TestKnight extends TestCase {
    public TestKnight(String str){
        super(str);
    }
    
    @Test
    public void testKnight1_OK(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 4, 5, 6);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
            fail();
        }
    }
    @Test
    public void testKnight2_OK(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 4, 6, 5);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
            fail();
        }
    }
    @Test
    public void testKnight3_OK(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 4, 5, 2);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
            fail();
        }
    }
    @Test
    public void testKnight4_OK(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 4, 6, 3);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
            fail();
        }
    }
    @Test
    public void testKnight5_OK(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 4, 3, 2);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
            fail();
        }
    }
    @Test
    public void testKnight6_OK(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 4, 2, 3);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
            fail();
        }
    }
    @Test
    public void testKnight7_OK(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 4, 3, 6);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
            fail();
        }
    }
    @Test
    public void testKnight8_OK(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 4, 2, 5);
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
            fail();
        }
    }
    
    
    @Test
    public void testKnight1_KO(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(2, 1, 6, 2);
            fail();
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void testKnight2_KO(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(2, 1, 1, 1);
            fail();
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void testKnight3_KO(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(2, 1, 2, 2);
            fail();
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void testKnight4_KO(){
        Piece knight = new Knight(PieceColor.WHITE);
        try {
            knight.isPieceMovement(4, 2, 4, 1);
            fail();
        } catch (NoPieceMoveException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(new TestKnight("testKnight1_OK"));
        suite.addTest(new TestKnight("testKnight2_OK"));
        suite.addTest(new TestKnight("testKnight3_OK"));
        suite.addTest(new TestKnight("testKnight4_OK"));
        suite.addTest(new TestKnight("testKnight5_OK"));
        suite.addTest(new TestKnight("testKnight6_OK"));
        suite.addTest(new TestKnight("testKnight7_OK"));
        suite.addTest(new TestKnight("testKnight8_OK"));
        suite.addTest(new TestKnight("testKnight1_KO"));
        suite.addTest(new TestKnight("testKnight2_KO"));
        suite.addTest(new TestKnight("testKnight3_KO"));
        suite.addTest(new TestKnight("testKnight4_KO"));
        return suite;
    }
    
}
