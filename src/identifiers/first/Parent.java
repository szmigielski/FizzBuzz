package identifiers.first;

public class Parent {
    //4 pola i 4 metody
    public String first = "public";
    //domyslny, powiazany z paczka
    String second = "default";
    protected String third = "protected";
    private String fourth = "private";



    public void firstMethod(){
        System.out.println("public");
    }

    void secondMethod(){
        System.out.println("default");
    }

    protected void thirdMethod(){
        System.out.println("protected");
    }

    private void fourthMethod(){
        System.out.println("private");
    }



    public void testIdentifiers(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
