package dev.damian_szmigielski;


//klasa piłkarz rozszerza klasę PersonBaseClass
public class Study2Footballer extends Study2PersonBaseClass {

    public String footballClub;

    //konstruktor, zaznaczam klase PersonBaseClass -> constructor matching super
    public Study2Footballer(String name, int age, String footballClub) {
        //super - wywoła konstruktor klasy nadrzędnej
        super(name, age);
        this.footballClub = footballClub;
    }

    //metoda nadpisuje metode z klasy Person
    public void eat(){
        System.out.println("I like healthly food!");
    }

    public void footballClub(){
        System.out.println("Klub pilkarski to " + footballClub);
    }
}
