package Lesson6;

public enum Cars {
    AUDI(1, "Germany", "g44484455gd"),
    FORD(2, "USA", "6d5g6g4d"),
    BMW(3, "Germany", "g4d35"),
    OPEL(4, "Germany", "44dsg"),
    TOYOTA(5, "Japan", "8r8rr8"),
    SUZUKI(6, "Japan", "4548rre"),
    SUBARU(7, "Japan", "75fddf"),
    RENO(8, "France", "88e8e8dd"),
    HONDA(9, "Japan", "8e88e8e"),
    JAGUAR(10, "Italy", "f5rf5f5");

    int id;
    String country;
    String cod;

    Cars(int id, String country, String cod) {
        this.id = id;
        this.country = country;
        this.cod = cod;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCod() {
        return cod;
    }



    public static Cars findById(int id) {
        for(Cars a : values()) {
            if(a.getId() == id) {
                return a;
            }
        }
        throw new IllegalArgumentException();
    }
    public static Cars findByCountry(String country) {
        for(Cars a : values()) {
            if(a.getCountry() == country) {
                return a;
            }
        }
        throw new IllegalArgumentException();
    }
    public static Cars findByCod(String cod) {
        for(Cars a : values()) {
            if(a.getCod() == cod) {
                return a;
            }
        }
        throw new IllegalArgumentException();
    }
}

