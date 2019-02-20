package Main;
import java.lang.*;
import java.util.Arrays;

public class Q10 {
    //Question10

    public void add(int a,int b){
        int c;
        c=a+b;
        System.out.println("----------------");
        System.out.println("Output of question10");
        System.out.println("the sum of two integer is"+c);
    }
    public void add(double a,double b){
        double c;
        c=a+b;
        System.out.println("product of two doubbles are "+c);

    }
    public void multiply(double a,double b){
        double c;
        c=a*b;
        System.out.println("addition of two floats are "+c);
    }
    public void multiply(int a ,int b){
        int c;
        c=a*b;
        System.out.println("multiply of two float is "+c);

    }
    public void concat(String a,String b){
        String c="";
        c=a+b;
        System.out.println("concatination of two string is "+c);

    }

    public void concat(String a,String b,String c){
        String d="";
        d=a+b+c;
        System.out.println("concatination of three string is "+d);

    }




   // question no 4

   public void Calculatepercentage(String a) {
       System.out.println("----------------");
       System.out.println("Output of question4");
       System.out.println("string is "+a);
       char c;
        int m;
        int lcount=0;
        int ucount=0;

        for (m =0;m<a.length();m++)
        {
            c = a.charAt(m);

            if(Character.isLowerCase(c)){
                lcount++;
            }

                    if(Character.isUpperCase(c)){
                        ucount++;
                    }

            }

double lower;
        double upper;
        lower=((lcount*100)/a.length());
        upper=((ucount*100)/a.length());
        System.out.println("number of lowercase characters are"+lcount);
        System.out.println("number of uppercase characters are"+ucount);
        System.out.println("percentage of lowercase characters are"+lower);
        System.out.println("percentage of lowercase characters are"+upper);

        }

        //Questionn8
        public void Question8(String a)
        {
            System.out.println("----------------");
            System.out.println("Output of question8");
            System.out.println("string is "+a);
            char ch='\0';
String b="";
int i;
for(i=a.length()-1;i>=0;i--)
{
    b = b + "" + a.charAt(i);


}

System.out.println("reverse string is "+b);


            StringBuffer buff = new StringBuffer(b);

            // deleting characters from index 4 to index 9
            //first offset is starting index last is ending string
            buff.delete(4, 9);
            System.out.println("After deletion from index 4 to 9 is= " + buff);

        }
        //question6
     public void Question6(){
         System.out.println("----------------");
         System.out.println("Output of question6");

         int[] arr=new int[]{4,1,2,3,4,2,1};
        int i;

         Arrays.sort(arr);
        for(i=0;i<arr.length-1;i=i+2){

                if(arr[i]-arr[i+1]!=0)
                {
                    System.out.print("missing element is"+arr[i]);
                    System.out.println("----------------");
                }

        }


        }
        //Question5
        public void Question5(){

            System.out.println("Output of question5");

            int i,j,k=0;
            int[] arr = new int[]{1,2,3,47,8,9,10,1,0,99 };

            int[] arr1 = new int[]{7,8,9,10,1,0,99};

            int arr3[]=new int[10];
            System.out.println("elements of array 1 is");
            for (i=0;i<arr.length;i++)
                System.out.println(+arr[i]);
            System.out.println("elements of array 2 is");
            for (i=0;i<arr1.length;i++)
                System.out.println(+arr1[i]);
            for(i=0;i<arr.length;i++)
            {
                for(j=0;j<arr1.length;j++)
                {
                    if(arr[i]==arr1[j])
                    {
                        arr3[k]=arr[i];

                        k++;
                    }
                }


            }
            System.out.println("Common elemnts are:");
            for(i=0;i<k;i++){
                System.out.println(arr3[i]);
            }

        }
       // Question 2
    public void Question2(String str){
        System.out.println("----------------");
        System.out.println("Output of question2");
        System.out.println("the string is : "+str);

        String[] array=str.split(" ");

        int wcount=1;
        int i;
        for(i=0;i<array.length;i++){
          for(int j=i+1;j<array.length;j++){
              if(array[i].equals(array[j]))	{
                  wcount=wcount+1;
                  array[i]="0";
              }

              }
            if(array[i]!="0") {
                System.out.println(array[i] + " count is " + wcount);    //Printing the word along with count
                wcount =1;
            }
          }

        }
       //Question3  Write a program to find the number of occurrences of a character in a string without using loop?
    public void Question3( String str,String c){
        System.out.println("----------------");
        System.out.println("Output of question3");

        int occurences;
        occurences=str.length()-(str.replaceAll(c,"").length());
        System.out.println("the character "+c+" occured "+occurences+"times");


    }
//Question1 Write a program to replace a substring inside a string with other string
public void Question1(String str,String sub,String replace){

    String newstring=str.replaceAll(sub,replace);
        System.out.println(newstring);

}
//Question7 Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively

     String name;        // Object variable
      int age;            // Object variable
      // Object variable
      static String  Firstname ="";
    static String Lastname="";// Class variable

    public static String getFirstname() {
        return Firstname;

    }

    public static void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public static String getLastname() {
        return Lastname;
    }

    public static void setLastname(String lastname) {
        Lastname = lastname;
    }




    }
    //Question 9 Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
    enum Car {
        Innova(25), maruti800(4), hondacity(10);
        private int price;

        Car(int p) {
            price = p;
        }

        int getPrice() {
            return price;
        }
    }
//Question10
        class Bank {

        double rateofintrest;

    public double getRateofintrest() {
        return rateofintrest;
    }

    public void setRateofintrest(double rateofintrest) {
        this.rateofintrest = rateofintrest;System.out.println();
 }

    String branchcode;

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    String policies;

    public String getPolicies() {
        return policies;
    }

    public void setPolicies(String policies) {
        this.policies = policies;
    }
}
    class SBI extends Bank {

    }


    class BOI extends Bank {

    }

    class ICICI extends Bank {

    }













