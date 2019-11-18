package Homework14;

import java.util.List;

public class LIFOQueue implements Queue {
    List<String> queue= new java.util.ArrayList();
    @Override
    public void add(String person) {

        if (queue.size()==0){
            queue.add(person);
        }else {
        queue.add(queue.size()-1,person);
        }

    }

    @Override
    public void getFirst() {
        queue.get(0);

    }

    @Override
    public void getLast() {
        queue.get(queue.size()-1);

    }

    @Override
    public void removeFirst() {
        queue.remove(0);

    }

    @Override
    public void removeLast() {
        queue.remove(queue.size()-1);

    }
}
