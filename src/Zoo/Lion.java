package Zoo;

class Lion implements Animals {
    @Override
    public void eat(Food food) throws ZooExeptions {
        if (food.equals(Food.MEAT)) {
            System.out.println("thanks");
        } else {
            throw new ZooExeptions("This animal does not eat this");
        }
    }

    @Override
    public void said(Voice voice) {
        voice.voice();
    }
}
