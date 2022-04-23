package com.test.app;

//importujemy paczke
import com.test.app.database.DatabaseConnection;
import com.test.app.database.DatabaseUtils;

public class App {

    public static void main(String[] args){
        //odwolujemy sie do klasy
        DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseUtils databaseUtils = new DatabaseUtils();


    }
}
