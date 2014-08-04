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
public class abstractListTest {
    
    public abstractListTest() {
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
     * Test of isEmpty method, of class abstractList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        abstractList instance = new abstractListImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class abstractList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        abstractList instance = new abstractListImpl();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class abstractList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        abstractList instance = new abstractListImpl();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class abstractList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        abstractList instance = new abstractListImpl();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class abstractList.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        abstractList instance = new abstractListImpl();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class abstractList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        abstractList instance = new abstractListImpl();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class abstractList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        abstractList instance = new abstractListImpl();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class abstractList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object value = null;
        abstractList instance = new abstractListImpl();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class abstractList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        abstractList instance = new abstractListImpl();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class abstractList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        abstractList instance = new abstractListImpl();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class abstractListImpl extends abstractList {
    }
    
}
