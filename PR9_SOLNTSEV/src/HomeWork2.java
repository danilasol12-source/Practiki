import java.awt.*;
import java.io.File;

public class HomeWork2 {
    public static void openUMLImage() {
        try {
            File imageFile = new File("UMLка.jpg");

            if (imageFile.exists()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(imageFile);
                System.out.println("UML-диаграмма открыта!");
            } else {
                System.out.println("Файл UMLка.jpeg не найден в папке проекта!");
                System.out.println("Текущая папка: " + new File(".").getAbsolutePath());
            }
        } catch (Exception e) {
            System.out.println("Ошибка при открытии изображения: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        openUMLImage(); //Домашнее задание 2
    }
}
