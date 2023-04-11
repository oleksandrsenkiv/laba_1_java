package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GasLampTest {
    GasLamp gasLamp = new GasLamp();

    @Test
    public void turnOffTest() {
        gasLamp.turnOff();
        assertTrue(gasLamp.getIsBurning() == false);
    }

    @Test
    public void turnOnTest() {
        gasLamp.turnOn();
        assertTrue(gasLamp.getIsBurning() == true);
    }

}