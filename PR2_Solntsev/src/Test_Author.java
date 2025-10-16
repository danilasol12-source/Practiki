public class Test_Author {
    public static void main(String[] args) {
        // 1. Создать автора
        Author author1 = new Author("Jack London", "LondonJ@gmail.com", 'М');

        // 2. геттеры
        System.out.println("Имя автора: " + author1.getName());
        System.out.println("Почта автора: " + author1.getEmail());
        System.out.println("Пол автора: " + author1.getGender());

        // 3. сеттер почты
        author1.setEmail("JackLonnndon@gmail.com");
        System.out.println("Новая почта автора: " + author1.getEmail());

        // 4. toString()
        System.out.println("Вся информация об авторе: ");
        System.out.println(author1);
    }
}
