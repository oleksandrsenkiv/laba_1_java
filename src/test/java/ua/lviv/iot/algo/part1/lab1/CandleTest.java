package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CandleTest {
    private Candle candle = new Candle();

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

}