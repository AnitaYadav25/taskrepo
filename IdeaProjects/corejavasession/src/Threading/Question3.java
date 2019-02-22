package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question3 {

    public static void main(String[] args) {
        System.out.println("submitting thread using executorservice class");
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
                    System.out.println("will sleep for three sec for thread3 to execute");
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException e) {
//                    e.printStackTrace();
                    }
                    System.out.println("Thread 3");
                }
            });

        }
        catch (Exception e){

        }


    }
}




