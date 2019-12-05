package Zoo;

public class Monkey implements Animals {
    @Override
    public void eat(Food food) throws ZooExeptions {
        if (food.equals(Food.BANANAS)) {
            System.out.println("sanks");
        } else {
            throw new ZooExeptions("This animal do not eat this");
        }
    }

    @Override
    public void said(Voice voice) {
        voice.voice();
    }
}
