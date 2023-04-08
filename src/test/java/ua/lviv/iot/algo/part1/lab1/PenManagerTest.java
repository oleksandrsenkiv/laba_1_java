package ua.lviv.iot.algo.part1.lab1;
import ua.lviv.iot.algo.part1.lab1.PenManager;
import ua.lviv.iot.algo.part1.lab1.DeskLamp;
import ua.lviv.iot.algo.part1.lab1.Candle;
import ua.lviv.iot.algo.part1.lab1.Light;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.List;
public class PenManagerTest  {


    @Test
    public void addLightningTest(){
         PenManager penManager = new PenManager();
        DeskLamp deskLamp = new DeskLamp(200,60,"LG",false,7,"white");
        penManager.addLighting(deskLamp);
        penManager.addLighting(new DeskLamp(300, 20, "Accento lightning", false, 6, "Yellow"));
        penManager.addLighting(new DeskLamp(280, 24, "Brilloner", true, 2, "Blue"));
        penManager.addLighting(new Candle(100, 12, "Sinsay", true, "Round"));
        penManager.addLighting(new Candle(200, 50, "Yusk", true, "Square"));
        assertEquals(5,penManager.getLightnings().size());
    }

    @Test
    public void testFindLightningWithWorkTimeMoreThan(){
        PenManager penManager = new PenManager();
        List<Light> lightnings = Arrays.asList(
                new DeskLamp(300, 20, "Accento lightning", false, 6, "Yellow"),
                new DeskLamp(280, 24, "Brilloner", true, 2, "Blue"),
                new Candle(100, 12, "Sinsay", true, "Round"),
                new Candle(200, 50, "Yusk", true, "Square"));
        penManager.setLightnings(lightnings);
        final int workTimeInHours = 25;
        List<Light> resultList = penManager.findLightningWithWorkTimeMoreThan(workTimeInHours);
        assertEquals(1,resultList.size());
    }
    @Test
    public void testFindLightningWithHeightInMmMoreThan(){
        PenManager penManager = new PenManager();
        List<Light> lightnings = Arrays.asList(
        new DeskLamp(300, 20, "Accento lightning", false, 6, "Yellow"),
        new DeskLamp(280, 24, "Brilloner", true, 2, "Blue"),
        new Candle(100, 12, "Sinsay", true, "Round"),
        new Candle(200, 50, "Yusk", true, "Square"));
        penManager.setLightnings(lightnings);
        final int heightInMm = 290;
        List<Light> resultList = penManager.findLightningWithHeightInMmMoreThan(heightInMm);
        assertEquals(1,resultList.size());
    }

}