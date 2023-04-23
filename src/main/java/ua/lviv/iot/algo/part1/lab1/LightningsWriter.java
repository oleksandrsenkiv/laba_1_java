package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.model.Light;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public final class LightningsWriter {

    public String writeToFile(final List<Light> lightnings,
                              final String fileName) {
        if (lightnings == null || lightnings.isEmpty()) {
            return null;
        }
        try (Writer writer = new PrintWriter(fileName, StandardCharsets.UTF_8)) {
            Collections.sort(lightnings, new ClassComparator());
            Light previousLightning = null;

            for (Light lightning : lightnings) {

                if (previousLightning == null) {
                    writer.write(lightning.getHeaders() + "\n");
                    previousLightning = lightning;

                } else if (previousLightning.getClass() != lightning.getClass()) {
                    writer.write("\n" + lightning.getHeaders() + "\n");
                    previousLightning = lightning;

                }
                writer.write(lightning.toCSV() + "\n");
            }

        } catch (IOException e) {
            e.fillInStackTrace();

        }
        return fileName;
    }

    static class ClassComparator implements Comparator<Light>, Serializable {
        @Override
        public int compare(final Light light1, final Light light2) {
            return light1.getClass()
                          .getSimpleName()
                          .compareTo(light2.getClass().getSimpleName());

        }

    }

}
