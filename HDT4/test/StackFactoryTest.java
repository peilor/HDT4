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
 * @author Alejo
 */
public class StackFactoryTest {
    
    public StackFactoryTest() {
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
     * Test of getStack method, of class StackFactory.
     */
    @Test
    public void testGetStack_int() {
        System.out.println("getStack");
        int tipoStack = 0;
        StackFactory instance = new StackFactory();
        Stack expResult = null;
        Stack result = instance.getStack(tipoStack);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStack method, of class StackFactory.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        StackFactory instance = new StackFactory();
        Stack expResult = null;
        Stack result = instance.getStack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
