package Homework5;

import java.util.Random;

public class Array {
    public int[] arr;

    public Array(int size){
        this.arr=new int[size];
    }


    public void fillArray() {
        for (int index = 0; index < arr.length; index++) {
            arr[index] = new Random().nextInt(100);
        }
    }

    public void printArray() {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public int[] getSumElementsFromNotPairedIndeks() {
        var sum = 0;
        for (int index = 0; index < arr.length - 1; index++) {
            if (index % 2 != 0) {
                sum=sum+arr[index];

            }
        }
        return arr;

    }


}
