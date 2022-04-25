package interview;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {
    // int[] numbers = new int [] {1,2,3,2,5,3};
    public static void main(String[] args){
    liczWystapienia(new int [] {1,2,3,2,5,3});
    }

    //parametr tablica intow
    public static void liczWystapienia(int[] numbers){
        //mapa klucz wartosc
        Map<Integer, Integer> occurences = new HashMap<>();
        //iterujemy przez wszystkie elementy, ktore beda znajdowac sie w tablicy
        for (int i=0; i<numbers.length; i++){
            //jezeli nasza mapa zawiera klucz o indeksie i
            if (occurences.containsKey(numbers[i])){
                //chcemy pobrac wartosc dla tego klucza
                Integer value = occurences.get(numbers[i]);
                //chcemy te wartosc zaktualizowac
                occurences.put(numbers[i], value+1);
            }else {
                //gdy nasza mapa nie zawiera takiego klucza,
                //dodajemy go, wartosc 1 bo to jest pierwszy element(jedno wystapienie)
                occurences.put(numbers[i], 1);
            }
        }
        System.out.println("Ilosc elementow w mapie: " + occurences.size());
    }
}
