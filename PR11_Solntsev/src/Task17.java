import java.util.Scanner;

public class Task17 {
    public static int findMax() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) return 0;
        int nextMax = findMax();
        return Math.max(num, nextMax);
    }

    public static void main(String[] args) {
        System.out.println(findMax());
    }
}