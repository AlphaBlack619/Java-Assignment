import java.util.*;

 public class FeetConverter {
   public static void main(String [] args){
    
   Scanner input = new Scanner(System.in);
   
 System.out.print("Enter a value for feet: ");
  double feet = input.nextDouble();
  
  double oneFoot = 0.305;
 
 double meter = feet * oneFoot;
 
 System.out.println(feet + "foot is equal to " + meter + "meters Thankyou!");
   }
 }
