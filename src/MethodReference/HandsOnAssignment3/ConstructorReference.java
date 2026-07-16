package MethodReference.HandsOnAssignment3;

public class ConstructorReference {
	public static void main(String[] args) {
        MyPrime mp = PrimeCheck::new;
        mp.check(29);
        mp.check(20);
        mp.check(13);   
    }
}