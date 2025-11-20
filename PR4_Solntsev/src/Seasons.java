public enum Seasons {
    winter(-10.0),
    spring(13.0),
    summer(25.0),
    autumn(8.0);

    private final double avgTemp;

    Seasons(double avgTemp){
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public String getInfo(){
        if (this == summer){
            return "Тёплое время года";
        }
        return "Холодное время года";
    }

    public void FavouriteS(Seasons s){
        switch(s){
            case summer -> {
                System.out.println("Я люблю лето");
                break;
            }
            case winter -> {
                System.out.println("Я люблю зиму");
                break;
            }
            case spring -> {
                System.out.println("Я люблю весну");
                break;
            }
            case autumn -> {
                System.out.println("Я люблю осень");
                break;
            }
        }

    }
}