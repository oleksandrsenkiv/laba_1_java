package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@Getter
@ToString
public class GasLamp extends Light {
    private boolean isBurning = false;
    private int gasConsumption;
    public static final String HEADERS = "isBurning,gasConsumption";

    public GasLamp(int heightInMm, int workTimeInHours, String producer,
                   boolean isBurning, int gasConsumption) {
        super(producer, workTimeInHours, heightInMm);
        this.isBurning = isBurning;
        this.gasConsumption = gasConsumption;
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
        return super.toCSV() + "," + getIsBurning() + "," + getGasConsumption();
    }
}