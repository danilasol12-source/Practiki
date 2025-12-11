import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    // Собственная реализация сравнения:
    // Сначала сравниваем по автору, затем по названию, затем по году
    @Override
    public int compareTo(Book other) {
        int authorCompare = this.author.compareTo(other.author);
        if (authorCompare != 0) {
            return authorCompare;
        }

        int titleCompare = this.title.compareTo(other.title);
        if (titleCompare != 0) {
            return titleCompare;
        }

        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author +
                "', year=" + year + ", price=" + price + "}";
    }
}

class Library {
    private static Book[] books = {
            new Book("Война и мир", "Толстой Л.Н.", 1869, 1200.0),
            new Book("Преступление и наказание", "Достоевский Ф.М.", 1866, 850.0),
            new Book("Анна Каренина", "Толстой Л.Н.", 1877, 950.0),
            new Book("Идиот", "Достоевский Ф.М.", 1869, 800.0),
            new Book("Отцы и дети", "Тургенев И.С.", 1862, 700.0)
    };

    public static Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }
}

public class Task4 {
    public static void main(String[] args) {
        // Демонстрация работы со студентами
        Student[] students = Students.getStudents();
        Arrays.sort(students);

        System.out.println("Студенты, отсортированные по ID:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Демонстрация работы с книгами
        Book[] books = Library.getBooks();
        Arrays.sort(books);

        System.out.println("\nКниги, отсортированные по автору, названию и году:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Сравнение эффективности сортировок
        System.out.println("\nСравнение эффективности:");
        System.out.println("Количество студентов: " + students.length);
        System.out.println("Количество книг: " + books.length);
    }
}