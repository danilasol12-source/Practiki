import java.util.Scanner;

public class Task8 {

    public static String reverseString(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
    public static void isPoly(String s){
        String rs = reverseString(s);
        if (rs==s){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод слова: ");
        String s = scanner.next();
        System.out.println("Результат:");
        isPoly(s);
    }
}