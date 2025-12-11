import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Student[] students = Students.getStudents();
        System.out.println("До сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }
        TestStudentSorting.insertionSort(students);
        System.out.println("\nПосле сортировки вставками:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
class TestStudentSorting {
    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable current = list[i];
            int j = i - 1;

            while (j >= 0 && list[j].compareTo(current) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
    }
}
