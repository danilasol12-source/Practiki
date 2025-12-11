public class Task6_1_2 {
    public static class ThrowsDemo {
        public void getDetails(String key) {
            try {
                if (key == null) {
                    throw new NullPointerException("null key in getDetails");
                }
                System.out.println("Key: " + key);
            } catch (NullPointerException e) {
                System.out.println("Caught inside method: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            ThrowsDemo td = new ThrowsDemo();
            td.getDetails(null);
        }
    }
}
