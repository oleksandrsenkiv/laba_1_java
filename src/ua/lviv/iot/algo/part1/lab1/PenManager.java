package ua.lviv.iot.algo.part1.lab1;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

class PenManager {
    private final List<Light> lightnings = new LinkedList<>();
    public void addLighting(Light pen){

        this.lightnings.add(pen);
    }
public List<Light> findLightningWithWorkTimeMoreThan(int workTimeInHours){
        return lightnings.stream().
                filter(lightnings -> lightnings.getWorkTimeInHours() > workTimeInHours).
                collect(Collectors.toList());
}
public List<Light> findLightningWithHeightInMmMoreThan(int heightInMm)
{
    return lightnings.stream().filter(lightnings -> lightnings.getHeightInMm() > heightInMm).collect(Collectors.toList());
}
    public static void main(String [] args){
PenManager PenManager = new PenManager();
PenManager.addLighting(new DeskLamp(300,20,"Accento lightning", false, 6,"Yellow"));
PenManager.addLighting(new DeskLamp(280,24,"Brilloner", true, 2, "Blue"));
PenManager.addLighting(new Candle(100,12,"Sinsay",true, "Round"));
PenManager.addLighting(new Candle(200,50,"Yusk",true,"Square"));
PenManager.addLighting(new Flashlight(110,150,"Xiaomi",true, 25));
PenManager.addLighting(new Flashlight(250,10,"RZTK",false, 100));
PenManager.addLighting(new GasLamp(300,15,"Kovea", true,2));
PenManager.addLighting(new GasLamp(215,12,"WALKING", false,1));

        for (Light lightnings : PenManager.lightnings) {
            System.out.println(lightnings );
        }
        System.out.println("__________________________________________________________"+"\n");
        var lightningWithWorkTimeMoreThan = PenManager.findLightningWithWorkTimeMoreThan(20);
        for (Light lightning:lightningWithWorkTimeMoreThan) {
            System.out.println(lightning);
        }
        System.out.println("__________________________________________________________"+"\n");
        var lightningWithHeightInMmMoreThan = PenManager.findLightningWithHeightInMmMoreThan(190);
        for (Light lightning:lightningWithHeightInMmMoreThan) {
            System.out.println(lightning);
        }
    }

}