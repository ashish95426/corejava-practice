/*
program:finding a no. is even or odd
@author:ashish kumar sahu
@date:18/10/2022
*/
//declaring package
import java.util.Scanner;

//declaring class
class EvenOdd
{
  
 //declaring main 
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  //declaring variabels
  int num1=sc.nextInt();
  
  if((num1%2)==0)
   System.out.println("the number is even");
  else
   System.out.println("the  number is odd");


 }//end main
}//end class