package dev.damian_szmigielski;

import java.sql.PreparedStatement;

public class Task6CalulatorWithMethods {

    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("Wynik dodawania liczb: " + result);
        return result;

    }

    public int sub(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        System.out.println("Wynik odejmowania liczb " + result);
        return result;
    }

    public int mul(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        System.out.println("Wynik mnozenia liczb " + result);
        return result;
    }

    public int div(int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        System.out.println("Wynik dzielenia liczb: " + result);
        return result;
    }

    public int mod(int firstNumber, int secondNumber){
        int result = firstNumber % secondNumber;
        System.out.println("Reszta dzielenia liczb: " + result);
        return result;
    }


}
