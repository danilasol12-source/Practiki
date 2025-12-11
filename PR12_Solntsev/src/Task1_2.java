public class Task1_2 {
    public static class Exception1 {
        public void exceptionDemo() {
            System.out.println(2.0 / 0.0);
        }

        public static void main(String[] args) {
            Exception1 e1 = new Exception1();
            e1.exceptionDemo();
        }
    }
}
//Вывод: бесконечность