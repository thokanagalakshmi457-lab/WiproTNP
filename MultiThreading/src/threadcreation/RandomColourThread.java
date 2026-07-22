package threadcreation;

import java.util.Random;

class ColourTask implements Runnable {

    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                break;
            }
        }
    }
}

public class RandomColourThread {

    public static void main(String[] args) {

        ColourTask task = new ColourTask();

        Thread t = new Thread(task);

        t.start();
    }
}