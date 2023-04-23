package ua.lviv.iot.algo.part1.lab1.model;

import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.model.Candle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CandleTest {
    private Candle candle = new Candle();
    private Candle candle1 = new Candle(100, 12, "Sinsay", true, "Round");

    @Test
    public void turnOnTest() {
        candle.turnOn();
        assertTrue(candle.getIsBurning() == true);
    }

    @Test
    public void turnOffTest() {
        candle.turnOff();
        assertTrue(candle.getIsBurning() == false);
    }

    @Test
    public void testToCSV() {
        assertEquals("Sinsay,12,100,true,Round", candle1.toCSV());

    }

    @Test
    public void getHeaders() {
        assertEquals("producer,workTimeInHours,heightInMm,isBurning,form", candle1.getHeaders());

    }

}