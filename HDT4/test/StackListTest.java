/**
 *	Universidad del Valle de Guatemala
 * @author Pablo Argueta, Carnet: 13028
 * @author Alejandro Diaz, Carnet: 13082
 * Clase Test para la clase StackList
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackListTest {
    
    public StackListTest() {
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
     * Probando el método push.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int item = 1;
        StackList<Integer> instance = new StackList<Integer>(1);
        instance.push(item);
        System.out.println(instance.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método pop.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackList<Integer> instance = new StackList<Integer>(1);
        int expResult = 1;
        instance.push(expResult);
        int result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método peek.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackList<Integer> instance = new StackList<Integer>(1);
        int expResult = 3;
        instance.push(expResult);
        int result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método size.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackList<Integer> instance = new StackList<Integer>(1);
        int expResult = 2;
        instance.push(2);
        instance.push(3);
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método empty.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackList<Integer> instance = new StackList<Integer>(1);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

