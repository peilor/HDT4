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
public class listTest {
    
    public listTest() {
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
     * Test of size method, of class list.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        list instance = new listImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class list.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        list instance = new listImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class list.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        list instance = new listImpl();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class list.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        list instance = new listImpl();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class list.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        list instance = new listImpl();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class list.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        list instance = new listImpl();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class list.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        list instance = new listImpl();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class list.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        list instance = new listImpl();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class list.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object value = null;
        list instance = new listImpl();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class list.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        list instance = new listImpl();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class list.
     */
    @Test
    public void testGet_0args() {
        System.out.println("get");
        list instance = new listImpl();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class list.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int i = 0;
        list instance = new listImpl();
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class list.
     */
    @Test
    public void testAdd_int_GenericType() {
        System.out.println("add");
        int i = 0;
        Object o = null;
        list instance = new listImpl();
        instance.add(i, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class list.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int i = 0;
        list instance = new listImpl();
        Object expResult = null;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class listImpl implements list {

        public int size() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public void addFirst(E value) {
        }

        public void addLast(E value) {
        }

        public E getFirst() {
            return null;
        }

        public E getLast() {
            return null;
        }

        public E removeFirst() {
            return null;
        }

        public E removeLast() {
            return null;
        }

        public void add(E value) {
        }

        public E remove() {
            return null;
        }

        public E get() {
            return null;
        }

        public E get(int i) {
            return null;
        }

        public void add(int i, E o) {
        }

        public E remove(int i) {
            return null;
        }
    }
    
}
