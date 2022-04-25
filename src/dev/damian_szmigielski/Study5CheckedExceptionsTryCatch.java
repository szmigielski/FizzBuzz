package dev.damian_szmigielski;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Study5CheckedExceptionsTryCatch {

    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("D:\\untitled\\src\\xaxa.txt");
            System.out.println("Closing file");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        } finally {
            System.out.println("Closing File");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
