package javaday2;

class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}


public class Question13 {
    public static void main(String args[])
    {
        try
        {
            throw new MyException("This Is A Custom Exception");
        }
        catch (MyException ex)
        {

            System.out.println("exception is caught");
            System.out.println(ex.getMessage());
        }
    }
}