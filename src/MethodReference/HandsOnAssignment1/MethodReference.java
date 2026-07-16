package MethodReference.HandsOnAssignment1;

public class MethodReference {
	public static void main(String[] args) {
        Factorial obj = new Factorial();
        MyFactorial mf = obj::factorial;
        int result = mf.calculate(6);
        System.out.println("Factorial = " + result);
    }
}