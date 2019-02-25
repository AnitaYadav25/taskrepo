package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class Question3  {
    public static void main(String args[]){
        HashMap<Character,Integer> count=new HashMap<>();
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("the occurances of each character is");
        char []ch=str.toCharArray();
        for(char c:ch){
            if(count.containsKey(c)){
                count.put(c,((count.get(c))+1));
            }
            else{
                count.put(c,1);
            }

        }
        System.out.println(count);


    }
}
