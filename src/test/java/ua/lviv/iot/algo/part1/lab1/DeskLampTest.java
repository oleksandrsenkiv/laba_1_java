package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeskLampTest {
    private DeskLamp deskLamp = new DeskLamp();

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
}