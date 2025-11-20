public class Main {
    public static void main(String[] args) {

        Seasons MyFav = Seasons.summer;
        System.out.println("Любимое время года: " + MyFav + ", средняя температура: " +
                MyFav.getAvgTemp() + ", описание: " + MyFav.getInfo());

        MyFav.FavouriteS(MyFav);

        System.out.println("Все времена года:");
        for (Seasons s : Seasons.values()){
            System.out.println(s + ", средняя температура: " +
                    s.getAvgTemp() + ", описание: " + s.getInfo());
        }
    }
}