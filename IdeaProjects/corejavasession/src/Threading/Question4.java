package Threading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Question4 {


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
System.out.println("thread3");
                        for(int i=0;i<5;i++) {


                            if (Thread.currentThread().isInterrupted())
                                System.out.print("Shoutnowdown is used");
                        }
                    }
                });

            }
            finally {
                executorService.shutdownNow();



            }

           // System.out.println(executorService.isShutdown());
            //this will shoutdown the entire process


        }
    }
