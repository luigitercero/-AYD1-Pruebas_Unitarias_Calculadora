/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luigitercero
 */
public class OperacionTest {
    
    public OperacionTest() {
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
     * Test of suma method, of class Operacion.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 1;
        int b = 1;
        Operacion instance = new Operacion();
        int expResult = 6;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of resta method, of class Operacion.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 1;
        int b = 1;
        Operacion instance = new Operacion();
        int expResult = 0;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of multiplicar method, of class Operacion.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 1;
        int b = 1;
        Operacion instance = new Operacion();
        int expResult = 1;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of dividir method, of class Operacion.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 1;
        int b = 1;
        Operacion instance = new Operacion();
        int expResult = 1;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
