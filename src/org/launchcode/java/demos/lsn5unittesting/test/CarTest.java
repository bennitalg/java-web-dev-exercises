package org.launchcode.java.demos.lsn5unittesting.test;

import jdk.jfr.StackTrace;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)

    //TODO: constructor sets gasTankLevel properly

    //TODO: gasTankLevel is accurate after driving within tank range
    Car test_car;
    @Before
    public void initCar(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void drive(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void moreThanFuel(){
        test_car.drive(501);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}
