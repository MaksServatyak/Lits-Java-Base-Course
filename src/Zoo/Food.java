package Zoo;

 enum Food {
    BANANAS("bananas", "Monkey"),
    APPLE("apple", "Horse"),
    MEAT("meat", "Lion");


    public final String name;

    Food(String name, String eatenBy) {
        this.name = name;
        this.eatenBy = eatenBy;
    }
    public final String eatenBy;

}
