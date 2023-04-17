package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public final class PenManager {
    private List<Light> lightnings;

    public void addLighting(Light lightning) {

        this.lightnings.add(lightning);
    }

    public List<Light> findLightningWithWorkTimeMoreThan(int workTimeInHours) {
        return lightnings.stream().
                filter(lightnings -> lightnings.
                        getWorkTimeInHours() > workTimeInHours).
                collect(Collectors.toList());
    }

    public List<Light> findLightningWithHeightInMmMoreThan(int heightInMm) {
        return lightnings.stream().
                filter(lightnings -> lightnings.
                        getHeightInMm() > heightInMm).
                collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String csvLightningsFile = "src/main/resources/csvLightningsFile.csv";
        List<Light> lightnings = new LinkedList<>();
        LightningsWriter lightningsWriter = new LightningsWriter();
        lightnings.add(new DeskLamp("Accento lightning", 20, 300, false, 6, "Yellow"));
        lightnings.add(new DeskLamp("Brilloner", 24, 280, true, 2, "Blue"));
        lightnings.add(new Candle(100, 12, "Sinsay", true, "Round"));
        lightnings.add(new Candle(200, 50, "Yusk", true, "Square"));
        lightnings.add(new Flashlight("Xiaomi",150, 110,  true, 25));
        lightnings.add(new Flashlight("RZTK",10, 250,  false, 100));
        lightnings.add(new GasLamp(300, 15, "Kovea", true, 2));
        lightnings.add(new GasLamp(215, 12, "WALKING", false, 1));
        lightningsWriter.writeToFile(lightnings, csvLightningsFile);
        System.out.println(lightningsWriter.getClass());

    }
}
