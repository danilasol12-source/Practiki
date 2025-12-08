public class Task5 {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random() * 10);
        }

        Circle maxCircle = circles[0];
        for (Circle c : circles) {
            if (c.getArea() > maxCircle.getArea()) {
                maxCircle = c;
            }
        }

        System.out.println("Круг с наибольшей площадью: радиус = "
                + maxCircle.getRadius() + ", площадь = " + maxCircle.getArea());
    }
}
