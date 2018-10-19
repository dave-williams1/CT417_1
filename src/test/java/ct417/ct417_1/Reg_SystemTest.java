/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417.ct417_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David Williams
 */
public class Reg_SystemTest {
    
    public Reg_SystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Reg_System reg = new Reg_System();
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
     * Test of main method, of class Reg_System.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Reg_System.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
