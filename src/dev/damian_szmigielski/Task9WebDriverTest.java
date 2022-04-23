package dev.damian_szmigielski;

public class Task9WebDriverTest {
    public static void main (String[] args){
        Task9ChromeDriver chrome = new Task9ChromeDriver();
        Task9FirefoxDriver firefox = new Task9FirefoxDriver();

        chrome.get();
        chrome.findElementBy();

        firefox.get();
        firefox.findElementBy();
    }
}
