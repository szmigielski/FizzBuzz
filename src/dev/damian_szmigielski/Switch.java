package dev.damian_szmigielski;

public class Switch {
    public static void main(String[] args){
        String meal = "Pizza";

        switch (meal){
            case "Pizza":
                System.out.println("Cena wynosi 30zl");
                break;
            case "Losos":
                System.out.println("Cena wynosi 35zl");
                break;
            case "Frytki":
                System.out.println("Cena to 10zl");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie");
        }
    }
}
