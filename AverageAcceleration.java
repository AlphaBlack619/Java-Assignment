import java.util.Scanner;

 public class AverageAcceleration {
   
    public static void main(String [] args) {
    
         Scanner input = new Scanner(System.in);   
    
    System.out.print("enter the starting velocity v0 in meters/seconds: ");
    double v0 = input.nextDouble();
    
    System.out.print("enter the ending velocity v1 in meters/seconds: ");
    double v1 = input.nextDouble();
    
    System.out.print("enter the time t in seconds: ");
     double t = input.nextDouble();
      
    double averageAcceleration = (v1 - v0) / t;
    
    System.out.println("The Average Acceleration is " + averageAcceleration);
        }
 }
