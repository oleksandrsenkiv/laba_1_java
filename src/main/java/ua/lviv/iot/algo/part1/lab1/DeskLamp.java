package ua.lviv.iot.algo.part1.lab1;

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
    private final int defaultBrightness = 5;
    private int brightness = defaultBrightness;
    private String color = "White";
    private final int maxBrightness = 10;

    public DeskLamp(int heightInMm, int workTimeInHours, String producer,
                    boolean isOn, int brightness, String color) {
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

    public void setBrightness(int brightness) {
        if (brightness <= maxBrightness) {
            this.brightness = brightness;
        }
    }

    public boolean getIsOn() {
        return isOn;
    }
}
