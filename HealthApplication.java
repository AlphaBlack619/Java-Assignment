import java.util.*;
 
 public class HealthApplication {
   public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
 
 System.out.print("enter your weight in pounds: ");
 double weightInPounds = input.nextDouble();
 System.out.print("enter your height in inches: ");
 double heightInInches = input.nextDouble();
 
 double bmi = weightInPounds * 703 / Math.pow(heightInInches, 2);
 
 System.out.println("Your Body Mass Index (BMI) is " + bmi);
   }
 }
