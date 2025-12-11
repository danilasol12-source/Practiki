public class Task6_3 {
    public static class ThrowsDemo {
        public void printMessage(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (NullPointerException e) {
                System.out.println("Caught in printMessage: " + e.getMessage());
            }
        }

        public String getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for " + key;
        }

        public static void main(String[] args) {
            ThrowsDemo td = new ThrowsDemo();
            td.printMessage("test");
            td.printMessage(null);
        }
    }
}
