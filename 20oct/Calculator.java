/*
 program:to make calculator
 @author:Ashish kumar
 @date:19/10/2022
*/
//declaring pcakage
import java.util.*;
//declaring class
class Calculator
{
 //method add
  static void add(float num1,float num2)
  {
   float sum=num1+num2;
   System.out.println("the result is"+sum);
  } 
   static void sub(float num1,float num2)
  {
   float sum=num1-num2;
   System.out.println("the result is"+sum);
  } 
 static void mul(float num1,float num2)
  {
   float sum=num1/num2;
   System.out.println("the result is"+sum);
  } 
 static void div(float num1,float num2)
  {
   float sum=num1/num2;
   System.out.println("the result is"+sum);
  }   
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   //declaring variabels
   float num1,num2;
   int choice;
   //taking inputs
   System.out.println("enter number 1");
   num1=sc.nextFloat();
   System.out.println("enter number 2");
   num2=sc.nextFloat();
   
   System.out.println("1. add");
   System.out.println("2. sub");
   System.out.println("3. multiply");
   System.out.println("4. divide");
   
   
   System.out.println("enter the choice");
   choice=sc.nextInt();
   
   //start switch
   switch(choice)
   {
     case 1:add(num1,num2);
	       break;
	 case 2:add(num1,num2);
	       break;
	 case 3:add(num1,num2);
	       break;
	 case 4:add(num1,num2);
	       break;
	 default:System.out.println("wrong input");
   
   }
   
  }//end main
}//end of class