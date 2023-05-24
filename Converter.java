import java.util.*;

 public class Converter {
   public static void main(String [] args) {
   
   Scanner input = new Scanner(System.in);
   
   double onePound = 0.454;
   
 System.out.print("enter a number in pounds you want to convert: ");
 double numberInPound = input.nextDouble();
 
 double kilogram = onePound * numberInPound;
 
 System.out.printf("So %fpounds when converted to kilograms is %f%n", numberInPound, kilogram); 
   }
 }
