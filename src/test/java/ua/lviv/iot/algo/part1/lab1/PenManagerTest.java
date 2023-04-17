package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class PenManagerTest {
    private PenManager penManager1;

    @BeforeEach
    public void setUp() {
        penManager1 = new PenManager();
        List<Light> lightnings = new ArrayList<>();
        lightnings.add(new DeskLamp(300, 20, "Accento lightning", false, 6, "Yellow"));
        lightnings.add(new DeskLamp(280, 24, "Brilloner", true, 2, "Blue"));
        lightnings.add(new Candle(100, 12, "Sinsay", true, "Round"));
        lightnings.add(new Candle(200, 50, "Yusk", true, "Square"));
        penManager1.setLightnings(lightnings);
    }

    @Test
    public void addLightningTest() {
        penManager1.addLighting(new DeskLamp(300, 20, "Accento lightning", false, 6, "Yellow"));
        assertEquals(5, penManager1.getLightnings().size());
    }

    @Test
    public void testFindLightningWithWorkTimeMoreThan() {
        boolean value = true;
        final int workTimeInHours = 25;
        List<Light> resultList = penManager1.findLightningWithWorkTimeMoreThan(workTimeInHours);
        for (Light result : resultList) {
            value = value && result.getWorkTimeInHours() > workTimeInHours;
        }
        assertTrue(value == true);
    }

    @Test
    public void testFindLightningWithHeightInMmMoreThan() {
        boolean value = true;
        final int heightInMm = 290;
        List<Light> resultList = penManager1.findLightningWithHeightInMmMoreThan(heightInMm);
        for (Light result : resultList) {
             value = value && result.getHeightInMm() > heightInMm;
        }
        assertTrue(value == true);
    }

}