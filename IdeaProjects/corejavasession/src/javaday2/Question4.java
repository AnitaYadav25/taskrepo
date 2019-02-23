package javaday2;

public class Question4 {
    public String s;
    private static Question4 singleton_instance = null;

    private Question4()
    {
        s = "Hello From Singleton";
    }

    public static Question4 getInstance(){
        if(singleton_instance == null)
            singleton_instance = new Question4();
        return singleton_instance;
    }

    public static void main(String[] args) {
        Question4 a = Question4.getInstance();


        System.out.println(a.s);

    }
}
