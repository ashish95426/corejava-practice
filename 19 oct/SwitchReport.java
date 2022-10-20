/*
program:printing remarks using switch
@author:Ashish kumar sahu
@date:19/10/2022
*/
//import package
import java.util.Scanner;
//declaring class
class SwitchReport
{
 // method
  static void printReport(char g)
  {
   switch(g)
   {
    case 'A':System.out.println("Excellent");
	       break;
	case 'B':System.out.println("very good");
	   break;
	case 'C':System.out.println("good");
	   break;
	case 'D':System.out.println("pass..work hard");
	   break;
	case 'F':System.out.println("fail.... Better luck next time");
	   break;
	
	default:System.out.println("input is wrong");
	   
	
   }//end of switch
  }
 //declaring main
  public  static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   char grade;
   System.out.println("enter your grade");
   grade=sc.next().charAt(0);
   //calling printday
   printReport(grade);
  
  }
}