package ua.lviv.iot.algo.part1.lab1;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public class Candle extends Light{
   private boolean isBurning = false;
    private String form;
    public  Candle(int heightInMm,int workTimeInHours,String  producer,boolean isBurning, String form){
        super(producer,workTimeInHours,heightInMm);
        this.isBurning = isBurning;
        this.heightInMm = heightInMm;
        this.form = form;

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
