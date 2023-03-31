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
public class Candle extends Light{
    boolean isBurning = false;
    String form;
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
