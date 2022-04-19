package dev.damian_szmigielski;

public class StaticFieldsAndMethodsStudentChecker {
    public static void main(String[] args){

        //klasa. i wtedy mamy dostep
        String nazwaUczelni = StaticFieldsAndMethodsStudent.nazwaUczelni;
        //metoda statyczna, mamy teraz dostep do tej metody
        StaticFieldsAndMethodsStudent.infoUczelnia();

        StaticFieldsAndMethodsStudent adam = new StaticFieldsAndMethodsStudent();
        adam.imie = "Adam";
        adam.nazwisko = "Adamowicz";
        adam.numerIndeksu = 100222;
        adam.email = "adam@gmail.com";
        adam.nick = "Aadamooo";

        String uczelniaAdama = adam.nazwaUczelni;
        //wywołanie metody statycznej
        adam.infoUczelnia();

    }
}
