import java.util.Scanner;

public class Task8 {

    public  static class ThrowsDemo {
        public void getKey() {
            Scanner myScanner = new Scanner(System.in);
            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Enter key: ");
                    String key = myScanner.next();
                    printDetails(key);
                    valid = true;
                } catch (Exception e) {
                    System.out.println("Invalid key. Try again.");
                }
            }
        }

        public void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println(message);
        }

        private String getDetails(String key) throws Exception {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        }

        public static void main(String[] args) {
            ThrowsDemo td = new ThrowsDemo();
            td.getKey();
        }
    }
}
