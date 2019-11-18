package Homework14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        List<String> linkedList = new LinkedList<>();


        var list1 = new ArrayList<String>();
        Homework14.ArrayList arrayList = new Homework14.ArrayList();
        arrayList.fillList(100000);


        arrayList.randomPutElment();


        Homework14.LinkedList linkedList1 = new Homework14.LinkedList();
        linkedList1.fillList(100000);


        linkedList1.randomPutElment();

        Queue fifoQueue = new FIFOQueue();
        Queue lifoQueue = new LIFOQueue();

        fifoQueue.add("person");
        fifoQueue.add("person");
        fifoQueue.getFirst();
        fifoQueue.removeFirst();

        lifoQueue.add("person");
        lifoQueue.add("person");
        lifoQueue.getLast();
        lifoQueue.removeLast();


    }
}
