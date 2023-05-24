import java.util.*;

 public class InterestRate {
   public static void main(String [] args) {
   
   Scanner input = new Scanner(System.in);
   
 System.out.print("Enter Your Balance: ");
 double balance = input.nextDouble();
 
 System.out.print("Enter The Annual Percentage Interest rate: ") ;
  double annualInterestRate = input.nextDouble();
  
  double nextMonthInterest = balance * (annualInterestRate/1200);
  
  System.out.println("The Interest For The Next Month is " + nextMonthInterest);
  
   }
 }
