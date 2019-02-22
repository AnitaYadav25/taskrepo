package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question7 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000L);
                    System.out.println("Thread1 Running");
                    System.out.println("waiting for thread 2 to run");
                } catch (InterruptedException e) {
                    System.out.println("Throws an interrupted exception");
                }
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000L);
                    System.out.println("Thread2 Running");
                } catch (InterruptedException e) {
                    System.out.println("Throws an interrupted exception");
                }
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(2000L,TimeUnit.MILLISECONDS);


        if(executorService.isTerminated()){
            System.out.println("Terminated");
        }else{
            System.out.println("One or more tasks still remaining");
        }

    }
}
