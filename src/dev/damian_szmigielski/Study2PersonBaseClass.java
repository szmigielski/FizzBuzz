package dev.damian_szmigielski;

public class Study2PersonBaseClass {
    public String name;
    public int age;

    public Study2PersonBaseClass(String name, int age){
        this.name = name;
        this.age = age;

    }


    public void eat(){
        System.out.println("I like pizza");
    }

    public void walk(){
        System.out.println("I like walking ");
    }
}
