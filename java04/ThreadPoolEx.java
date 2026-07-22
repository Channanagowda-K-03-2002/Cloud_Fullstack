package java04;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " is starting.");
                try {
                    Thread.sleep(2000); // Simulate some work with sleep
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " was interrupted.");
                }
                System.out.println("Task " + taskId + " has completed.");
            });
        }

        executorService.shutdown();
    }
}