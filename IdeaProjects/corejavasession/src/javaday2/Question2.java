package javaday2;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
        Question2 obj = new Question2();

        System.out.print("enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i;
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        System.out.println("the sorted string is: ");
        System.out.print(ch);
    }
}
