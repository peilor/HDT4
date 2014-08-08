/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase Test para la clase singlyLinkedList
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
     * Probando el método size 
     */
    @Test
    public void testSize() {
        System.out.println("size");
        singlyLinkedList instance = new singlyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     *Probando el método addFirst 
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object o = null;
        singlyLinkedList instance = new singlyLinkedList();
        instance.addFirst(o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método addLast
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object o = null;
        singlyLinkedList instance = new singlyLinkedList();
        instance.addLast(o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método removeFirst
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        singlyLinkedList instance = new singlyLinkedList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     *Probando el método removeLast
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        singlyLinkedList instance = new singlyLinkedList();
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
        singlyLinkedList instance = new singlyLinkedList();
        instance.add(i, o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método remove
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
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método get
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
        //fail("The test case is a prototype.");
    }
    
}
