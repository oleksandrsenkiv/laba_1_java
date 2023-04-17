package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class LightningsWriter {



    public String writeToFile(List<Light> lightnings, String fileName) {
        if (lightnings == null || lightnings.isEmpty()) {
            return null;
        }
        try (FileWriter writer = new FileWriter(fileName)) {
            Collections.sort(lightnings, new ClassComparator());
            Light previousLightning = null;
            for (Light lightning : lightnings) {
                if (previousLightning == null) {
                    writer.write(lightning.getHeaders());
                    writer.write("\r\n");
                    previousLightning = lightning;
                } else {
                    if (previousLightning.getClass().getSimpleName() != lightning.getClass().getSimpleName()) {
                        writer.write(lightning.getHeaders());
                        writer.write("\r\n");
                        previousLightning = lightning;
                    }
                }
                writer.write(lightning.toCSV());
                writer.write("\r\n");
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }

        return fileName;
    }

    class ClassComparator implements Comparator<Light> {
        @Override
        public int compare(Light light1, Light light2) {
            return light1.getClass().getSimpleName().compareTo(light2.getClass().getSimpleName());
        }

    }

}
