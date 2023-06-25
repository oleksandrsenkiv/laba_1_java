package ua.lviv.iot.algo.part1.lab1.model;

import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.model.GasLamp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GasLampTest {
    private GasLamp gasLamp = new GasLamp();
    private GasLamp gasLamp1 = new GasLamp(215, 12, "WALKING", false, 1);

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

    @Test
    public void testToCSV() {
        assertEquals("WALKING,12,215,false,1", gasLamp1.toCSV());

    }

    @Test
    public void testGetHeaders() {
        assertEquals("producer,workTimeInHours,heightInMm,isBurning,gasConsumption", gasLamp1.getHeaders());

    }

}