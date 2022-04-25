package dev.damian_szmigielski;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Study5CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {
        readFile("/src/xaxaxa.txt");
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
