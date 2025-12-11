/*В качестве задания 2 из заданий:

1. Реализовать запись в файл введённой с клавиатурыинформации
2. Реализовать вывод информации из файла на экран                   - ВОТ ОНО
3. Заменить информацию в файле на информацию, введённую склавиатуры
4. Добавить в конец исходного файла текст, введённый с клавиатуры
Я решил выбрать второе задание:
 */

import java.io.FileReader;
import java.io.IOException;
public class Task2 {

        public static void main(String[] args) {
            String fileName = "example.txt"; // имя файла

            try (FileReader reader = new FileReader(fileName)) {
                int character;
                System.out.println("Содержимое файла " + fileName + ":");
                System.out.println("---------------------------");

                // Чтение посимвольно
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }

            } catch (IOException ex) {
                System.out.println("Ошибка при чтении файла: " + ex.getMessage());
            }
        }
}
