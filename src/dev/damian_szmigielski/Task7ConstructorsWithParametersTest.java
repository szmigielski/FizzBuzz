package dev.damian_szmigielski;

public class Task7ConstructorsWithParametersTest {
    public static void main (String[] args){
        Task7ConstructorsWithParameters car = new Task7ConstructorsWithParameters("audi", "A4", 2010, 12000);
        //drugie auto
        Task7ConstructorsWithParameters car2 = new Task7ConstructorsWithParameters("opel", "astra", 2020, 0);

        car.info();
        car2.info();
    }
}
