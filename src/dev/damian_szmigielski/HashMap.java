package dev.damian_szmigielski;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class HashMap {
    //HashMap struktura typu słownik (klucz-wartość)
    public static void main(String[] args) {
        Map<String, String> nameToMeal = new java.util.HashMap<>();

        nameToMeal.put("Mariusz", "Pizza");
        nameToMeal.put("Dominik", "Burger");
        nameToMeal.put("Kamil", "Burger");

        nameToMeal.put("Dominik", "Pasta");
        //ważne, druga wartość zastępuje pierwszą

        System.out.println(nameToMeal.get("Dominik"));

        Set<String> keys = nameToMeal.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        //wyświetlanie kluczy

        Collection<String> values = nameToMeal.values();
        for (String value: values) {
            System.out.println(value);
        }
        //ważne, nie set ale collection! pokazanie wartości kluczy
    }
}
