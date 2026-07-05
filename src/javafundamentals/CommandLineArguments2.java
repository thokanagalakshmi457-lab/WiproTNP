package javafundamentals;

public class CommandLineArguments2 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please provide one command line argument");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}