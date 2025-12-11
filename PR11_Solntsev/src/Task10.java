import java.util.Scanner;

public class Task10 {
    public static int reverse(int n, int reversed) {
        if (n == 0) return reversed;
        return reverse(n / 10, reversed * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод переменной: ");
        int x = scanner.nextInt();
        System.out.println("Результат:");
        System.out.println(reverse(x, 0));
    }
}
