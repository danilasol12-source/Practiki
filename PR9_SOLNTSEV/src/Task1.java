public class Task1 {


    //Код из задания
    public class F {
        int i;
        static String s;
        void imethod() {
        }
        static void smethod() {
        }
    }



    //Допустимые команды:
    /*
    System.out.println(f.i);
    System.out.println(f.s);
    f.imethod();
    f.smethod();
    System.out.println(F.s);
    F.smethod();



    Недопустимые команды:
    System.out.println(F.i);  (i — не статическое)
    F.imethod();  (нестатический метод нельзя вызвать от класса)
     */


}
