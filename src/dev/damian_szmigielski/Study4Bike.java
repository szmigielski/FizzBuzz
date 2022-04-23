package dev.damian_szmigielski;
//implementacja interfejsu dla klasy
public class Study4Bike implements Study4VehicleInterface{

    @Override
    public void jazda(int speed) {
        System.out.println("Jade rowerem z predkoscia: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem!");
    }

}
