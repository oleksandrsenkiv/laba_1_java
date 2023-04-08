package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CandleTest {
    @Test
    public void turnOnTest(){
        Candle candle1 = new Candle();
        Candle candle2 = new Candle();
        candle1.setBurning(true);
        candle2.turnOn();
        assertEquals(candle1.toString(),candle2.toString());
    }
    @Test
    public void turnOffTest(){
        Candle candle1 = new Candle();
        Candle candle2 = new Candle();
        candle1.setBurning(false);
        candle2.turnOff();
        assertEquals(candle1.toString(),candle2.toString());
    }

}