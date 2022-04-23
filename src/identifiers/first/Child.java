package identifiers.first;

public class Child extends Parent{


    //klasa potomna w tej samej paczce nie ma dostępu do pól private
    //private tylko w tej samej klasie
    public void testIdentifier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondMethod();
        thirdMethod();
    }
}
