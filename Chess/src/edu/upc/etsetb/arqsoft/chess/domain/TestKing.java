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
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author paulagomezduran
 */


public class TestKing extends TestCase{
    
    public TestKing(String str){
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
    
    /**
     * Test of isPieceMovement method, of class King.
     */
    @Test
    public void testKing01_OK() {
        System.out.println("testKing01_OK");
        int f1 = 1;
        int c1 = 1;
        int f2 = 1;
        int c2 = 2;
        King instance = new King(PieceColor.WHITE);
        
        try {
            instance.isPieceMovement(f1, c1, f2, c2);
            Assert.assertTrue(true);
        } catch (Exception e) {  
            Assert.assertTrue(false);
        } 
    }
    
    @Test
    public void testKing02_KO() {
        System.out.println("testKing02_K0");
        int f1 = 1;
        int c1 = 1;
        int f2 = 3;
        int c2 = 2;
        King instance = new King(PieceColor.WHITE);
        
        try {
            instance.isPieceMovement(f1, c1, f2, c2);
            Assert.assertTrue(false);
        } catch (Exception e) {  
            Assert.assertTrue(true);
        } 
    }
    
    public static TestSuite suite(){
    
        TestSuite suite = new TestSuite();
        suite.addTest(new TestKing("testKing01_OK"));
        suite.addTest(new TestKing("testKing02_KO"));
        return suite;
    }
}

