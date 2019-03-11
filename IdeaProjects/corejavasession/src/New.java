import java.util.Scanner;

public class New {
    public static void main(String args[]){
        String str="anitayadav";
        String str1="";
        for (int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
StringBuffer buffer=new StringBuffer(str1);
buffer.delete(4,9);
        System.out.println(buffer);
    }
    }

