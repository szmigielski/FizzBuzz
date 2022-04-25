package dev.damian_szmigielski;

public class ConversionCasting {
    public static void main(String[] args){

        int a = 2;
        double b = 4.23;

        double c = a/b; // a przekonwertowane na double

        int d = a/(int) b;

        System.out.println(c);
        System.out.println(d);

        Task9WebDriver driver = new Task9FirefoxDriver();

        Task9FirefoxDriver firefoxDriver = (Task9FirefoxDriver) driver;
        firefoxDriver.get();
    }
}
