import java.util.Scanner;

public class Task7 {

    public static class ThrowsDemo {
        public void getKey() {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            printDetails(key);
        }

        public void printDetails(String key) throws Exception { // Добавлено throws
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (Exception e) {
                throw e; // Пробрасываем дальше
            }
        }

        private static String getDetails(String key) throws Exception {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        }

        public static void main(String[] args) throws Exception {
            ThrowsDemo td = new ThrowsDemo();
            td.getKey();
        }
    }
}
