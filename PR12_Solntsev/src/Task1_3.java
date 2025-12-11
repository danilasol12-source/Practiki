public class Task1_3 {
    public static class Exception1 {
        public void exceptionDemo() {
            try {
                System.out.println(2 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }

        public static void main(String[] args) {
            Exception1 e1 = new Exception1();
            e1.exceptionDemo();
        }
    }
}
//Вывод: Attempted division by zero
