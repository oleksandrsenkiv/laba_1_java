package ua.lviv.iot.algo.part1.lab1;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(callSuper = true)
public class GasLamp extends Light {
   private boolean isBurning = false;
   private int gasСonsumptionInLitersPerHour;
   public GasLamp(int heightInMm,int workTimeInHours, String producer, boolean isBurning, int gasСonsumptionInLitersPerHour){
       super(producer, workTimeInHours,heightInMm);
       this.isBurning = isBurning;
       this.gasСonsumptionInLitersPerHour = gasСonsumptionInLitersPerHour;
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
