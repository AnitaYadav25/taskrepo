package Main;
import java.util.Scanner;

public class Qmain10 {
    public static void main(String args[]) {
        Q10 obj = new Q10();
        obj.add(10, 20);
        obj.add(2000000.9092, 500000.90);
        obj.multiply(20, 30);
        obj.multiply(1.2, 4.1);
        obj.concat("string1", "strin2");
        obj.concat("string1", "string2", "string3");
        obj.Calculatepercentage("Anita@123");
        obj.Question8("anita123456");
        obj.Question6();
        obj.Question5();
        obj.Question2("HelloWorld of To To To The New New New ");
        obj.Question3("Hello", "l");
        System.out.println("----------------");

        System.out.println("Output of question1");
        System.out.println("Enter the string ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Enter the substring ");
        String sub = scanner.nextLine();
        System.out.println("Enter the string which is to be added as a replaced strings ");
        String replace = scanner.nextLine();
        obj.Question1(str, sub, replace);
        System.out.println("----------------");

        System.out.println("Output of question7");
        obj.setFirstname("anita");
        System.out.println("first name is"+obj.getFirstname());
        obj.setLastname("yadav");
        System.out.println("last name is"+obj.getLastname());

        System.out.println("----------------");

        System.out.println("Output of question9");
        System.out.println("All car prices:");
        for (Car c : Car.values())
            System.out.println(
                    c + " costs " + c.getPrice() + " lacks.");
        System.out.println("----------------");

        System.out.println("Output of question11");
       SBI obj1=new SBI();
       obj1.setRateofintrest(12.900);
       System.out.print("rate of intrest of SBI is"+obj1.getRateofintrest());

       obj1.setBranchcode("322");
       System.out.println("branchcode of SBI Is"+obj1.getBranchcode());
       obj1.setPolicies("hjklkllll");
       System.out.println("policies of SBI are:"+obj1.getPolicies());
        BOI obj2=new BOI();
        obj2.setRateofintrest(13.900);
        System.out.print("rate of intrest of BOI is"+obj2.getRateofintrest());

        obj2.setBranchcode("322884");
        System.out.println("branchcode of BOI Is"+obj2.getBranchcode());
        obj2.setPolicies("hjklkllllmmdfkkfkf");
        System.out.println("policies of BOI are:"+obj2.getPolicies());
        ICICI obj3=new ICICI();
        obj3.setRateofintrest(11.900);
        System.out.print("rate of intrest of ICICI is"+obj3.getRateofintrest());

        obj3.setBranchcode("322884ICICI");
        System.out.println("branchcode of ICICI Is"+obj3.getBranchcode());
        obj3.setPolicies("hjklkllllmmdfkkfkfjjdjd");
        System.out.println("policies of ICICI are:"+obj3.getPolicies());



    }
}

