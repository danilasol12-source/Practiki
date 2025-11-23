import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int size = 100000;
        Random random = new Random();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("ArrayList vs LinkedList");

        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long arrayListAddTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        long linkedListAddTime = System.nanoTime() - startTime;

        System.out.printf("Добавление в конец: ArrayList=%d ns, LinkedList=%d ns\n",
                arrayListAddTime, linkedListAddTime);


        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, i);
        }
        long arrayListInsertStart = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, i);
        }
        long linkedListInsertStart = System.nanoTime() - startTime;

        System.out.printf("Вставка в начало: ArrayList=%d ns, LinkedList=%d ns\n",
                arrayListInsertStart, linkedListInsertStart);


        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        long arrayListInsertMiddle = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        long linkedListInsertMiddle = System.nanoTime() - startTime;

        System.out.printf("Вставка в середину: ArrayList=%d ns, LinkedList=%d ns\n",
                arrayListInsertMiddle, linkedListInsertMiddle);


        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        long arrayListRemoveStart = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        long linkedListRemoveStart = System.nanoTime() - startTime;

        System.out.printf("Удаление из начала: ArrayList=%d ns, LinkedList=%d ns\n",
                arrayListRemoveStart, linkedListRemoveStart);


        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(arrayList.size());
            arrayList.get(index);
        }
        long arrayListSearch = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(linkedList.size());
            linkedList.get(index);
        }
        long linkedListSearch = System.nanoTime() - startTime;

        System.out.printf("Поиск по индексу: ArrayList=%d ns, LinkedList=%d ns\n",
                arrayListSearch, linkedListSearch);




        System.out.println("\n ВЫВОДЫ");
        System.out.println("ArrayList лучше для: поиска по индексу, доступа к элементам");
        System.out.println("LinkedList лучше для: вставки/удаления в начале/конце");
    }
}