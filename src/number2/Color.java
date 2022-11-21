package number2;

public enum Color {
    RED("Красный"),
    GREEN("Зеленый"),
    ORANGE("Оранжевый"),
    GRAY("Серый"),
    BLACK("Черный");

    private final String name;
    Color(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
