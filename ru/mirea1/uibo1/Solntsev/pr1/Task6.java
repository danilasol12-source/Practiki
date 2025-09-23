package ru.mirea1.uibo1.Solntsev.pr1;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array1 = new int[10]; int[] array2 = new int[10];

        //Math.random()
        System.out.println("Используя Math.random():");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 100);
        }
        System.out.println("До: " + Arrays.toString(array1));
        Arrays.sort(array1); System.out.println("После: " + Arrays.toString(array1));

        System.out.println(); //Пустая строка для красоты

        //Random class
        System.out.println("Используя Random class:");
        Random random = new Random();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100);
        }
        System.out.println("До: " + Arrays.toString(array2));
        Arrays.sort(array2); System.out.println("После: " + Arrays.toString(array2));
    }
}
