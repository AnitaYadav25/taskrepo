package Main;

import java.util.Arrays;

public class Assignment2file {
    //Question1
    public void Question1(){

    }

   //Question2
   public void Question2(String s){
        int i;
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
       System.out.println("Output of question2");
        System.out.print("the sorted string is");
        System.out.print(ch);
       System.out.println("----------------");
    }
    public void Question3(){

    }
    public void Question4(){

    }
    public void Question5(){

    }
    public void Question6(){


    }
   //Question7  WAP to convert seconds into days, hours, minutes and seconds.
    public void Question7(int seconds){
        int hours;
        int minutes;
        hours=seconds/3600;
        minutes=seconds%3600;
        System.out.print(hours+minutes);

    }

}
