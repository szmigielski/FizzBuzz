package listy;

import documentPolimorfizmKlas.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args){
        //nowa lista
        List<String> names = new ArrayList<>();
        names.add("Pawel");
        names.add("Kasia");
        names.add("Ola");
        names.add("Pawel");

        System.out.println(names.get(1));

        System.out.println(names.indexOf("Pawel"));
        System.out.println(names.lastIndexOf("Pawel"));

        //sprawdzamy czy lista zawiera Krysia
        System.out.println(names.contains("Krysia"));

        //metoda size zwraca wielkosc listy
        System.out.println(names.size());

        //czy lista jest pusta
        System.out.println(names.isEmpty());

        //druga lista Integer
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Druga lista");

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());


        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);

        System.out.println(diffNames);

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());

        System.out.println(pdfDocuments);

        //iterowanie
        for (int i=0; i< names.size();i++){
            System.out.println(names.get(i));
        }

        //do zmiennej name będzie przypisywany pojedynczy element
        for (String name : names){
            System.out.println(name);
        }

    }
}
