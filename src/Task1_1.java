public class Task1_1 {
    public static class Exception1 {
        public void exceptionDemo() {
            System.out.println(2 / 0);
        }
    }

    public static void main(String[] args) {
        Exception1 e1 = new Exception1();
        e1.exceptionDemo();
    }
}
//Вывод: ошибка: делить на ноль нельзя


