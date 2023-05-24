import java.util.*;

 public class CostOfDriving {
   public static void main(String [] args){
   
   Scanner input = new Scanner(System.in);
System.out.print("Enter the driving distance: ");
double drivingDistance = input.nextDouble();
System.out.print("Enter the mile per gallon: ");
double milePerGallon = input.nextDouble();
System.out.print("Enter the price per gallon: $");
 double pricePerGallon = input.nextDouble();
 
double costOfDriving = (pricePerGallon * drivingDistance) /  milePerGallon;

System.out.println("The Cost Of Driving Is $" + costOfDriving);

   }
 }
