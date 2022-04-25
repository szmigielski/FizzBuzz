package exceptions;

import java.util.Scanner;

public class ExceptionCheck {
    public static void main(String[] args) throws InvalidAgeException{
        System.out.println("Podaj swoj wiek:");
        Scanner scanner = new Scanner(System.in);
        int personAge = scanner.nextInt();

        if (personAge<0){
            throw new InvalidAgeException("your age is not valid.");
        }
        if (personAge>18){
            System.out.println("Jestes pelnoletni.");
        } else {
            System.out.println("Nie jestes pelnoletni");
        }
    }
}
