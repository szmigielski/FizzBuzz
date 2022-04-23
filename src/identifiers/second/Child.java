package identifiers.second;

import identifiers.first.Parent;

//klasa potomna w innej paczce nie ma dostępu do pól private oraz domyślnych(package) czyli bez identyfikatora
//private tylko w tej samej klasie

public class Child extends Parent {
    public void testIdentifier(){
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}
