public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //геттеры
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    // сеттер для почты
    public void setEmail(String email) {
        this.email = email;
    }

    // Метод для полного вывода информации об авторе
    public String toString() {
        // Формируем строку так, как Вы просили в задании
        return name + " (" + gender + ") at " + email;
    }
}

