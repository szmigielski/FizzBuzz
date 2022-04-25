package dev.damian_szmigielski;

public class Task9WebDriverTest {
    public static void main (String[] args) {
        Task9ChromeDriver chrome = new Task9ChromeDriver();
        Task9FirefoxDriver firefox = new Task9FirefoxDriver();
        //druga, prostsza opcja
        //zmienna driver dla klasy Task9WebDriver
        //przypisuje do zmiennej driver metode get driver
        Task9WebDriver driver = getDriver("chromexxxx");

        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

  /*      firefox.get();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();*/


    }

    private static Task9WebDriver getDriver(String name)  {
        if (name.equals("chrome")){
            return new Task9ChromeDriver();
        } else if (name.equals("firefox")){
            return new Task9FirefoxDriver();
        }
        throw new Task9NoValidBrowserName("No valid browser name");

    }
}
