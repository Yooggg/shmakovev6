package number1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println(Month.JANUARY);
            case 2 -> System.out.println(Month.FEBRUARY);
            case 3 -> System.out.println(Month.MARCH);
            case 4 -> System.out.println(Month.APRIL);
            case 5 -> System.out.println(Month.MAY);
            case 6 -> System.out.println(Month.JUNE);
            case 7 -> System.out.println(Month.JULY);
            case 8 -> System.out.println(Month.AUGUST);
            case 9 -> System.out.println(Month.SEPTEMBER);
            case 10 -> System.out.println(Month.OCTOBER);
            case 11 -> System.out.println(Month.NOVEMBER);
            case 12 -> System.out.println(Month.DECEMBER);
            default -> System.out.println("Вы ввели не верное число");
        }
    }
}
