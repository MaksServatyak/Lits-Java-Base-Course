package Lesson4;

import java.util.Random;

public class Array {
    public int[] arr;

    public Array(int size) {
        this.arr = new int[size];
    }

    public void sort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public void printPairedElements() {
        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }

    public void printElementsFromNotPairedIndeks() {
        for (int index = 0; index < arr.length - 1; index++) {
            if (index % 2 != 0) {
                System.out.println(arr[index]);
            }
        }

    }

    public int[] getSortedArray() {
        sort();
        return arr;
    }

    public void swapPairElements(int argument) {
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index] % 2 == 0) {
                arr[index] = argument;
            }

        }

    }

    public void fillArray() {
        for (int index = 0; index < arr.length ; index++) {
            arr[index] = new Random().nextInt(100);
        }
    }

    public void printArray() {
        for (int element : arr) {
            System.out.println(element);
        }
    }

}
