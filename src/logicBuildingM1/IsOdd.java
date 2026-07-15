package logicBuildingM1;

public class IsOdd {

    public static int isOdd(int num) {

        if (num % 2 != 0) {
            return 2;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        System.out.println(isOdd(7));
        System.out.println(isOdd(10));
        System.out.println(isOdd(0));
        System.out.println(isOdd(-5));
        System.out.println(isOdd(-8));

    }
}