package Homework14;

import java.util.List;
import java.util.Random;

public class ArrayList {
    int size;
    List<String> list= new java.util.ArrayList();
    public void fillList(int size){
        this.size=size;
        while (list.size()<size){
            list.add("qwerty");
           // System.out.println(list.size());
        }
    }
    public void randomPutElment(){
        int i=0;
        while (i<100000){
            System.out.println("#"+ i + " " +list.get(new Random().nextInt(100000)));
            i++;
        }
    }
}
