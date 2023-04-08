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
public class DeskLamp extends Light {
    boolean isOn = false;
    int brightness = 5;
    String color = "White";
    public  DeskLamp(int heightInMm,int workTimeInHours,String producer,boolean isOn, int brightness, String color){
        super(producer,workTimeInHours,heightInMm);
        this.isOn = isOn;
        this.color = color;
        this.brightness = brightness;
    }
@Override
    public void turnOn(){
        isOn = true;
    }
    @Override
    public void turnOff(){
        isOn = false;
    }
   public void setBrightness(int value){
        if(value<=10)
        {
            value = brightness;
        }
   }
   public void setColor(String color){
        this.color = color;
   }
}

