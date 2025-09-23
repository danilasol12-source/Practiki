package ru.mirea1.uibo1.Solntsev.pr1;

import java.util.Scanner;
/*
*
*
*
*
* ЗАПУСТИТЬ main
*
*
*
*
*
*
*
*
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 2;
        System.out.println("=== Практическая работа 1 ===");
        System.out.println("Выберите задание для выполнения:");
        System.out.println("1 - Выйти отсюда");
        System.out.println("3 - Сумма элементов массива");
        System.out.println("4 - Аргументы командной строки");
        System.out.println("5 - Гармонический ряд");
        System.out.println("6 - Сортировка массива");
        System.out.println("7 - Факториал");
        System.out.println("0 - Запустить всё");
        while (choice!=1){
            System.out.print("Ваш выбор задания: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    continue;
                case 3:
                    Task3.main(new String[]{});
                    break;
                case 4:
                    // Для демонстрации передадим тестовые аргументы
                    Task4.main(new String[]{"Тестовый1", "аргумент2", "В программе заложено"});
                    break;
                case 5:
                    Task5.main(new String[]{});
                    break;
                case 6:
                    Task6.main(new String[]{});
                    break;
                case 7:
                    Task7.main(new String[]{});
                    break;
                case 0:
                    runAllTasks();
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
        scanner.close();
    }

    public static void runAllTasks() {
        System.out.println("\n=== Задание 3: Сумма массива ===");
        Task3.main(new String[]{});

        System.out.println("\n=== Задание 4: Аргументы командной строки ===");
        Task4.main(new String[]{"Hello", "World", "Java", "Programming"});

        System.out.println("\n=== Задание 5: Гармонический ряд ===");
        Task5.main(new String[]{});

        System.out.println("\n=== Задание 6: Сортировка массива ===");
        Task6.main(new String[]{});

        System.out.println("\n=== Задание 7: Факториал ===");
        Task7.main(new String[]{});
    }
}