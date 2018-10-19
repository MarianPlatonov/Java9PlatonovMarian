/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marian Platonov
 */
public class CarcasaTest {
    
    public CarcasaTest() {
    }

    /**
     * Test of getEcran method, of class Carcasa.
     */
    @Test
    public void testGetEcran() {
        System.out.println("getEcran");
        Carcasa instance = new Carcasa();
        Ecran expResult = null;
        Ecran result = instance.getEcran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlu method, of class Carcasa.
     */
    @Test
    public void testGetAlu() {
        System.out.println("getAlu");
        Carcasa instance = new Carcasa();
        Alu expResult = null;
        Alu result = instance.getAlu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simteButoane method, of class Carcasa.
     */
    @Test
    public void testSimteButoane() {
        System.out.println("simteButoane");
        Carcasa instance = new Carcasa();
        instance.simteButoane();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
