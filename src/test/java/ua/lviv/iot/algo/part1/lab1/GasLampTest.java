package ua.lviv.iot.algo.part1.lab1;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class GasLampTest {
    @Test
    public void turnOffTest(){
        GasLamp gasLamp1 = new GasLamp();
        GasLamp gasLamp2 = new GasLamp();
        gasLamp1.setBurning(false);
        gasLamp2.turnOff();
        assertEquals(gasLamp1.toString(),gasLamp2.toString());
    }
    @Test
    public void turnOnTest(){
        GasLamp gasLamp1 = new GasLamp();
        GasLamp gasLamp2 = new GasLamp();
        gasLamp1.setBurning(true);
        gasLamp2.turnOn();
        assertEquals(gasLamp1.toString(),gasLamp2.toString());
    }

}