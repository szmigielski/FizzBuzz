package dev.damian_szmigielski;

public class FinalTest {
    public static void main(String[] args){
        // final - nie możemy zmienić wartości
        final int x = 2;

        final Study2PersonBaseClass person = new Study2PersonBaseClass("Tim", 26);
        person.age = 25;
        //powyższy kod działa

        //nie możemy przypisać nowego obiektu tego typu do już istniejącej zmiennej, która jest final
        //person = new Study2PersonBaseClass("Tom", 22);
    }
}
