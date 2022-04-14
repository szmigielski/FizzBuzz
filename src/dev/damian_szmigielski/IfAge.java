package dev.damian_szmigielski;

import java.util.Scanner;

public class IfAge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoj wiek: ");

        Integer age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("Nie jestes pelnoletni");
        }
    }
}
