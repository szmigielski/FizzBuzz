package dev.damian_szmigielski;

public class ForWhile {
    public static void main(String[] args){
        //początkowy stan pętli, początkowy stan licznika, warunek
        for (int i = 0; i < 10; i ++){
            System.out.println(i);
        }

        int a = 1;
        while (a <= 10){
            System.out.println("Liczba wynosi: " + a);
            a++;
        }

        boolean isSkyBlue = false;

        do {
            System.out.println("Niebo jest niebieskie");
        }
        while (isSkyBlue);{
        }
    }
}
