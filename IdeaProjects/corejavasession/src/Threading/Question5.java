package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question5 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.print("thread3");
                        for(int i=0;i<5;i++) {
                           // System.out.println("Thread 3");

                            if (Thread.currentThread().isInterrupted())
                                System.out.println("exception is present");
                        }


                }                                                                                   
            });
        } finally {
            executorService.shutdownNow();
        }

        System.out.println("the value of isShutdown is : "+executorService.isShutdown());
        System.out.println("the value of is terminated is : "+executorService.isTerminated());

    }
}
