import java.util.*;

 public class CalculatingEnergy {
  public static void main(String [] args) {
   
  Scanner input = new Scanner(System.in);
  
System.out.print("Enter the amount of water in kilograms: ");
double amountOfWater = input.nextDouble();
System.out.print("Enter the initial temperature of water in degrees celsius: ");
double initialTemperature = input.nextDouble();
System.out.print("Enter the final temperature of waterin degrees celsius: ");
 double finalTemperature = input.nextDouble();
 
double energyNeeded = amountOfWater * (finalTemperature - initialTemperature) * 4184;
 
 System.out.println("The energy needed to heat a mass of water " + amountOfWater + "kilograms from its initail temperature of " + initialTemperature + "celcius degrees to the final temperature of " + finalTemperature + "celsius degrees is " + energyNeeded + "joules");
 
 }
 
 }
