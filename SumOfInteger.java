import java.util.*;

 public class SumOfInteger {
   public static void main(String [] args){
 
        Scanner input = new Scanner(System.in);
        
 System.out.print("Enter a number between 0 and 1000: ");
   int numbers = input.nextInt();
 
 int sum = (numbers % 10) + ((numbers/10) % 10) + ((numbers/100) % 10);
 
 System.out.printf("The sum of digits is: %d%n", sum);
   
   }
 }
