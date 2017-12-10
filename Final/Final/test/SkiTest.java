/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author rcc
 */
public class SkiTest {
    
    public SkiTest() {
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
    
    //My test
    @Test
    public void testEquals()
    {
        Ski f1 = new Ski(true, 63.865, 5, 8350);
        Ski f2 = new Ski(true, 35.45, 5, 930);
        assertEquals(true, f1.equals(f2));
    }
     @Test
    public void testGetNewModel()
    {
        Ski f1 = new Ski(true, 35.52, 5, 75);
        assertEquals(true, f1.getnewModel());
    }
    @Test
    public void testSetNewModel()
    {
        Ski f1 = new Ski(true, 35.52, 5, 85);
        f1.setnewModel(false);
        assertEquals(false, f1.getnewModel());
    }
    @Test
    public void testGetRentalCost()
    {
        Ski f1 = new Ski(true, 100.54, 5, 80);
        boolean answer = (100.54 == f1.getrentalCost());
        assertEquals(true, answer);
    }
    @Test
    public void testSetRentalCost()
    {
        Ski f1 = new Ski(true, 4.35, 5, 90);
        f1.setrentalCost(8.36);
        boolean result = (8.36 == f1.getrentalCost());
        assertEquals(true, result);
    }
    @Test
    public void testGetRentalNumber()
    {
        Ski f1 = new Ski(true, 4.35, 90, 120);
        boolean result = (90 == f1.getrentalNumber());
        assertEquals(true, result);
    }
    @Test
    public void testSetRentalNumber()
    {
        Ski f1 = new Ski(true, 4.35, 90, 120);
        f1.setrentalNumber(71);
        boolean result = (71 == f1.getrentalNumber());
        assertEquals(true, result);        
    }
    @Test
    public void testGetSize()
    {
        Ski f1 = new Ski(true, 4.35, 90, 120);
        boolean result = (120 == f1.getSize());
        assertEquals(true, result);
    }
    @Test
    public void testSetSize()
    {
        Ski f1 = new Ski();
        f1.setSize(140);
        boolean result = (140 == f1.getSize());
        assertEquals(true, result);
    }
    @Test
    public void testLateCharge()
    {
        Ski f1 = new Ski(true, 10.22, 90, 120);
        double cost = 10.22 * .10;
        assertEquals(cost,f1.getrentalCost());
    }
    
    @Test 
    public void testToString()
    {
        Ski f1 = new Ski(true, 2.3, 23, 90);
        String b = "newModel: true RentalCost: 2.3 Rental Number: 23 Size: 90";
        assertEquals(f1.toString(), b);
    }
}
