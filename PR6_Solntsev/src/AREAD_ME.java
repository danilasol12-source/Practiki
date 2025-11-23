//Задание 1
//Код, который выведет картинку - UML диаграмму
//Не удалось сделать в Draw.io - картинка сделана на основе картинок с предыдущих работ

//Задания 2-3: Movable, MovablePoint, MovableRectangle
//Задание 4: MathCalculate, MathFunc, TestMathFuncs
//Задания 5-6: Stringi, ProcessStrings, TestStrings
//Задания 7-8: Printable, Book, Magazine, TestPrintables


import javax.swing.*;
import java.awt.*;
import java.io.File;

public class AREAD_ME {

        public static void main(String[] args) {
            String imagePath = "Task1.png";

            openImage(imagePath);
        }

        public static void openImage(String imagePath) {
            try {
                File imageFile = new File(imagePath);

                if (!imageFile.exists()) {
                    System.out.println("Файл не найден: " + imagePath);
                    return;
                }

                JFrame frame = new JFrame("Просмотр изображения");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon imageIcon = new ImageIcon(imagePath);
                JLabel imageLabel = new JLabel(imageIcon);

                JScrollPane scrollPane = new JScrollPane(imageLabel);
                frame.add(scrollPane, BorderLayout.CENTER);

                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                System.out.println("Изображение успешно открыто: " + imagePath);

            } catch (Exception e) {
                System.out.println("Ошибка при открытии изображения: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
