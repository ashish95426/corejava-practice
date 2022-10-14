/*
program:to find avergae using scanner class
@author:Ashish kumar sahu
@date: 14/10/2022
*/
//declaring package
 import java.util.Scanner;
//declaring class
 class average2
 {
  //declaring main
  public static void main(String args[])  
  { 
   Scanner sc=new Scanner(System.in);
   //declaring variabels
    System.out.println("Enter your number1");
	   float number1=sc.nextFloat();
	System.out.println("Enter your number2");
	   float number2=sc.nextFloat();
	 System.out.println("Enter your number3");
	   float number3=sc.nextFloat();   
   // calculating average
    float sum= number1+number2+number3;
	float avg=sum/3;
   //printing average
    System.out.println("average="+avg);   
  }//end main
 
 }//end class