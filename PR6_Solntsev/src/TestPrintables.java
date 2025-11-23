//Для теста заданий 7-8

public class TestPrintables {
    public static void main(String[] args) {
        printable[] printables = {
                new Book("Война и мир", "Л. Н. Толстой", 1863),
                new Magazine("Хакер"),
                new Book("Отцы и дети", "И. Тургенев", 1862),
                new Magazine("Компьютерра")
        };

        System.out.println("=== Все книги ===");
        Book.printBooks(printables);

        System.out.println("\n=== Все журналы ===");
        Magazine.printMagazines(printables);

        System.out.println("\n=== Все элементы ===");
        for (printable p : printables) {
            p.print();
        }
    }
}
