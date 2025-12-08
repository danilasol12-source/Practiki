public class Task2 {

    public class Test {
        int count;



        //Вот туда static пихаем
        public static void main(String[] args) {}




        public int getCount() { return count; }



        //и туда тоже
        public static int factorial(int n) {




            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        }
    }

}
