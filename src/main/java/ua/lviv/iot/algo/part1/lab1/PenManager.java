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
    private List<Light> lightnings = new LinkedList<>();

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
}
