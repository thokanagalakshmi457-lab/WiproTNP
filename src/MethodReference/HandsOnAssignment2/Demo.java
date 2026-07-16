package MethodReference.HandsOnAssignment2;

public class Demo {
	public static void main(String[] args) {
        MyDigitCount dc = DigitCount::digitCount;
        int result = dc.count(963639);
        System.out.println("Number = 963639");
        System.out.println("Number of Digits = " + result);
    }
}