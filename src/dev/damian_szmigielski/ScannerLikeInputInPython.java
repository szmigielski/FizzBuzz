package dev.damian_szmigielski;

import java.util.Scanner;

public class ScannerLikeInputInPython {
    public static void main (String [] args){
        //wpisujemy normalnie
        Scanner variable = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        // variable.nextLine() + alt enter
        String name = variable.nextLine();
        System.out.println("Czesc " +name+ " !");
    }
}
