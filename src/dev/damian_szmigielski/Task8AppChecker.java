package dev.damian_szmigielski;

public class Task8AppChecker {
    //musimy utworzyc metode uruchomieniowa
    public static void main(String[] args){
        Task8AndroidTask8App androidApplication = new Task8AndroidTask8App("Calculator");

        androidApplication.appInfo();
        androidApplication.runAndroidApp();

        Task8IphoneTask8App iphoneApplication = new Task8IphoneTask8App("Terminal");
        iphoneApplication.appInfo();
        iphoneApplication.runIphoneApp();
    }
}
