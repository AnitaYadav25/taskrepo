package javaday2;

public class Question11 {
    public static void main(String args[]) {
        int i=0;
        int s = 0;
        int t = 1;
        int j;
        while(i<10){
            s=s+1;
            j=i;
            while(j>0){
                t = t * (j - i);
                j--;
            }
            i++;
            s = s * t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);


    }
}
