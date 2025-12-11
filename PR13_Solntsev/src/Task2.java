import java.util.Comparator;
import java.util.Arrays;

public class Task2 {
    static class SortingStudentsByGPA implements Comparator<Student> {

        public int compare(Student s1, Student s2) {
            return Double.compare(s2.getGPA(), s1.getGPA()); // По убыванию
        }
    }
    public static void main(String[] args) {
        Student[] students = Students.getStudents();

        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("После сортировки по GPA (убывание):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
