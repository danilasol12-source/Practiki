import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        try {
            System.out.print("Введите дату и время в формате дд.мм.гггг чч:мм: ");
            String userInput = scanner.nextLine();
            Date userDate = sdf.parse(userInput + ":00");

            Date localTime = new Date();
            System.out.println("\n=== ВВЕДЁННОЕ ВРЕМЯ ===");
            System.out.println("Локальное: " + sdf.format(localTime));
            System.out.println("Введенное: " + sdf.format(userDate));
            compareSimple(userDate, localTime, "локального");

            System.out.println("\n=== ИНТЕРНЕТ-ВРЕМЯ ===");
            Date internetTime = getSimpleInternetTime();
            if (internetTime != null) {
                System.out.println("Интернет:  " + sdf.format(internetTime));
                System.out.println("Введенное: " + sdf.format(userDate));
                compareSimple(userDate, internetTime, "интернет-временем");
            }

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static Date getSimpleInternetTime() {
        try {
            URL url = new URL("http://worldtimeapi.org/api/ip");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(3000);

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            String datetime = null;

            // Ищем строку с датой в ответе
            while ((line = reader.readLine()) != null) {
                if (line.contains("\"datetime\":")) {
                    datetime = line.split("\"")[3]; // Берем значение между кавычками
                    break;
                }
            }
            reader.close();

            if (datetime != null) {
                // Обрезаем до секунд (игнорируем миллисекунды и часовой пояс)
                datetime = datetime.substring(0, 19);
                SimpleDateFormat apiFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                return apiFormat.parse(datetime);
            }

        } catch (Exception e) {
            System.out.println("Не удалось получить интернет-время: " + e.getMessage());
        }
        return null;
    }

    private static void compareSimple(Date userDate, Date referenceDate, String referenceName) {
        long diff = userDate.getTime() - referenceDate.getTime();
        if (diff == 0) {
            System.out.println("Ровня для" + referenceName);
        } else if (diff < 0) {
            System.out.println("Раньше " + referenceName + " на " + (-diff/1000) + " сек.");
        } else {
            System.out.println("Позже " + referenceName + " на " + (diff/1000) + " сек.");
        }
    }
}