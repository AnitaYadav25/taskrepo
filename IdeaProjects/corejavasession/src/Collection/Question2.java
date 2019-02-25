package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        hashMap.put(4, "D");
        hashMap.put(5, "A");
        hashMap.put(6, "E");
        hashMap.put(7, "Z");
        System.out.println("the string is");

        System.out.println(hashMap.values());
        //hashMap.put(7, "E");
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        char[] ch=str.toCharArray();



        System.out.println("the no. of unique character in a strings are");
        for (Object key1 : hashMap.keySet()) {

            for (Object key2 : hashMap.keySet()) {
                if (!key1.toString().equals(key2.toString())) {
                    String x = hashMap.get(key1);
                    //System.out.println(x);
                    String y = hashMap.get(key1);
                    if (x==y){
                        hashMap.remove(key1);
                        hashMap.remove(key2);

                    }
                    System.out.println(hashMap.size());


                }


            }


        }


    }
}