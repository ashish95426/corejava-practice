/*
 program:to find rhe gratest number
 @author:ashish kumar sahu
 @date:19/10/2022
*/
//import pakage
import java.util.Scanner;
//declaring class
class Greatestno
{
  //declaring main
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    //declaring variabels
     int num1,num2,num3;
    
    //taking inputs
     System.out.println("Enter the first number:");
      num1=sc.nextInt();
	 System.out.println("Enter the second  number:");
      num2=sc.nextInt();
	 System.out.println("Enter the third number:");
      num3=sc.nextInt();	
     if((num1>num2)&&(num1>num3))
	   System.out.println("the greatest number is:"+num1);
	    else if((num2>num2)&&(num2>num3))
         System.out.println("the greatest number is:"+num2);	
	      else
		   System.out.println("the greatest number is:"+num3);
  
  } //end main

}//end class