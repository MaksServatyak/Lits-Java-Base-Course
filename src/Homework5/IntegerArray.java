package Homework5;

public class IntegerArray extends Array {
    public IntegerArray(int size) {
        super(size);
    }

    public int[] sumElemensFromArray() {
        var sum = 0;
        for (int element : arr) {
            sum = element + sum;
        }
        return arr;
    }

    public int[] averageArray() {
        var sum = 0;
        var number = 0;
        for (int element : arr) {
            sum = element + sum;
            number++;
        }
        var averege = sum / number;
        return arr;
    }

    public int[] sumPairedElements() {
        var sum = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                sum=element+sum;
            }
        }
        return arr;
    }


}
