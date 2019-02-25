package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Question5 {
    String name;
    double score;
    double age;
Question5(String name,double score,double age){
    this.name = name;
    this.score=score;
    this.age=age;
}
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public double getAge() {
        return age;
    }
    public static  void main(String args[]){
       Question5 e1=new Question5("anita",85,22);
       Question5 e2=new Question5("namrata",80,22);
       Question5 e3=new Question5("sweta",80,22);
       Question5 e4=new Question5("xyz",89,22);
       Question5 e5=new Question5("anitayadav",90,22);
       Question5 e6=new Question5("vineeta",82,22);
       Question5 e7=new Question5("vinu",87,22);
       List<Question5> arr=new ArrayList<>();


       arr.add(e1);
       arr.add(e2);
       arr.add(e3);
       arr.add(e4);
       arr.add(e5);
       arr.add(e6);
       arr.add(e7);


        Collections.sort(arr,new Studentsort());
        Iterator<Question5> iterator=arr.iterator();
        while(iterator.hasNext()){
            Question5 e = iterator.next();
            System.out.println(e.getName()+e.getAge()+e.getScore());
        }
    }
}






