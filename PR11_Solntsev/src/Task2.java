import java.util.Scanner;

public class Task2 {
    public static void printNumbers(int n) {
        if (n == 0) return;
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод переменной: ");
        int x = scanner.nextInt();
        System.out.println("Результат: ");
        printNumbers(x);
    }
}
