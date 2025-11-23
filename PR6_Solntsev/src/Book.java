//Задание 8

public class Book implements printable {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void print() {
        System.out.println("Книга " + name + "(автор " + author + ") " +
                "была издана в " + year) ;
    }

    public static void printBooks(printable[] printable) {
        for (printable p : printable) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }

    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
}
