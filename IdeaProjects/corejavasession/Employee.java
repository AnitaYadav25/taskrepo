package Main;

public class Employee {
    String name;
    String empid;
    String salary;
    static int age;
    //no arg constructer
    Employee(){
        this.empid="3204";
        this.name="namrata";
    }
    Employee(String empid,String name){
        this.empid=empid;
        this.name=name;


    }
    public  void attendence(){
        System.out.println("attendence of "+" "+getName()+" "+"is marked");


    }
    public void work(){

        System.out.println("salary of "+" "+getName()+" is "+getSalary());

    }
    public void leave(){
        System.out.println(getEmpid()+"employee left");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getSalary() {
        return salary;
    }


    public static int setage(){

        return age;
    }

    public static int getage(){
return age;
    }
}
