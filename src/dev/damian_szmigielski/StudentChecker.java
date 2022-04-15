package dev.damian_szmigielski;

public class StudentChecker {
    public static void main (String[] args){

        Task5Student adam = new Task5Student();
        adam.imie = "Adam";
        adam.nazwisko = "Adamczyk";
        adam.nick = "Adamo123";
        adam.email = "AAdamczyk@gmail.com";
        adam.wiek = 22;


        Task5Student mariusz = new Task5Student();
        mariusz.imie = "Mariusz";
        mariusz.nazwisko = "Mariuszewski";
        mariusz.nick = "Mario321";
        mariusz.email = "mariuszewski98@op.pl";
        mariusz.wiek = 24;

        Task5Student ania = new Task5Student();
        ania.imie = "Ania";
        ania.nazwisko = "Kowalska";
        ania.nick = "Aneczka11oneone";
        ania.email = "tester@wp.pl";
        ania.wiek = 25;

        //Tworzymy tablice, ktora zawiera 3 studentow
        Task5Student[] students = new Task5Student[3];
        students[0] = adam;
        students[1] = mariusz;
        students[2] = ania;

        //przechodzimy po wszystkich elementach w tablicy
        for (int i=0; i<students.length; i++){
            students[i].przedstawSie();
            students[i].zalogujSie();
            students[i].stworzMaila();
            students[i].ileLat();
        }

//Poniżej jest to samo co w iteracji powyżej!

//        adam.przedstawSie();
//        adam.zalogujSie();
//        adam.stworzMaila();
//        adam.ileLat();
//
//        mariusz.przedstawSie();
//        mariusz.zalogujSie();
//        mariusz.stworzMaila();
//        mariusz.ileLat();
//
//        ania.przedstawSie();
//        ania.zalogujSie();
//        ania.stworzMaila();
//        ania.ileLat();

    }
}
