package dev.damian_szmigielski;

public class Task7ConstructorsWithParameters {
        public String marka;
        public String model;
        public int rokProdukcji;
        public int przebieg;

        public Task7ConstructorsWithParameters(){

        }
        public Task7ConstructorsWithParameters(String marka, String model, int rokProdukcji, int przebieg){
            //this - obiekt, który tworzymy
            this.marka = marka;
            this.model = model;
            this.rokProdukcji = rokProdukcji;
            this.przebieg = przebieg;
        }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }

    }

