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
    @Test
    public void testSize() {
        System.out.println("tamaño");
        singlyLinkedList instance = new singlyLinkedList();
        int expResult = 1;
        int value = 1;
        instance.addFirst(value);
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
        System.out.println("añadir al principio");
        Object value = 1;
        int expResult = 1;
        singlyLinkedList instance = new singlyLinkedList();
        instance.addFirst(value);
        int i = 0;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método addLast
     */
    @Test
    public void testAddLast() {
        System.out.println("agregar al final");
        int value = 1;
        int expResult = 1;
        singlyLinkedList instance = new singlyLinkedList();
        instance.addLast(value);
        int i = 0;
        Object result = instance.remove(instance.size());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método add
     */
    @Test
    public void testAdd() {
        System.out.println("agregar");
        int i = 0;
        int o = 3;
        singlyLinkedList instance = new singlyLinkedList();
        instance.add(i, o);
        int expResult = 1;
        Object result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método remove
     */
    @Test
    public void testRemove() {
        System.out.println("remover");
        int value = 1;
        int expResult = 1;
        singlyLinkedList instance = new singlyLinkedList();
        instance.addLast(value);
        int i = 0;
        Object result = instance.remove(instance.size());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método get
     */
    @Test
    public void testGet() {
        System.out.println("obtener");
        int value = 1;
        int expResult = 1;
        singlyLinkedList instance = new singlyLinkedList();
        instance.addLast(value);
        int i = 0;
        Object result = instance.get(instance.size());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
