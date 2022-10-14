/*
program: to add to number by taking input
@author: Ashish kumar sahu
@date:14/02/2022 
*/
//declaring package
import java.util.Scanner;

//declarin class
 class additiondemo
 {
   public static void main(String args[])
   {
    //declaring variables
	int number1=Integer.parseInt(args[0]);
	int number2=Integer.parseInt(args[1]);
	//calculating sum
	int sum=number1+number2;
	//printing sum
	System.out.println("sum="+sum);
   
   
   }   

 }//end class