package Collection;
import java.util.Stack;
public class Question7 extends Stack {
    Stack<Integer> min = new Stack<>();

    void push(int x)
    {
        if(isEmpty() == true)
        {
            super.push(x);
            min.push(x);
        }
        else
        {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if(x < y)
                min.push(x);
            else
                min.push(y);
        }
    }

    int getMin()
    {
        int x = min.pop();
        min.push(x);
        return x;
    }
    public static void main(String[] args)
    {
        Question7 s = new Question7();
        s.push(10);
        s.push(20);
        s.push(3);

        s.push(5);
        System.out.println("the minimum value is");
        System.out.println(s.getMin());
    }
}
