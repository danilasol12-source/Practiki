public class Task4 {
    //Чуть что, в задании сказано просто найти ошибку, ни слова про "исправить", как в других заданиях


    public class TestDate {
        public static void main(String[] args) {
            java.util.Date[] dates = new java.util.Date[10];
            System.out.println(dates[0]);

            System.out.println(dates[0].toString()); //Вот здесь ошибка: выведет NullPointerException,
            // потому что элементы массива dates не инициализированы и равны null.

        }
    }
}
