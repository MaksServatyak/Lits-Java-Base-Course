package Lesson8.Homework8;

public enum Food {

     BANANAS("bananas", "Monkey"),
    APPLE("apple", "Horse"),
    MEAT("meat", "Lion");


     public final String name;

    Food(String name, String eatenBy) {
        this.name = name;
        this.eatenBy = eatenBy;
    }
    public final String eatenBy;

    public static class Main {
        public static void main(String[] args) {
            var lion=new Lion();
        }
    }
}
