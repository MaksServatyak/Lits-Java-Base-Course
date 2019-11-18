package Lesson12.Homewrok12;

public class Main {
    public static void main(String[] args) {
        StackOverflow stackOverflow=new StackOverflow();
        stackOverflow.recursionFunction();

        NameOfDrinks nameOfDrinks=new NameOfDrinks();
        Bottle<NameOfDrinks> bottle = new Bottle();
        bottle.setBottle(nameOfDrinks.pepsi);
    }


}
