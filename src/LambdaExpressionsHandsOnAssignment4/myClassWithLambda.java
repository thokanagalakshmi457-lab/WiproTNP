package LambdaExpressionsHandsOnAssignment4;

public class myClassWithLambda {
	 public static void main(String[] args) {
	        String str = "Flowers bloom beautifully during spring season";
	        WordCount wc = s -> s.trim().split("\\s+").length;
	        int result = wc.count(str);
	        System.out.println("String: " + str);
	        System.out.println("Number of Words: " + result);
	    }
}