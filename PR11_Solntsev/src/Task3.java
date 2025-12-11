import java.util.Scanner;

public class Task3 {
    public static void printRange(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
            return;
        }
        System.out.print(a + " ");
        if (a < b) {
            printRange(a + 1, b);
        } else {
            printRange(a - 1, b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод переменной 1: ");
        int a = scanner.nextInt();
        System.out.print("Ввод переменной 2: ");
        int b = scanner.nextInt();
        System.out.println("Результат: ");
        printRange(a,b);
    }
}
