import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст студента: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        System.out.print("Введите дату рождения в формате дд.мм.гггг: ");
        String birthDateStr = scanner.nextLine();

        try {
            // Парсим строку с датой в объект Date
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            Date birthDate = sdf.parse(birthDateStr);

            // Создаем студента
            Student student = new Student(name, age, birthDate);

            // Выводим информацию
            System.out.println("\n=== ИНФОРМАЦИЯ О СТУДЕНТЕ ===");
            System.out.println("Имя: " + student.getName());
            System.out.println("Возраст: " + student.getAge());
            System.out.println("Дата рождения (короткий формат): " + student.getFormattedBirthDate("short"));
            System.out.println("Дата рождения (средний формат): " + student.getFormattedBirthDate("medium"));
            System.out.println("Дата рождения (полный формат): " + student.getFormattedBirthDate("full"));
            System.out.println("Дата рождения (ISO формат): " + student.getFormattedBirthDate("iso"));

            // Вывод через toString()
            System.out.println("\nЧерез метод toString(): " + student);

        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты! Используйте дд.мм.гггг");
        } finally {
            scanner.close();
        }
    }
}

class Student {
    private String name;
    private int age;
    private Date birthDate;

    public Student(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // Метод для форматированного вывода даты рождения
    public String getFormattedBirthDate(String formatType) {
        SimpleDateFormat sdf;

        switch (formatType.toLowerCase()) {
            case "short":
                sdf = new SimpleDateFormat("dd.MM.yy");
                break;
            case "medium":
                sdf = new SimpleDateFormat("dd.MM.yyyy");
                break;
            case "full":
                sdf = new SimpleDateFormat("EEEE, d MMMM yyyy 'г.'");
                break;
            default:
                sdf = new SimpleDateFormat("dd.MM.yyyy");
        }

        return sdf.format(birthDate);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + getFormattedBirthDate("medium") +
                '}';
    }
}