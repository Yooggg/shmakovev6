package number1;

public enum Month {
    JANUARY(1,"Январь"),
    FEBRUARY(2,"Февраль"),
    MARCH(3,"Март"),
    APRIL(4,"Апрель"),
    MAY(5,"Май"),
    JUNE(6,"Июнь"),
    JULY(7,"Июль"),
    AUGUST(8,"Август"),
    SEPTEMBER(9,"Сентябрь"),
    OCTOBER(10,"Октябрь"),
    NOVEMBER(11,"Ноябрь"),
    DECEMBER(12,"Декабрь");

    private final int num;
    private final String translate;

    Month(int num, String translate) {
        this.num = num;
        this.translate = translate;
    }

    @Override
    public String toString() {
        return translate;
    }
}
