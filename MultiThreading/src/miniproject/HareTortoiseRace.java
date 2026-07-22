package miniproject;

class RaceThread extends Thread {

    static boolean raceOver = false;

    public RaceThread(String name) {
        super(name);
    }

    public void run() {

        int distance = 0;

        for (distance = 1; distance <= 100; distance++) {

            if (raceOver) {
                break;
            }

            System.out.println(getName() + " covered " + distance + " meters");

            if (getName().equals("Hare") && distance == 60) {
                try {
                    System.out.println("Hare is taking rest...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        if (!raceOver) {
            raceOver = true;
            System.out.println(getName() + " won the race!");
        }
    }
}


public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

  
        hare.setPriority(Thread.MAX_PRIORITY);      
        tortoise.setPriority(Thread.MIN_PRIORITY);  

        hare.start();
        tortoise.start();
    }
}