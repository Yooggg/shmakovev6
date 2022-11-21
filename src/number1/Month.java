package number1;

public enum Month {
    JANUARY(1,"Январь"),
    FEBRUARY(2,"Февраль"),
    MARCH(2,"Март"),
    APRIL(2,"Апрель"),
    MAY(2,"Май"),
    JUNE(2,"Июнь"),
    JULY(2,"Июль"),
    AUGUST(2,"Август"),
    SEPTEMBER(2,"Сентябрь"),
    OCTOBER(2,"Октябрь"),
    NOVEMBER(2,"Ноябрь"),
    DECEMBER(2,"Декабрь");

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
