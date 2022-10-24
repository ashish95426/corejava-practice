/*
 program:to check attendance   
 @author:Ashish kumar
 @date:20/10/2022
*/
//declaring pcakage
import java.util.*;
//declaring class
class Attendance
{ 
 //declaring method
  static void present(int a)
  {
  
   if(a>=75)
   {
     
	 System.out.println("eligible to give exam");

	 
   } 

	else 
   {
     
	 System.out.println("you are not eligible to give exam");

	}
  
  }
 public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 //taking marks 
	 System.out.println("enter the your attendance");
     int attn=sc.nextInt();
	 //calling method
	 present(attn);
	
	 
  }//end main
}//end of class