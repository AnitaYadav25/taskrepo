package javaday2;
public class Question5 implements Cloneable {

    int a ;
    String s ;

    Question5(int a, String s){
        this.a = a;
        this.s = s;
    }

    Question5(Question5 copy)
    {
        a = copy.a;
        s = copy.s;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try{
            Question5 x = new Question5(5,"Anita");
            Question5 using_cloneable = (Question5)x.clone();
            System.out.println("the value through cloning is:"+using_cloneable.s+using_cloneable.a);
            Question5 using_copy_constructor = new Question5(x);
            System.out.println("the value through copy constructer is"+using_copy_constructor.s+using_copy_constructor.a);
        }
        catch (Exception e){

        }
    }
}