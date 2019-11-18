package Homework14;

import java.util.List;
import java.util.Random;

public class LinkedList {
    List<String> linkedList = new java.util.LinkedList<>();
    int size;
    public void fillList(int size){
        this.size=size;
        while (linkedList.size()<size){
            linkedList.add("qwerty");
          //  System.out.println(linkedList.size());

        }

    }
    public void randomPutElment(){
        int i=0;
        while (i<100000){
            System.out.println("#"+ i + " " +linkedList.get(new Random().nextInt(100000)));
            i++;
        }
    }
}
