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
public class SnowMobileTest {
    
    public SnowMobileTest() {
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
    public void testGetCapacity()
    {
        SnowMobile f1 = new SnowMobile(false, 435.34, 765, 4, "437g");
        assertEquals(4, f1.getCapacity());
    }
    @Test
    public void testSetCapacity()
    {
        SnowMobile f1 = new SnowMobile(false, 435.34, 765, 4, "437g");
        f1.setCapacity(6);
        assertEquals(6,f1.getCapacity());
    }
    
    @Test 
    public void testGetVin()
    {
        SnowMobile temp = new SnowMobile(false, 435.34, 765, 6, "437g");
        assertEquals(temp.getVin(),"437g");
    }
    @Test
    public void testSetVin()
    {
        SnowMobile f1 = new SnowMobile(false, 435.34, 765, 6, "437g");
        f1.setVin("hsgd62");
        assertEquals(f1.getVin(),"hsgd62");
    }
    
    @Test
    public void testLateCharge()
    {
        SnowMobile f1 = new SnowMobile(false, 435.34, 765, 6, "437g");
        double cost = 4*5;
        cost +=20;
        cost /=100;
        assertEquals(cost,f1.lateCharge());
    }
    
    @Test
    public void testToString()
    {
        SnowMobile f1 = new SnowMobile(false, 435.34, 765, 6, "437g");
        String b = "newModel: false RentalCost: 6435.34 Rental Number: 765 Capacity: 6 Vin: 437g";
        assertEquals(b,f1.toString());
    }
}
