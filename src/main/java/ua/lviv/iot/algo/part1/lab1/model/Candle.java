package ua.lviv.iot.algo.part1.lab1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public final class Candle extends Light {
    private boolean isBurning = false;
    private String form;
    public static final String HEADERS = "isBurning,form";

    public Candle(final int heightInMm, final int workTimeInHours,
                  final String producer,
                  final boolean isBurning,
                  final String form) {
        super(producer, workTimeInHours, heightInMm);
        this.isBurning = isBurning;
        this.heightInMm = heightInMm;
        this.form = form;

    }

    @Override
    public void turnOn() {
        isBurning = true;
    }

    @Override
    public void turnOff() {
        isBurning = false;
    }

    public boolean getIsBurning() {
        return isBurning;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + "," + getIsBurning() + "," + getForm();
    }
}
