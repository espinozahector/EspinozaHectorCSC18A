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
public class SnowBoardTest {
    
    public SnowBoardTest() {
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

    @Test
    public void testGetSize()
    {
        Snowboard temp = new Snowboard(true, 120.54, 23, 214, false);
        assertEquals(214, temp.getSize());
    }
    @Test
    public void testSetSize()
    {
        Snowboard temp = new Snowboard(true, 120.54, 23, 214, false);
        temp.setSize(64);
        assertEquals(64, temp.getSize());
    }
    
    @Test
    public void testGetFreestyle()
    {
        Snowboard temp = new Snowboard(true, 120.54, 23, 64, false);
        assertEquals(false, temp.getfreestyle());
    }
    @Test
    public void testSetFreestyle()
    {
        Snowboard temp = new Snowboard(true, 120.54, 23, 64, false);
        temp.setfreestyle(true);
        assertEquals(true, temp.getfreestyle());
    }
         
    @Test
    public void testlateCharge()
    {
        Snowboard temp = new Snowboard(true, 120.54, 23, 64, true);
        double cost = 120.54 * .20;
        assertEquals(cost, temp.lateCharge());
    }
    
    @Test
    public void testToString()
    {
        Snowboard temp = new Snowboard(true, 120.54, 23, 64, true);
        String b = "newModel: true RentalCost: 120.54 Rental Number: 23 Size: 64 Freestyle: true";
        assertEquals(b,temp.toString());
        
    }
}

