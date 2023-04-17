package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FlashlightTest {
    private Flashlight flashlight = new Flashlight();

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

}