/*В качестве задания 1 из заданий:
1. Протестировать работу коллекции ArrayList. - ВОТ ОНО
2. Протестировать работу коллекции LinkedList.
3. Создать свою коллекцию, такую же как и ArrayList

Я решил выбрать самое первое задание:
 */

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // 1. Создать ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Добавить элементы
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add(2, "Груша"); // добавление по индексу также есть: оно просто встанет на место апельсина, сместив того вправо

        // 3. Вывод размера списка
        System.out.println("Количество элементов: " + fruits.size());

        // 4. Вывод всех элементов
        System.out.println("Список фруктов:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 5. Получение элемента по индексу
        System.out.println("Элемент с индексом 2: " + fruits.get(2));

        // 6. Проверка наличия элемента
        if (fruits.contains("Банан")) {
            System.out.println("Банан есть в списке");
        }

        // 7. Замена элемента
        fruits.set(0, "Персик");
        System.out.println("После замены первого элемента: " + fruits);

        // 8. Удаление элемента
        fruits.remove("Банан");
        fruits.remove(0);
        System.out.println("После удаления двух элементов: " + fruits);

        // 9. Очистка списка
        fruits.clear();
        System.out.println("После очистки: " + fruits);
        System.out.println("Пустой ли список? " + fruits.isEmpty());
    }
}
