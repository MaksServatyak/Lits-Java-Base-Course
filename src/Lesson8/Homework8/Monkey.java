package Lesson8.Homework8;

public class Monkey implements Animals {
    @Override
    public void eat(Food food) throws ZooExeption {
        if (food.equals(Food.BANANAS)) {
            System.out.println("sanks");
        } else {
            throw new ZooExeption("This animal do not eat this");
        }
    }

    @Override
    public void said(Voice voice) {
        voice.voice();
    }
}
