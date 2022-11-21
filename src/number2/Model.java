package number2;

public enum Model {
    SKODA("Skoda"),
    OPEL("Opel"),
    KIA("KIA"),
    HYNDAI("HYNDAI"),
    BMW("BMW");

    private final String name;
    Model(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
