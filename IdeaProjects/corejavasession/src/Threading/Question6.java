package Threading;

import java.util.concurrent.*;
import java.util.*;

public class Question6 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });

        executorService.shutdown();

        if (integerFuture.isDone()) {
            System.out.println("your task will now be done the value is");
            System.out.println(integerFuture.get());
        }
        //this will cancel the current process
//        if(integerFuture.isCancelled()){
//            System.out.println("Your task has been cancelled");
//        }

    }
}
