package dev.damian_szmigielski;

public class AutoTest {
    public static void main (String[] args){

        //deklarujemy zmienna typu Auto<- nazwa naszej klasy
        //mercedes <- nazwa zmiennej
        //obiekt klasy Auto, musi być new + nazwa klasy + ()
        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rokProdukcji = 2021;
        mercedes.przebieg = 1000;

        //sprawdzanie metody! ctrl i klikamy na metode, przekierowywuje nas do kod, by wrócić ctrl + tab
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto hyundai = new Auto();
        hyundai.marka = "Hyundai";
        hyundai.model = "i30";
        hyundai.rokProdukcji = 2022;
        hyundai.przebieg = 0;

        hyundai.info();
    }
}


