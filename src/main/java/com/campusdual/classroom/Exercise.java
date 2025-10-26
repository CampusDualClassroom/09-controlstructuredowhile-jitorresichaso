package com.campusdual.classroom;

public class Exercise {

    public static void main(String[] args) {
        doWhileLoop(10);
    }

    public static void doWhileLoop(int num) {
        int x = 0;
        do {
            System.out.println("Entra con valor: " + x + ", sale con valor: " + (x + 1));
            x++;
        } while (x < num);
    }
}
