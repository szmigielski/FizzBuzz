package dev.damian_szmigielski;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args){
        List<String> names = new java.util.ArrayList<>();
        //Tworzenie arraylist <typdanych> nazwa = new ArrayList<>(); następnie trzeba
        //zaimportować listę alt + enter i zmienia nam się druga część kodu
        names.add("Mariusz");
        names.add("Dominik");
        names.add("Blazej");

        names.remove("Mariusz");

        //System.out.println(names.contains("Dominik"));
        //System.out.println(names.contains("Kamil"));
        //contains sprawdza czy element w liscie   istnieje
        System.out.println(names.get(0));
        //wyswietlanie konkretnego elementu

        for (String name: names) {
             //weź tablicę names i dla każdego elementu tej tablicy names stwórz zmienną name typu string i wyświetl ją
            System.out.println(name);
        }


    }
}
