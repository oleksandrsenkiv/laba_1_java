package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class FlashlightTest  {
    @Test
    public void turnOnTest(){
        Flashlight flashlight1 = new Flashlight();
        Flashlight flashlight2 = new Flashlight();
        flashlight1.setOn(true);
        flashlight2.turnOn();
        assertEquals(flashlight1.toString(),flashlight2.toString());
    }
    @Test
    public void turnOffTest(){
        Flashlight flashlight1 = new Flashlight();
        Flashlight flashlight2 = new Flashlight();
        flashlight1.setOn(false);
        flashlight2.turnOff();
        assertEquals(flashlight1.toString(),flashlight2.toString());
    }

}