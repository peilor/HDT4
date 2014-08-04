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
public class DoublyLinkedNodeTest {
    
    public DoublyLinkedNodeTest() {
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
     * Test of next method, of class DoublyLinkedNode.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        DoublyLinkedNode instance = null;
        DoublyLinkedNode expResult = null;
        DoublyLinkedNode result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class DoublyLinkedNode.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        DoublyLinkedNode instance = null;
        DoublyLinkedNode expResult = null;
        DoublyLinkedNode result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class DoublyLinkedNode.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        DoublyLinkedNode instance = null;
        instance.setNext(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrevious method, of class DoublyLinkedNode.
     */
    @Test
    public void testSetPrevious() {
        System.out.println("setPrevious");
        DoublyLinkedNode instance = null;
        instance.setPrevious(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of value method, of class DoublyLinkedNode.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        DoublyLinkedNode instance = null;
        Object expResult = null;
        Object result = instance.value();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class DoublyLinkedNode.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Object value = null;
        DoublyLinkedNode instance = null;
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
