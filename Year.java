import java.util.*;
 
 public class Year {
   public static void main(String [] args){
 
   Scanner input = new Scanner(System.in);
 
 System.out.print("Enter the number of minutes: ");
    long minutes = input.nextLong();
    
 long year = minutes / (60*24*365);
 long days = (minutes / (60*24)) % 365;
 	
 System.out.printf("%d minutes is approximately %d years and %d days", minutes, year, days);
 	 
  
 }
 
 }
