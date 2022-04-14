package dev.damian_szmigielski;


import java.util.Set;

public class HashSet {
    public static void main(String[] args){
        Set<String> meals = new java.util.HashSet<>();
        meals.add("Pizza");
        meals.add("Burger");
        meals.add("Pizza");
        meals.add("Salad");

        for (String meal : meals) {
            System.out.println(meal);

        }
        // w Set nie możliwe są duplikaty
    }
}
