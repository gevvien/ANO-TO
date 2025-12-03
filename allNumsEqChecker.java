import java.util.Scanner;

public class allNumsEqChecker {
   public static void main(String[] args) {
      Scanner vien = new Scanner(System.in);
      
      System.out.print("Input first number: ");
      int num1  = vien.nextInt();
      
      System.out.print("Input second number: ");
      int num2 = vien.nextInt();
      
      System.out.print("Input third number: ");
      int num3 = vien.nextInt();
      
      System.out.print("Input fourth number: ");
      int num4 = vien.nextInt();
      
      if (num1 == num2) {
         if (num2 == num3) {
            if (num3 == num4) {
               System.out.println("Numbers are equal");
            }
         }
      } else {
         System.out.println("Numbers are not equal");
      }
   }
}
 