package Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {
    Human[] humans = {new Human("Robin", 18, "Horse"),
            new Human("Oliver", 27, "Monkey"),
            new Human("Max", 23, "Lion")};

    void open(String animal, String humanName) {
        int i = findHuman(humanName);


    }

    void dinner(String name, Food food) {
        int i = findHuman(name);


    }

    private int findHuman(String name) {
        for (var i = 0; i < humans.length; i++) {
            if (humans[i].name == name) {
                return i;
            }
        }
        return 0;


    }

    public void console() throws IOException {
        Zoo zoo = new Zoo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your name:");
        String name = br.readLine();
        System.out.println("Welcome " + name);
        System.out.println();
        System.out.println("Please enter your animal:");
        System.out.println("Horse");
        System.out.println("Monkey");
        System.out.println("Lion");
        String animal = br.readLine();
        System.out.println("Your animal is " + animal);
        System.out.println();

        while (true) {
            System.out.println("Chose action:");
            System.out.println("open");
            System.out.println("dinner");
            System.out.println("exit");
            String action = br.readLine();
            if ("exit".equals(action)) {
                System.out.println("goodbye");
                break;
            } else if ("open".equals(action)) {
                zoo.open(animal, name);
                System.out.println("Zoo is open");
                System.out.println();
            } else if ("dinner".equals(action)) {
                System.out.println("choose food for animal:");
                String food = br.readLine();

                if (animal.equals(Food.MEAT.eatenBy) && food.equals(Food.MEAT.name)) {
                    zoo.dinner(name, Food.MEAT);
                    System.out.println("good choice");
                    System.out.println();
                    Lion lion = new Lion();
                    lion.said(new Voice() {
                        @Override
                        public void voice() {
                            System.out.println("Hrrrrr");
                        }
                    });
                    System.out.println();
                } else if (animal.equals(Food.BANANAS.eatenBy) && food.equals(Food.BANANAS.name)) {
                    zoo.dinner(name, Food.BANANAS);
                    System.out.println("good choice");
                    System.out.println();
                    Monkey monkey = new Monkey();
                    monkey.said(new Voice() {
                        @Override
                        public void voice() {
                            System.out.println("Uauauauaua");
                        }
                    });
                    System.out.println();


                } else if (animal.equals(Food.APPLE.eatenBy) && food.equals(Food.APPLE.name)) {
                    zoo.dinner(name, Food.APPLE);
                    System.out.println("good choice");
                    System.out.println();
                    Horse horse = new Horse();
                    horse.said(new Voice() {
                        @Override
                        public void voice() {
                            System.out.println("Igogo");
                        }
                    });
                    System.out.println();
                } else {
                    System.out.println("bad choice");
                    System.out.println();
                }

            } else {
                System.out.println(name + " does not know this command " + action);
                System.out.println();
            }
        }
    }


}
