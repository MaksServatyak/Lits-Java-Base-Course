package Lesson6;

public class Sum implements Operation {
    @Override
    public double calculate(long a, long b) {
        return (a + b);
    }
}
