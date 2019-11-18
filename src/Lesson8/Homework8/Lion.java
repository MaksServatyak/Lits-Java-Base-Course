package Lesson8.Homework8;

public class Lion implements Animals {
    @Override
    public void eat(Food food) throws ZooExeption {
        if (food.equals(Food.MEAT)) {
            System.out.println("thanks");
        } else {
            throw new ZooExeption("This animal does not eat this");
        }
    }

    @Override
    public void said(Voice voice) {
        voice.voice();
    }
}
