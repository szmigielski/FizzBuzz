package dev.damian_szmigielski;

public class TablicaTeoria {
    public static void main(String[] args){
        String[] winterMonths = new String[3];
        winterMonths[0] = "grudzien";
        winterMonths[1] = "styczen";
        winterMonths[2] = "luty";

        int[] lottoNumbers = new int[]{1,2,3,4,5,6};
        System.out.println(lottoNumbers.length);

        for (int i=0; i<lottoNumbers.length; i++){
            System.out.println(lottoNumbers[i]);
        }


    }
}
