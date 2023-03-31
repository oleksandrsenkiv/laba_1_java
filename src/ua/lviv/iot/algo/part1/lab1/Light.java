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
@ToString
public abstract class Light {
    String producer = "Unknown";
    int workTimeInHours;
    int heightInMm;
    public void turnOn(){}
    public void turnOff(){}
}
