package Lesson12.Homewrok12;

public class Bottle<T extends NameOfDrinks> {
    T bottle;


    public void setBottle(T nameOfDrinks) {
        this.bottle = nameOfDrinks;
        System.out.println(bottle);
    }

}
