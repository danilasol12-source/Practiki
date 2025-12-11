import java.util.Scanner;
public class Task2_3 {

    public static class Exception2 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }

        public static void main(String[] args) {
            Exception2 e2 = new Exception2();
            e2.exceptionDemo();
        }
    }
}
