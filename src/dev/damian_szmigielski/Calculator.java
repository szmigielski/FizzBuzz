package dev.damian_szmigielski;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        //program, ktory prosi o 2 liczby i wykona na nich podstawoe operacje matematyczne
        System.out.println("Podaj pierwsza liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj druga liczbe: ");
        Scanner scanner1 = new Scanner(System.in);
        int secondNumber = scanner1.nextInt();

        int addition = firstNumber +  secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("Wykonam teraz obliczenia matematyczne...");
        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + substraction);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
    }
}
