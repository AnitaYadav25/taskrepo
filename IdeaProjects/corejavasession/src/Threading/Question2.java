package Threading;
//Question2
public class Question2 implements Runnable{
    @Override
    public void run() {
    try {
        int i;
        for(i=0;i<=5;i++){
            Thread.sleep(2000L);

            System.out.println(i);
        }

    }
    catch (Exception e){
        System.out.print("aa");

    }

    }
    public static void main(String args[]) {

        Thread t1=new Thread(new Question2());
        Thread t2 = new Thread(new Question2());
        System.out.println("Output of question2");
        System.out.println("------------");
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println("sss");
        }
        System.out.println("thread 2 is running now");
        t2.start();
    }



}
