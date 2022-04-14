package dev.damian_szmigielski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //zmienna typu scanner nazywamy ją scanner jako argument podajemy
        //System.in
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        //najpierw wpisałem scanner.nextline(); ctrl+alt+v przypisujemy wynik do zmiennej
        String name = scanner.nextLine();

        //wyświetlamy
        System.out.println("Czesc " + name);
        //instrukcja if else if else
        if (!name.isEmpty() && (!name.endsWith("a") || name.equals("barnaba"))) {
            System.out.println("jestes mezczyzna");
        } else if (!name.isEmpty() && name.endsWith("a")){
                System.out.println("Jestes kobieta");
        } else {
            System.out.println("imie nie moze byc puste");
        }




    }
}
