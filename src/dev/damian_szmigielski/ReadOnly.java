package dev.damian_szmigielski;

public class ReadOnly {

    private String name = "Bartek";
// jeśli chcemy by inne klasy mogły odczytać te metode musimy utworzyc metode publiczna
// metoda, która będzie zwracać wartość pola prywatnego nazywa się Getterem
    public String getName(){
        name = name + "jest ok" ;
        return name;
        // lub return name + "jest ok";
    }
    private String school = "UE";

    // Setter - metoda, która pozwala nam przypisać wartość, które jest prywatne
    public void setSchool(String school){
        this.school = school;
    }

}
