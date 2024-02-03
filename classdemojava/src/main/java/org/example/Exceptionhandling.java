package org.example;

import java.io.IOException;

public class Exceptionhandling {
    public static void main(String[] args)  {

        int a = 12/0;
        int[] b = {3,4,5};
        try{
            a = 12/2;
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide a number by zero. Please change the denominator");
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Array's index is exceeding the total count. Please check the input index.");
        }
        catch (Exception e3){
            System.out.println("Parent exception");
        }
        finally {
            System.out.println("In finaly block");
        }

        System.out.println("res: "+ a);
    }
}
