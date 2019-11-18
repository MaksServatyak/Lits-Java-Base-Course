package Lesson8.Homework8;

public class Zoo {

    Human[] humans={new Human("Robin",18,"Horse"),
            new Human("Oliver",27,"Monkey"),
            new Human("Max",23,"Lion")};

    void open(Animals animal,String humanName){
        int i = findHuman(humanName);


    }
    void dinner(String name,Food food){
        int i = findHuman(name);


    }
    private int findHuman(String name){
        for(var i=0;i<humans.length;i++){
            if(humans[i].name==name){return i;}
        }
        return 0;
    }

}
