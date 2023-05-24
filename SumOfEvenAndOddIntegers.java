import java.util.*;

 public class SumOfEvenAndOddIntegers{
    public static void main(String [] args){
 
 int sumOfEvenNumber = 0;
 int sumOfOddNumber = 0;
   
 Scanner input = new Scanner(System.in);
    
  System.out.println("Enter A Number: ");
   int number = input.nextInt();
    
  while (number!=-3) {
     if (number%2 !=0) {
       sumOfOddNumber += number;
 }  else
     sumOfEvenNumber += number;
     
   System.out.println("Enter other number or enter -3 to terminate!");
    number = input.nextInt();
}
    }
 }
