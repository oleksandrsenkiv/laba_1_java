package ua.lviv.iot.algo.part1.lab1;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeskLampTest  {
@Test
    public void turnOnTest(){
    DeskLamp deskLamp1 = new DeskLamp();
    DeskLamp deskLamp2 = new DeskLamp();
    deskLamp2.setOn(true);
    deskLamp1.turnOn();
    assertEquals(deskLamp1.toString(),deskLamp2.toString());
}
    @Test
    public void turnOffTest(){
        DeskLamp deskLamp1 = new DeskLamp();
        DeskLamp deskLamp2 = new DeskLamp();
        deskLamp2.setOn(false);
        deskLamp1.turnOff();
        assertEquals(deskLamp1.toString(),deskLamp2.toString());
    }
    @Test
    public void setBrightnessTest(){
    DeskLamp deskLamp = new DeskLamp();
    deskLamp.setBrightness(6);
    assertEquals(6,deskLamp.getBrightness());
    }
}