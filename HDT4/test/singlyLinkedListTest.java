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
public class singlyLinkedListTest {
    
    public singlyLinkedListTest() {
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
     * Test of size method, of class singlyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        singlyLinkedList instance = new singlyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class singlyLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object o = null;
        singlyLinkedList instance = new singlyLinkedList();
        instance.addFirst(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class singlyLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object o = null;
        singlyLinkedList instance = new singlyLinkedList();
        instance.addLast(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class singlyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        singlyLinkedList instance = new singlyLinkedList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class singlyLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        singlyLinkedList instance = new singlyLinkedList();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class singlyLinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int i = 0;
        Object o = null;
        singlyLinkedList instance = new singlyLinkedList();
        instance.add(i, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class singlyLinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int i = 0;
        singlyLinkedList instance = new singlyLinkedList();
        Object expResult = null;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class singlyLinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        singlyLinkedList instance = new singlyLinkedList();
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
