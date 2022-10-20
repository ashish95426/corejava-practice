/*
program:to use of switch
@author:Ashish kumar sahu
@date:19/10/2022
*/
//import package
import java.util.Scanner;
//declaring class
class Switch
{
 // method
  static void printDay(int d)
  {
   switch(d)
   {
    case 1:System.out.println("monday");
	       break;
	case 2:System.out.println("tuesday");
	   break;
	case 3:System.out.println("wednesday");
	   break;
	case 4:System.out.println("thursday");
	   break;
	case 5:System.out.println("friday");
	   break;
	case 6:System.out.println("saturday");
	   break;
	case 7:System.out.println("sunday");
	   break;
	default:System.out.println("input is wrong");
	   
	
   }//end of switch
  }
 //declaring main
  public  static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int day;
   System.out.println("enter the day");
   day=sc.nextInt();
   //calling printday
   printDay(day);
  
  }
}