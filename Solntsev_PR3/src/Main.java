import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА Circle ===");
        // Тест конструктора по умолчанию
        Circle circle1 = new Circle();
        System.out.println("\n1. Circle() по умолчанию: " + circle1);

        // Тест конструктора с радиусом
        System.out.print("\n2. Введите радиус для Circle(radius): ");
        double radius = scanner.nextDouble();
        Circle circle2 = new Circle(radius);
        System.out.println("   Результат: " + circle2);
        System.out.printf("   Площадь: %.2f\n", circle2.getArea());
        System.out.printf("   Периметр: %.2f\n", circle2.getPerimeter());

        // Тест полного конструктора
        System.out.print("\n3. Введите радиус для полного конструктора: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера
        System.out.print("   Введите цвет: ");
        String color = scanner.nextLine();
        System.out.print("   Закрашен? (true/false): ");
        boolean filled = scanner.nextBoolean();
        Circle circle3 = new Circle(radius, color, filled);
        System.out.println("   Результат: " + circle3);

        System.out.println("\n\n=== ТЕСТИРОВАНИЕ КЛАССА Rectangle ===");
        // Тест конструктора по умолчанию
        Rectangle rect1 = new Rectangle();
        System.out.println("\n1. Rectangle() по умолчанию: " + rect1);

        // Тест конструктора с шириной и длиной
        System.out.print("\n2. Введите ширину: ");
        double width = scanner.nextDouble();
        System.out.print("   Введите длину: ");
        double length = scanner.nextDouble();
        Rectangle rect2 = new Rectangle(width, length);
        System.out.println("   Результат: " + rect2);
        System.out.printf("   Площадь: %.2f\n", rect2.getArea());

        // Тест полного конструктора
        System.out.print("\n3. Введите ширину: ");
        width = scanner.nextDouble();
        System.out.print("   Введите длину: ");
        length = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера
        System.out.print("   Введите цвет: ");
        color = scanner.nextLine();
        System.out.print("   Закрашен? (true/false): ");
        filled = scanner.nextBoolean();
        Rectangle rect3 = new Rectangle(width, length, color, filled);
        System.out.println("   Результат: " + rect3);

        System.out.println("\n\n=== ТЕСТИРОВАНИЕ КЛАССА Square ===");
        // Тест конструктора по умолчанию
        Square square1 = new Square();
        System.out.println("\n1. Square() по умолчанию: " + square1);

        // Тест конструктора со стороной
        System.out.print("\n2. Введите длину стороны: ");
        double side = scanner.nextDouble();
        Square square2 = new Square(side);
        System.out.println("   Результат: " + square2);
        System.out.printf("   Площадь: %.2f\n", square2.getArea());

        // Тест полного конструктора и методов setSide/setWidth
        System.out.print("\n3. Введите длину стороны: ");
        side = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("   Введите цвет: ");
        color = scanner.nextLine();
        System.out.print("   Закрашен? (true/false): ");
        filled = scanner.nextBoolean();
        Square square3 = new Square(side, color, filled);
        System.out.println("   Исходный квадрат: " + square3);

        System.out.print("   Измените сторону квадрата: ");
        double newSide = scanner.nextDouble();
        square3.setSide(newSide);
        System.out.println("   После setSide(): " + square3);

        System.out.print("   Еще раз измените сторону (через setWidth()): ");
        newSide = scanner.nextDouble();
        square3.setWidth(newSide); // Должно изменить и ширину, и длину!
        System.out.println("   После setWidth(): " + square3);

        System.out.println("\n\n=== ТЕСТИРОВАНИЕ ПОЛИМОРФИЗМА ===");
        // Upcast: Создаем массив фигур разного типа
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "Зеленый", true);    // Upcast Circle to Shape
        shapes[1] = new Rectangle(3, 4, "Красный", false); // Upcast Rectangle to Shape
        shapes[2] = new Square(6, "Синий", true);      // Upcast Square to Shape

        System.out.println("\nДемонстрация полиморфизма:");
        for (Shape shape : shapes) {
            System.out.println("----------------------------");
            System.out.println(shape); // Вызовется переопределенный toString()
            System.out.printf("Площадь: %.2f\n", shape.getArea()); // Вызовется переопределенный getArea()
            System.out.printf("Периметр: %.2f\n", shape.getPerimeter()); // Вызовется переопределенный getPerimeter()
        }

        scanner.close();
    }
}