import java.util.*;

 public class AreaOfATriangle {
   public static void main(String [] args) {
   
 Scanner input = new Scanner(System.in);
 
 System.out.print("enter x1: ");
 double x1 = input.nextDouble();
 System.out.print("enter x2: ");
 double x2 = input.nextDouble();
 System.out.print("enter x3: ");
 double x3 = input.nextDouble();
 System.out.print("enter y1: ");
 double y1 = input.nextDouble();
 System.out.print("enter y2: ");
 double y2 = input.nextDouble();
 System.out.print("enter y3: ");
 double y3 = input.nextDouble();
 
 double side1 = Math.pow(Math.pow(x1 - y1, 2) + Math.pow(y2 - y2, 2), 0.5); 
 double side2 = Math.pow(Math.pow(x2 - y2, 2) + Math.pow(x3 - y3, 2), 0.5);
 double side3 = Math.pow(Math.pow(x3 - y3, 2) + Math.pow(x1 - y1, 2), 0.5);
 
 double totalSides = (side1 + side2 + side3) / 2;
 
 double firstS = totalSides-side1;
 double secondS = totalSides-side2;
 double thirdS = totalSides-side3;
 
 double area = Math.pow(totalSides * firstS * secondS * thirdS, 0.5);
 
 System.out.println("the Area Of The Triangel is " + area);
  
 // System.out.printf("the Area Of The Triangel is %2f", area); why did its change the value after using float? qus. to ask the facilitator
   // why when using Math.sqrt it ans was NaN? qus. to ask facilitator
   } 
 } 
