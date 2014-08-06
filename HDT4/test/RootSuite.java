/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Alejo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({singlyLinkedListTest.class, StackFactoryTest.class, singletonExceptionTest.class, StackArrayListTest.class, CircularListTest.class, StackVectorTest.class, DoublyLinkedNodeTest.class, listTest.class, ListFactoryTest.class, StackTest.class, abstractStackTest.class, abstractListTest.class, NodeTest.class, CalculadoraTest.class, StackListTest.class, DoublyLinkedListTest.class})
public class RootSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
