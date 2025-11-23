//Задание 4

import static java.lang.Math.*;
public class MathFunc implements MathCalculable{

    public double power(double base, double exp) {
        return pow(base, exp);
    }
    public double complexModul(double R, double i) {
        return sqrt(pow(R, 2) + pow(i, 2));
    }
    public double circleLen(double radius) {
        return 2 * PI * radius;
    }
    public double circleArea(double radius) {
        return PI * power(radius, 2);
    }
}
