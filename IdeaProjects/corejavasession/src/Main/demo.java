package Main;

import java.util.Arrays;

public class demo {
    public static void main(String args[]){
        int[] arr=new int[]{10,20,20,10,10,30,50,10,20,20};
        int store=0;int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    store=store+1;

                    System.out.println(store+" "+i);
                }
                count=(store/2);
                store=0;

            }


        }
        System.out.println(count);
    }
}
