package com.RomanianBank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello RomanianBank");
        try {
            int result = 10 / 0; // Genera una excepción
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");
        }
    }
}