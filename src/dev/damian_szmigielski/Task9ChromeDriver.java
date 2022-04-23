package dev.damian_szmigielski;

public class Task9ChromeDriver implements Task9WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przegladarke za pomoca Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy elementy za pomoca przegladarki Chrome");
    }
}
