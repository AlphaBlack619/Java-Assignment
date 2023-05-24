import java.util.*;
 
 public class RunWay {
   public static void main(String [] args) {
   
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter the speed V in meter/seconds: ");
  double velocity = input.nextDouble();
 System.out.print("Enter the acceleration A in meter/second^2: ");
 double acceleration = input.nextDouble();
 
 double length = (velocity * velocity) / (2 * acceleration);
 
 System.out.printf("The Minimum Runway Length For The Airplan Is %.3fmeters%n", length);
   
   }
 }
