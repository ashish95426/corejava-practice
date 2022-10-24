/*
program: to print no. of days in a month
@author:Ashish kumar sahu
@date:21/10/22
*/
//import package
import java.util.Scanner;
//declaring class
class Month
{
  //start method
  static void  printDays(String month )
   {
    //declaring variabels
	  int year;
	  Scanner sc=new Scanner(System.in);
   //start switch
   switch(month)
    {
     case "january":
     case "march":
     case "may":
     case "july":
     case "august":
     case "october":
     case "december":System.out.println("number days in "+month+" is 31");
	       break;
     
	 
	 case "april":
     case "june":
     case "september":
     case "november":System.out.println("number days in "+month+" is 30");
	       break;
		   
		   
	 case "february":System.out.println("Enter the year");
	                 year=sc.nextInt();
					 if(((year%4==0)&&(year%100!=0))||(year%400==0))
					    System.out.println("number days in "+month+" is 29");
				     else
                       	 System.out.println("number days in "+month+" is 28");				 
	       break;
		   
     default: System.out.println("wrong input");                	 
   
    }//end switch   
    
   
   }//end method
   
 
   
   //start main
   public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   //taking input
     System.out.println("Enter the month");
	  String choice;
	  choice=sc.next().toLowerCase();
	 
	  
	//calling method
	printDays(choice);
	 
  }//end main

}//end class