package ua.lviv.iot.algo.part1.lab1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public final class DeskLamp extends Light {
    private boolean isOn = false;
    private static final int DEFAULT_BRIGHTNESS = 5;
    private int brightness = DEFAULT_BRIGHTNESS;
    private String color = "White";
    private static final int MAX_BRIGHTNESS = 10;
    public static final String HEADERS = "isOn,brightness,color";

    public DeskLamp(final String producer, final int heightInMm,
                    final int workTimeInHours,
                    final boolean isOn,
                    final int brightness,
                    final String color) {
        super(producer, workTimeInHours, heightInMm);
        this.isOn = isOn;
        this.color = color;
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public void setBrightness(final int brightness) {
        if (brightness <= MAX_BRIGHTNESS) {
            this.brightness = brightness;
        }
    }

    public boolean getIsOn() {
        return isOn;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + "," + getIsOn() + ","
                + getBrightness() + "," + getColor();
    }
}
