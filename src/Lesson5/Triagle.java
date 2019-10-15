package Lesson5;

public class Triagle extends Figure {
   public double a;
   public double b;
   public double c;

    public Triagle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int perimetr() {
        return super.perimetr();
    }

    @Override
    public double area() {

        return a * b * c;


    }
}
