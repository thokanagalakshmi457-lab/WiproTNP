package threadcreation;

class MyThread extends Thread {

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class ThreadCreation {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Assigning names to threads
        t1.setName("Scooby");
        t2.setName("Shaggy");

        // Starting threads
        t1.start();
        t2.start();
    }
}