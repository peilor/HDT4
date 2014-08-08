/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase Test para la clase DoublyLinkedList
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DoublyLinkedListTest {
    
    public DoublyLinkedListTest() {
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
     * Probando el método size 
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método addFirst
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método addLast
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método removeFirst
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método removeLast
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método add
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int i = 0;
        Object o = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.add(i, o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     *Probando el método remove
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int i = 0;
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = null;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método get 
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
