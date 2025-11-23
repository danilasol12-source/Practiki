//Задание 6

import java.util.Scanner;

public class TestStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessStrings test = new ProcessStrings();

        System.out.println("=== Тестирование строчных функций ===");
        System.out.print("Введите строку любую: ");
        String s = scanner.nextLine();

        System.out.println("Длина строки: " + test.countChars(s));
        System.out.println("Нечётные символы (если первый символ обозначается как 0):" + test.oddPositionChars(s));
        System.out.println("Обратная строка:" + test.reverseString(s));
    }
}
