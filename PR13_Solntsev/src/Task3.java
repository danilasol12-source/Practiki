import java.util.*;

public class Task3 {
    public static Student[] mergeSort(Student[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        Student[] left = Arrays.copyOfRange(arr, 0, mid);
        Student[] right = Arrays.copyOfRange(arr, mid, arr.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        Student[] allStudents = Students.getStudents();

        int mid = allStudents.length / 2;
        Student[] list1 = Arrays.copyOfRange(allStudents, 0, mid);
        Student[] list2 = Arrays.copyOfRange(allStudents, mid, allStudents.length);

        System.out.println("Первый список (" + list1.length + " студентов):");
        for (Student s : list1) {
            System.out.println(s);
        }

        System.out.println("\nВторой список (" + list2.length + " студентов):");
        for (Student s : list2) {
            System.out.println(s);
        }

        Student[] merged = new Student[list1.length + list2.length];
        System.arraycopy(list1, 0, merged, 0, list1.length);
        System.arraycopy(list2, 0, merged, list1.length, list2.length);

        Student[] sorted = mergeSort(merged);

        System.out.println("\nОбъединенный отсортированный список:");
        for (Student s : sorted) {
            System.out.println(s);
        }
    }
}
