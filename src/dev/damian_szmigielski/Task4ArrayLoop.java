package dev.damian_szmigielski;

public class Task4ArrayLoop {
    public static void main (String[] args){


//        for (int number = 1; number < 100; number++){
//            if (number % 3 == 0){
//                System.out.println( number + " Liczba podzielna przez 3" );
//            }
//        }
        int[] numbers = new int[] {1,3,5,7,0};
        for (int number=0; number<(numbers.length/2);number++){
            //zmienna tymczasowa temp
            int temp = numbers[number]; // dla number = 0 1
            numbers[number] = numbers[numbers.length-1-number] ; // 4-> 0
            numbers[numbers.length-1-number] = temp; // 1
        }

        for (int number=0; number < numbers.length; number++){
            System.out.println(numbers[number]);
        }
    }
}
