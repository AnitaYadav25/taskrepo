package javaday2;

public class Question3 {


        public static void main(String[] args) {
            try {
                Class.forName("abcd");
            }
            catch (ClassNotFoundException e){
                System.out.println(e);
                System.out.println("hello");
                e.printStackTrace();
            }

        }


}
