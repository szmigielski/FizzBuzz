package dev.damian_szmigielski;

public class TablicaArray {
    public static void main(String[] args) {
        String[] names = new String[4];
        // tablica [] nazwa zmiennej = słowo kluczowe new i w [] podajemy rozmiar tablicy

        names[0] = "Mariusz";
        names[1] = "Dominik";
        names[2] = "Kasia";
        names[3] = "Asia";

        for (String name : names){
            System.out.println(name);
        }
        //weź tablicę names i dla każdego elementu tej tablicy names stwórz zmienną name typu string i wyświetl ją


//        for (int i=0; i<names.length; i++){
//            System.out.println(names[i]);
//        }
    }
}
