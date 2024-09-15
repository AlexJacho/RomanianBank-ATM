package com.RomanianBank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bine ai venit la Romanian Bank");

        String numarCont = "14546549876";
        double soldFinal = 456.75;
        int pin = 1234;
        int[] transactii = {400, -300, 20};

        soldFinal += transactii[0]; //depozit
        if (soldFinal > 0 && pin == 1234) {
            System.out.println("Acces acordat");
        }
    }
}