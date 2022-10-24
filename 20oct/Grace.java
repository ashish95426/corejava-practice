/*
 program:to give grace marks   
 @author:Ashish kumar
 @date:20/10/2022
*/
//declaring pcakage
import java.util.*;
//declaring class
class Grace
{ 
 //declaring method
  static void graceMarks(float g)
  {
   float totalMarks;
   if((g>=35)&&(g<38))
   {
     totalMarks=g+5;
	 System.out.println("total marks"+totalMarks);

	 
   } 
   else if((g>=38)&&(g<40))
   {
     totalMarks=g+3;
	 System.out.println("total marks"+totalMarks);

	 
   } 
   else if(g>=40)
   {
     
	 System.out.println("total marks"+g);

	} 
	else 
   {
     
	 System.out.println("you are fail");

	}
  
  }
 public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 //taking marks 
	 System.out.println("enter the marks of first subject");
     int marks1=sc.nextInt();
	 //calling method
	 graceMarks(marks1);
	
	 
  }//end main
}//end of class