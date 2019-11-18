package Lesson8.Homework8;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.said(new Voice() {
            @Override
            public void voice() {
                System.out.println("Hrrrrr");
            }
        });

        Monkey monkey = new Monkey();
        monkey.said(new Voice() {
            @Override
            public void voice() {
                System.out.println("Uauauauaua");
            }
        });


        Horse horse =new Horse();
        horse.said(new Voice() {
            @Override
            public void voice() {
                System.out.println("Igogo");
            }
        });


    }
}
