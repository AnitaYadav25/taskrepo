package javaday2;

public class Question6 {


        public static void main(String[] args) {
            int b[] = new int[3];
            try{
                int a[]=new int[5];
                a[5]=30/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception occurs");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBounds Exception occurs");
            }
            catch(Exception e)
            {
                System.out.println("Parent Exception occurs");
            }
            finally {
                System.out.println("Finally Will Always Execute !!");

            }
        }
    }

