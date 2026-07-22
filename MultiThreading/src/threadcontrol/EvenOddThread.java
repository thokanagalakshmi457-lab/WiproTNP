package threadcontrol;

class EvenThread extends Thread {

    public void run() {

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddThread extends Thread {

    public void run() {

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class EvenOddThread {

    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        try {

            // Start even thread first
            even.start();

            // Wait until even thread completes
            even.join();

            // Start odd thread after even completes
            odd.start();

            // Wait until odd thread completes
            odd.join();

        } catch (InterruptedException e) {

            System.out.println(e);
        }
    }
}