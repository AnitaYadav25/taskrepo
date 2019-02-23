package javaday2;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Seconds : ");
        int n =  sc.nextInt();

        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n =n%3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour + " " + "hours " + minutes + " " + "minutes " + seconds + " " + "seconds ");
    }

}
