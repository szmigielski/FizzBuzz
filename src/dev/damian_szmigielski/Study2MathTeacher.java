package dev.damian_szmigielski;

//nauczyciel matematyki rozszerza klasę PersonBaseClass
public class Study2MathTeacher extends Study2PersonBaseClass {

    public String school;

    public Study2MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void walk(){
        //wywołujemy metodę walk z klasy Study2PersonTest oraz dodajemy coś od siebie
        super.walk();
        System.out.println("I walk very fast");
    }

    public void teachMatch(){
        System.out.println("I'm teaching math");
    }

    public void sayHello(){
        System.out.println("Heloo my name is " + name);
        System.out.println("I'm " +age);
    }
}
