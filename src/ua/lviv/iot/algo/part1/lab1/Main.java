package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter

class Trolleybus{
    private int id = 100;
    private int routeNumber;
    private String currentStop;
    private int maxSpeed;
    private int currentSpeed;
    private int capacity;
    private int passengers;

    static Trolleybus instance = new Trolleybus();
    public static Trolleybus getInstance(){
return instance;
    }
    public String toString(){
        return "id: " + id + " routeNumber: " + routeNumber
                + " currentStop: " + currentStop + " km/h " + " maxSpeed: "
                + maxSpeed + " km/h " + " capacity: " + capacity
                + " passengers: " + passengers;
    }
public void stop(){
         currentSpeed = 0;
}
public void start(){
        if(maxSpeed>=20) {
            currentSpeed = 20;
        }
}
public void addPassenger(){
 if(passengers<capacity){
     passengers++;
 }
 else {
     System.out.println("The trolleybus is already full");
 }
}
}
class Main {
    public static void main(String [] args){
        Trolleybus tr1 = new Trolleybus();
        Trolleybus tr2 = new Trolleybus(121, 22, "Stepan Bandera street", 80, 40, 40, 30);
        Trolleybus tr3 = Trolleybus.getInstance();
        Trolleybus tr4 = Trolleybus.getInstance();
        Trolleybus [] trolleybuses = {tr1, tr2, tr3, tr4};
        tr2.stop();
        tr2.start();
        tr2.addPassenger();
        int size = trolleybuses.length;
        while(size>0){
            System.out.println(trolleybuses[size - 1]);
            size--;
        }

    }
}