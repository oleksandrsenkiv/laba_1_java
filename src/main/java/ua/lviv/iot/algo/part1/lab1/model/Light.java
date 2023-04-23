package ua.lviv.iot.algo.part1.lab1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
public abstract class Light {
    protected String producer;
    protected int workTimeInHours;
    protected int heightInMm;
    public static final String HEADERS = "producer,workTimeInHours,heightInMm";

    protected abstract void turnOn();

    protected abstract void turnOff();

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return getProducer() + ","
                + getWorkTimeInHours() + "," + getHeightInMm();
    }
}
