package oops;

public class Main {

    public static void main(String[] args) {

        Box b1 = new Box(5, 4, 3);

        System.out.println("Width = " + b1.width);
        System.out.println("Height = " + b1.height);
        System.out.println("Depth = " + b1.depth);
        System.out.println("Volume = " + b1.getVolume());
    }
}