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
    private int gasConsumptionInLitersPerHour;
    public GasLamp(int heightInMm,int workTimeInHours, String producer, boolean isBurning, int gasСonsumptionInLitersPerHour){
        super(producer, workTimeInHours,heightInMm);
        this.isBurning = isBurning;
        this.gasConsumptionInLitersPerHour = gasСonsumptionInLitersPerHour;
    }
    @Override
    public void turnOn(){
        isBurning = true;
    }
    @Override
    public void turnOff(){
        isBurning = false;
    }
}