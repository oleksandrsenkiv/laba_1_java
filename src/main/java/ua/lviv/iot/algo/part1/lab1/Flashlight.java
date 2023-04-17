package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor

@Getter
@ToString(callSuper = true)
public class Flashlight extends Light {
    private boolean isOn = false;
    private int illuminationRangeInMeters;
public static final String HEADERS = "isOn,illuminationRangeInMeters";
    public Flashlight(String producer,int workTimeInHours, int heightInMm,
                      boolean isOn, int illuminationRangeInMeters) {
        super(producer, workTimeInHours, heightInMm);
        this.isOn = isOn;
        this.illuminationRangeInMeters = illuminationRangeInMeters;
        this.workTimeInHours = workTimeInHours;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + "," + getIsOn() + "," + getIlluminationRangeInMeters();
    }
}
