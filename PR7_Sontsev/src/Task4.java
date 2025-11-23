import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ввод данных от пользователя
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            System.out.print("Введите месяц (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Введите число: ");
            int day = scanner.nextInt();

            System.out.print("Введите часы (0-23): ");
            int hours = scanner.nextInt();

            System.out.print("Введите минуты (0-59): ");
            int minutes = scanner.nextInt();

            // Создание объекта Date (устаревший способ)
            // Месяц в Date начинается с 0, поэтому вычитаем 1
            Date date = new Date(year - 1900, month - 1, day, hours, minutes);

            // Создание объекта Calendar
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1); // Месяц в Calendar тоже с 0
            calendar.set(Calendar.DAY_OF_MONTH, day);
            calendar.set(Calendar.HOUR_OF_DAY, hours);
            calendar.set(Calendar.MINUTE, minutes);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            // Форматирование для вывода
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

            // Вывод результатов
            System.out.println("\nРезультаты:");
            System.out.println("Объект Date: " + sdf.format(date));
            System.out.println("Объект Calendar: " + sdf.format(calendar.getTime()));

            // Альтернативный вывод через Calendar
            System.out.println("Calendar (раздельно): " +
                    calendar.get(Calendar.DAY_OF_MONTH) + "." +
                    (calendar.get(Calendar.MONTH) + 1) + "." +
                    calendar.get(Calendar.YEAR) + " " +
                    calendar.get(Calendar.HOUR_OF_DAY) + ":" +
                    calendar.get(Calendar.MINUTE));

        } catch (Exception e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
