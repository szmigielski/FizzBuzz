package dev.damian_szmigielski;

public class Study5ExceptionsExample {
    public static void main(String[]args) {

        /*int [] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }*/
        Task9WebDriver driver = getDriver("chromexx");

        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

        private static Task9WebDriver getDriver(String name) {
            if (name.equals("chrome")){
                return new Task9ChromeDriver();
            } else if (name.equals("firefox")){
                return new Task9FirefoxDriver();
            } return null;

        }
    }
