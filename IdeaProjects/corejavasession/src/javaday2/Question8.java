package javaday2;

import java.util.Scanner;

public class Question8 {

    public static void main(String args[]){
        String str;
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        //System.out.println(str);

        while (!str.equals("done")){

            if(str.charAt(0)==str.charAt(str.length()-1)){
                System.out.println("first character is equal to last character");
                str=sc.nextLine();
            }

        }
        System.out.println("now the example is with the do while");
        System.out.println("enter the string");
        do{
            str=sc.nextLine();
            if(str.charAt(0)==str.charAt(str.length()-1)){
                System.out.println("first character is equal to last character");

            }

        }
        while (!str.equals("done"));
    }
}

