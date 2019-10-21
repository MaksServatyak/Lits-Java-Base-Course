package Lesson7.Homework7;

public class Zoo {
    public int humanArr;


    public Zoo(int humanArr) {
        this.humanArr = humanArr;
    }


    public void openZoo(String human,String animal){
        System.out.println(human+"відповідальний за"+animal);

    }
    public void dinner(String human,String animal){
        System.out.println(human+"годує"+animal);

    }


}
