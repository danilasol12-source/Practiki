package ru.mirea1.uibo1.Solntsev.pr1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        do {
            System.out.print("Факториал какого числа: ");
            n = scanner.nextInt();
            if (n<0){
                System.out.println("Факториал применим только к положительным целым. Пробуй ещё раз");
            }
        } while (n<0);

        long res = 1;
        for (int i = 1; i<=n; i++){
            res*=i;
        }
        System.out.println("Факториал " + n + ": " + res);
    }
}
