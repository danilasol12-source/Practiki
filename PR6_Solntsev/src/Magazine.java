//Задание 7

public class Magazine implements printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Журнал " + name);
    }

    public static void printMagazines(printable[] printable) {
        for (printable p : printable) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }
    public String getName() { return name; }
}
