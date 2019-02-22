package Threading;
//Question1 Create and Run a Thread using Runnable Interface and Thread

public class Question1 implements Runnable {

    @Override
    public void run() {
        System.out.print("runnable thread is running");

    }


        public static void main(String args[]){
            Thread obj=new Thread(new Question1());
            obj.start();





        }
    }

