package dev.damian_szmigielski;

public class Task8App {
    //nazwa aplikacji
    public String nameApp;
    //właściwości aplikacji

    // alt + insert -> constructor
    public Task8App(String nameApp) {
        this.nameApp = nameApp;
    }

    //metoda appInfo
    public void appInfo(){
        System.out.println("Informacje o aplikacji: " + nameApp);
    }

}
