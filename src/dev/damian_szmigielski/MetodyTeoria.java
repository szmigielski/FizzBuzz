package dev.damian_szmigielski;


public class MetodyTeoria {
    //public - definiujemy metode, korzystamy z identyfikatora dostepu
    //void - podajemy zwracany typ danych int/string/Task5Student/ void oznacza, ze nie zwraca zadnej wartosci
    //nazwa metody - z malej litery
    //lekcja 81/82
    public int pobierzWynik(){
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i < 100; i++){
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        return result;
    }

    //lekcja 83 parametry metod
    public int policzWynikParam(int number){
        System.out.println("Number ma wartosc: " + number);
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i < number; i++){
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        return result;
    }
    //83 parametry
    public void add(int firstNumber, int secondNumber ) {
        System.out.println("Suma to: " + (firstNumber + secondNumber));
    }
}
