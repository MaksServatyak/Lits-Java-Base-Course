package Homework14;

import java.util.List;

public class Iterator{
    List<String> list= new java.util.ArrayList();
    public void iterator(){
        list.add("qwerty");
        list.add("qwerty");
        list.add("qwerty");

        java.util.Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


}
