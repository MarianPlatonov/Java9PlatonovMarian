/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Marian Platonov
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car();
        String expResult = "Default";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car();
        Car.Color expResult = null;
        Car.Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car();
        int expResult = 90;
        int result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "Default";
        Car instance = new Car();
        instance.setName(newName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Car.Color newColor = null;
        Car instance = new Car();
        instance.setColor(newColor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        int newSpeed = 0;
        Car instance = new Car();
        instance.setSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSalePrice method, of class Car.
     */
    @Test
    public void testSetSalePrice() {
        System.out.println("setSalePrice");
        int newSalePrice = 0;
        Car instance = new Car();
        instance.setSalePrice(newSalePrice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDailyRentPrice method, of class Car.
     */
    @Test
    public void testSetDailyRentPrice() {
        System.out.println("setDailyRentPrice");
        int newDailyRentPrice = 0;
        Car instance = new Car();
        instance.setDailyRentPrice(newDailyRentPrice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        int newSpeed = 0;
        Car instance = new Car();
        instance.increaseSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        int newSpeed = 0;
        Car instance = new Car();
        instance.decreaseSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyRentPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentPrice() {
        System.out.println("getDailyRentPrice");
        Car instance = new Car();
        instance.setDailyRentPrice(250);
        int expResult = 250;
        int result = instance.getDailyRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
