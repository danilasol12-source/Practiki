package ru.mirea1.uibo1.Solntsev.pr1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько целых чисел в списке: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Вводи " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // for
        int sumFor = 0;
        for (int i = 0; i < array.length; i++) {
            sumFor += array[i];
        }
        System.out.println("Сумма через Фор: " + sumFor);

        // while
        int sumWhile = 0;
        int j = 0;
        while (j < array.length) {
            sumWhile += array[j];
            j++;
        }
        System.out.println("Сумма Вайлом: " + sumWhile);

        // do while
        int sumDoWhile = 0;
        int k = 0;
        do {
            sumDoWhile += array[k];
            k++;
        } while (k < array.length);
        System.out.println("Сумма Ду Вайлом: " + sumDoWhile);

        scanner.close();
    }
}
