package ru.mirea1.uibo1.Solntsev.pr1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Первые 10 гармонических чисел:");
        for (int i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.printf("H%d = %.3f%n", i, harmonic);
        }
    }
}
