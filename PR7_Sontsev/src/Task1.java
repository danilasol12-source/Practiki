import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.print("Введите ваше ФИО: ");
        String developerName = scanner.nextLine();

        System.out.print("Готовы к получению задания, " + developerName + "? (Y/N): ");
        String readyAnswer = scanner.nextLine();
        Date startDate = null;

        if (!readyAnswer.equalsIgnoreCase("Y")) {
            System.out.println("Ждем вашей готовности... Нажмите Enter, когда будете готовы");
            scanner.nextLine();
        }
        startDate = new Date();
        System.out.println("\nРазработчик: " + developerName);
        System.out.println("Дата и время получения задания: " + sdf.format(startDate));
        System.out.println("Задание получено! Приступайте к работе.");


        System.out.println("\nНажмите Enter, когда завершите задание...");
        scanner.nextLine();
        Date endDate = new Date();
        System.out.println("Дата и время сдачи задания: " + sdf.format(endDate));

        scanner.close();
    }
}
