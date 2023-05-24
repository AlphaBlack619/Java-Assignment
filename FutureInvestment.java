import java.util.*;

 public class FutureInvestment {
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
 System.out.print("Enter investment amount: ");
 double investmentAmount = input.nextDouble();
 
 System.out.print("Enter annual interest rate in percentage: ");
 double annualInterestRate = input.nextDouble();  
 
 System.out.print("Enter the number of years: ");
 int numberOfYears = input.nextInt();
 
 double monthlyRate = annualInterestRate/1200;
 
 double futureInvestment = investmentAmount * Math.pow((1 + monthlyRate), numberOfYears * 12) ;
 
 System.out.println("The Accumulated value is $" + futureInvestment);
 
  }
 }
