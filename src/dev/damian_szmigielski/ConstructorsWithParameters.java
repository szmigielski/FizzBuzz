package dev.damian_szmigielski;

//konstruktor, specjalna metoda, która jest wywoływana podczas tworzenia obiektu
public class ConstructorsWithParameters {
    //pola publiczne typu String
    public String username;
    public String password;

    //konstruktor domyślny:
    public ConstructorsWithParameters(){
    }

    public ConstructorsWithParameters(String username, String passwword){
        System.out.println("Hello z konstruktora");
        //this - obiekt ktory tworzymy
        this.username = username;
        this.password = passwword;
    }
    //metoda, która nic nie zwraca (void)
    public void sayHello(){
        System.out.println("witaj" + username);
    }
}
