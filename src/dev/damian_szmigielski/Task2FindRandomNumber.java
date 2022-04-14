package dev.damian_szmigielski;

import java.util.Random;
import java.util.Scanner;

public class Task2FindRandomNumber {

    public static void main(String[] args) {
        Random number = new Random();
        int numberToGuess = number.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        boolean wasNumberGuessed = false;
        //na początku liczba nie jest odgadnięta

        while (!wasNumberGuessed){
        //dopóki liczba nie jest odgadnięta
            System.out.println("Podaj liczbe: ");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess){
                System.out.println("Liczba jest za mala!");
            } else if (userNumber > numberToGuess){
                System.out.println("Liczba jest za duza!");
            } else {
                System.out.println("Brawo, to jest wlasciwa liczba");
                wasNumberGuessed = true;
            }

        }
    }
}