package exceptions;

import java.util.Scanner;

public class exception3 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int bal = sc.nextInt();
            if (bal > 30000)  {
                throw new ArithmeticException("Insuffecient Balance");
            }
            System.out.println("Withdrawl Successful");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Caught:" + e.getMessage());
        }
    }
}
