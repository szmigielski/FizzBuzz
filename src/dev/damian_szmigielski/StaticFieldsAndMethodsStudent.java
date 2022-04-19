package dev.damian_szmigielski;

public class StaticFieldsAndMethodsStudent {
    //pola statyczne korzystaja ze specjalnego modyfikatora static
    //pola statyczne w klasie beda odnosily sie do samej klasy a nie do obiektu danej klasy

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    //pole statyczne
    public static String nazwaUczelni = "UE";

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to UE");
    }

}
