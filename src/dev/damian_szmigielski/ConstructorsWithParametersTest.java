package dev.damian_szmigielski;

public class ConstructorsWithParametersTest {
    //tworzymy metodę główną
    public static void main(String[] args){
//      Constructors user = new Constructors();
        ConstructorsWithParameters user2 = new ConstructorsWithParameters("say", "hello");

//      user.username = "Bartek";
//      user.password = "QWERTY";
        System.out.println(user2.username);
        System.out.println(user2.password);
        user2.sayHello();

    }
}
