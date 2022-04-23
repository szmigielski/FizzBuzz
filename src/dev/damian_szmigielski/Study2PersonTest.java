package dev.damian_szmigielski;

public class Study2PersonTest {
    public static void main(String[] args){
        Study2MathTeacher teacher = new Study2MathTeacher("Kasia", 23,"UE");
        /*teacher.name = "Kasia";
        teacher.age = 23;
        teacher.school = "UE";*/
        teacher.sayHello();
        teacher.walk();
        teacher.eat();
        teacher.teachMatch();

        Study2Footballer footballer = new Study2Footballer("Mike", 21, "Boca Juniors");
        /*footballer.name = "Mike";
        footballer.age = 21;*/
        footballer.walk();
        footballer.eat();
        footballer.footballClub();
    }
}
