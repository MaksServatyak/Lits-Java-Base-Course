package Lesson6;

import static java.lang.Math.pow;

public class Power implements Operation {
    @Override
    public double calculate(long a, long b) {
        return (pow(a,b));
    }
}
