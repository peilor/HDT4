/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase Test para la clase CircularList
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircularListTest {
    
    public CircularListTest() {
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
        CircularList instance = new CircularList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Probando el método addFirst
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        CircularList instance = new CircularList();
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
        CircularList instance = new CircularList();
        instance.addLast(value);
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
        CircularList instance = new CircularList();
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
        CircularList instance = new CircularList();
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
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
