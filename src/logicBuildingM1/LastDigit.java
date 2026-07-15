package logicBuildingM1;

public class LastDigit {

    public static int getLastDigit(int num) {

        return Math.abs(num % 10);

    }

    public static void main(String[] args) {

        System.out.println(getLastDigit(197));
        System.out.println(getLastDigit(-197));
        System.out.println(getLastDigit(0));
        System.out.println(getLastDigit(1234));

    }
}