package ua.lviv.iot.algo.part1.lab1.model;

import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.model.Flashlight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlashlightTest {
    private Flashlight flashlight = new Flashlight();
    private Flashlight flashlight1 = new Flashlight("Xiaomi", 150, 110, true, 25);

    @Test
    public void turnOnTest() {
        flashlight.turnOn();
        assertTrue(flashlight.getIsOn() == true);
    }

    @Test
    public void turnOffTest() {
        flashlight.turnOff();
        assertTrue(flashlight.getIsOn() == false);
    }

    @Test
    public void testToCSV() {
        assertEquals("Xiaomi,150,110,true,25", flashlight1.toCSV());

    }

    @Test
    public void getHeaders() {
        assertEquals("producer,workTimeInHours,heightInMm,isOn,illuminationRangeInMeters", flashlight1.getHeaders());

    }
}