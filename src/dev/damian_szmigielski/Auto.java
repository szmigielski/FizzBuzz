package dev.damian_szmigielski;

public class Auto {

    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;

    //metoda
    public void jedz() {
        System.out.println("Jade!");
    }


    //metoda
    public void hamuj() {
        System.out.println("Hamuj!");
    }


    //metoda
    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}
