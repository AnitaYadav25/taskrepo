package Collection;

import java.util.*;

class Question4{
    double salary;
    double age;
    String name;

Question4(double salary,double age,String name){
    this.salary = salary;
    this.name=name;
    this.age=age;
}
    public double getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public static void main(String args[]) {



        ArrayList<Question4> arr = new ArrayList<>();
        Question4 obj1=new Question4(25000,22,"anita");
        arr.add(obj1);
        Question4 obj2=new Question4(22000,23,"namrata");
        arr.add(obj2);
        arr.add(new Question4(21000,22,"sweta"));
        arr.add(new Question4(27000,22,"nita"));


       Collections.sort(arr,new Sortby());
        //System.out.println(arr);
        Iterator<Question4> iterator=arr.iterator();

        while (iterator.hasNext()) {
            Question4 e = iterator.next();
            System.out.println(e.getName()+" "+e.getSalary()+" "+e.getAge());

        }


//        while (iterator.hasNext()) {
//            Question4 e = iterator.next();
//            System.out.println(e.getName()+e.getSalary()+e.getAge());
//
//        }
//for(int i=0;i<arr.size();i++){
//    System.out.println(arr.get(i));
//}

    }
    }


