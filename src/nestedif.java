import java.util.Arrays;
import java.util.Scanner;

public class nestedif {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double sal = sc.nextDouble();
       double tax = 0;
       double netSalary;
       if (sal < 300000) {
           tax = 0;
       } else if (sal > 300000 && sal <= 700000) {
           tax = sal * 0.10;
       } else {
           tax = sal * 0.20;

       }
       netSalary = sal - tax;
       System.out.println(" Tax amount" + tax);
       System.out.println("NetSalary" + netSalary);   if (sal < 300000) {
        System.out.println("NO TAX");
    }
   else if (sal > 300000 && sal <= 700000) {
        System.out.println("tax = 10%");
    }
   else {
        System.out.println("tax = 20%");
   }
}
}