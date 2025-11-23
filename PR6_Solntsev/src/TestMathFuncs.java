//Задание 4

import static java.lang.Math.*;
import java.util.Scanner;

public class TestMathFuncs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathFunc test = new MathFunc();

        System.out.println("=== Тестирование математических функций ===");

        // Тест возведения в степень
        System.out.println("\n--- Возведение в степень ---");
        System.out.print("Введите основание: ");
        double base = scanner.nextDouble();
        System.out.print("Введите показатель степени: ");
        double exp = scanner.nextDouble();
        System.out.println(base + "^" + exp + " = " + test.power(base, exp));

        // Тест модуля комплексного обеда
        System.out.println("\n--- Модуль комплексного числа ---");
        System.out.print("Введите действительную часть: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginary = scanner.nextDouble();
        System.out.println("Модуль комплексного числа " + real + "+" + imaginary + "i = " + test.complexModul(real, imaginary));

        // Тест длины окружности
        System.out.println("\n--- Длина окружности ---");
        System.out.print("Введите радиус окружности: ");
        double radius = scanner.nextDouble();
        System.out.println("Длина окружности радиуса " + radius + " = " + test.circleLen(radius));

        // Тест площади круга
        System.out.println("\n--- Площадь круга ---");
        System.out.print("Введите радиус круга: ");
        radius = scanner.nextDouble();
        System.out.println("Площадь круга радиуса " + radius + " = " + test.circleArea(radius));

        scanner.close();
    }
}