package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Question1 {
    public static void main(String args[]) {
      LinkedList<Double> linkedList=new LinkedList<Double>();
      linkedList.add(2.40);
      linkedList.add(3.1);
      linkedList.add(4.9);
      linkedList.add(5.0);
      double sum=0.0;

        Iterator<Double> iterator=linkedList.iterator(); {

            System.out.println("the sum of the elements  of the list are:");
            while (iterator.hasNext()){
                 sum=sum+iterator.next();



            }
            System.out.print(sum);
        }


    }
}
