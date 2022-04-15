package dev.damian_szmigielski;

public class Task5Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public Integer wiek;


    //metoda 1
    public void przedstawSie(){
        System.out.println("Nazywam sie: " + imie + " " + nazwisko);
    }

    //metoda 2
    public void zalogujSie(){
        System.out.println("Loguje sie za pomoca: " + nick);
    }

    //metoda 3
    public void stworzMaila() {
        System.out.println("Tworze maila: " + email);
    }

    //metoda 4
    public void ileLat(){
        System.out.println("Twoj wiek wynosi: " + wiek + " lat");
    }






}
