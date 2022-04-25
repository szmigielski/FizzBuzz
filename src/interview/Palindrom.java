package interview;
//palindrom to samo słowo czyten od przodu i od tyłu
public class Palindrom {
    public static void main(String[] args){

        System.out.println(isPalindrom("kajak"));

    }

    public static boolean isPalindrom(String word){
        //zwraca liczbe znakow
        int n = word.length();

        for (int i = 0; i < (n/2); i++) {
            //czy wyraz ktory znajduje sie na indeksie 0 jest rozny od
            //znaku ktory bedzie znajdowal sie na ostatnim miejscu
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }

        }
        return true;
    }
}
