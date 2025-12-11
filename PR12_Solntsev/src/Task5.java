public class Task5 {
    public static class ThrowsDemo {
        public void getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
            System.out.println("Key: " + key);
        }

        public static void main(String[] args) {
            ThrowsDemo td = new ThrowsDemo();
            td.getDetails(null);
        }
    }
}
