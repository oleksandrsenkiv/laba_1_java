package ua.lviv.iot.algo.part1.lab1.model;

import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.model.DeskLamp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeskLampTest {
    private DeskLamp deskLamp = new DeskLamp();
    private DeskLamp deskLamp1 = new DeskLamp("Brilloner", 280, 24, true, 2, "Blue");

    @Test
    public void turnOnTest() {
        deskLamp.turnOn();
        assertTrue(deskLamp.getIsOn() == true);

    }

    @Test
    public void turnOffTest() {
        deskLamp.turnOff();
        assertTrue(deskLamp.getIsOn() == false);

    }

    @Test
    public void setBrightnessTest() {
        deskLamp.setBrightness(6);
        assertEquals(6, deskLamp.getBrightness());
    }

    @Test
    public void testToCSV() {
        assertEquals("Brilloner,24,280,true,2,Blue", deskLamp1.toCSV());

    }

    @Test
    public void getHeaders() {
        assertEquals("producer,workTimeInHours,heightInMm,isOn,brightness,color", deskLamp1.getHeaders());

    }
}