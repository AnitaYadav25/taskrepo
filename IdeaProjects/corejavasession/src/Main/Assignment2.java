package Main;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String args[]) {
        Assignment2file obj = new Assignment2file();
        obj.Question1();
        System.out.print("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        obj.Question2(str);
        obj.Question3();
        obj.Question4();
        obj.Question5();
        obj.Question6();
        System.out.println("enter the seconds");
        int sec=sc.nextByte();
        obj.Question7(sec);


    }
}
