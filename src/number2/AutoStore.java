package number2;

public enum AutoStore {
    CAR1(Model.SKODA.name(),Color.BLACK.name(),123,1515),
    CAR2(Model.OPEL.name(),Color.RED.name(),111,1590),
    CAR3(Model.KIA.name(),Color.GRAY.name(),150,1400),
    CAR4(Model.BMW.name(),Color.GREEN.name(),165,1900),
    CAR5(Model.HYNDAI.name(),Color.ORANGE.name(),147,1500);

    private final String model;
    private final String color;
    private final int maxSpeed;
    private final int cost;

    AutoStore(String model, String color, int maxSpeed, int cost){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Model='" + model +
                ", color='" + color +
                ", maxSpeed=" + maxSpeed +
                ", cost=" + cost;
    }

}
