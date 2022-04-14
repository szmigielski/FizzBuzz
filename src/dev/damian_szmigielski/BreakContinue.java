package dev.damian_szmigielski;

public class BreakContinue {

    public static void main(String[] args){
        for (int i = 0; i <10; i++){
            System.out.println(i);
            if (i == 4){
                System.out.println("Koniec petli!");
                break;
            }
        }


        for (int x =0; x <= 3; x++){
            System.out.println(x);
            if (x == 2){
                System.out.println("Petla osiagniela liczbe " + x);
                continue;
            }
        }
    }
}
