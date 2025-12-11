class Students {
    public static Student[] students = {
            new Student(5, "Иван", 4.2),
            new Student(3, "Василий", 4.4),
            new Student(21, "Владимир", 4.1),
            new Student(22, "Светлана", 4.5),
            new Student(23, "Константин", 3.4),
            new Student(26, "Анастасия", 4.3),
            new Student(27, "Артем", 4.6),
            new Student(35, "Федор", 3.5),
            new Student(36, "Валентина", 4.8),
            new Student(37, "Станислав", 4.3),
            new Student(38, "Галина", 4.6),
            new Student(39, "Вячеслав", 3.7),
            new Student(11, "Александр", 4.3),
            new Student(12, "Наталья", 4.6),
            new Student(13, "Алексей", 3.8),
            new Student(32, "Людмила", 4.4),
            new Student(2, "Мария", 4.8),
            new Student(8, "Петр", 3.9),
            new Student(1, "Анна", 4.5),
            new Student(14, "Татьяна", 4.7),
            new Student(15, "Михаил", 4.0),
            new Student(16, "Екатерина", 4.4),
            new Student(40, "Зоя", 4.9),
            new Student(41, "Григорий", 4.0),
            new Student(42, "Лидия", 4.5),
            new Student(43, "Леонид", 3.8),
            new Student(4, "Кирилл", 4.8),
            new Student(28, "Ксения", 4.0),
            new Student(29, "Роман", 3.8),
            new Student(30, "Виктория", 4.7),
            new Student(31, "Георгий", 4.2),
            new Student(6, "Елена", 4.1),
            new Student(7, "Дмитрий", 3.7),
            new Student(9, "Ольга", 4.9),
            new Student(10, "Сергей", 3.5),
            new Student(17, "Андрей", 3.9),
            new Student(18, "Юлия", 4.2),
            new Student(19, "Павел", 3.6),
            new Student(20, "Ирина", 4.8),
            new Student(33, "Борис", 3.9),
            new Student(34, "Евгения", 4.1),
            new Student(24, "Марина", 4.9),
            new Student(25, "Николай", 3.7),
    };
    public static Student[] getStudents() {
        return students;
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', gpa=" + gpa + "}";
    }
}
