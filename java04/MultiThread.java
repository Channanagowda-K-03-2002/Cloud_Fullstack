package java04;

class Task extends Thread {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is starting.");
        try {
            Thread.sleep(2000); // Simulate some work with sleep
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted.");
        }
        System.out.println(taskName + " has completed.");
    }
}

class Counter implements Runnable {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        // Thread task1 = new Task("Task 1");
        // Thread task2 = new Task("Task 2");
        // Thread task3 = new Task("Task 3");
        Counter counter = new Counter();
        Thread counterThread = new Thread(() -> {
            counter.increment();
            System.out.println("Counter value: " + counter.getCount());
        });
        counterThread.start();

        // task1.start();
        // task2.start();
        // task3.start();
    }
}
