package threadcontrol;

class PriorityThread extends Thread {

    public void run() {

        System.out.println("Thread Name: " + Thread.currentThread().getName()
                + " Priority: " + Thread.currentThread().getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() 
                    + " is running");
        }

        System.out.println(Thread.currentThread().getName() + " completed");
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setName("MAX_PRIORITY_THREAD");
        t2.setName("NORM_PRIORITY_THREAD");
        t3.setName("MIN_PRIORITY_THREAD");

        t1.setPriority(Thread.MAX_PRIORITY);     
        t2.setPriority(Thread.NORM_PRIORITY);    
        t3.setPriority(Thread.MIN_PRIORITY);    

        t1.start();
        t2.start();
        t3.start();
    }
}