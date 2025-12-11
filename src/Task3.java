import java.util.Scanner;

public class Task3 {

    public static class Exception2 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Not an integer!");
            } catch (ArithmeticException e) {
                System.out.println("Division by zero!");
            } catch (Exception e) { // Должен быть последним
                System.out.println("General exception caught");
            }
        }
        public static void main(String[] args) {
            Exception2 e2 = new Exception2();
            e2.exceptionDemo();
        }
    }
}
