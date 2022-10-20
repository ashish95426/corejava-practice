/*
 program:to create report card of a student
 @author:Ashish kumar sahu
 @date:19/10/2022
*/
//import package
import java.util.*;
//declare class
class ReportCard
{
 //method of calculating percentage
  static void calcPercentage(float m1,float m2,float m3)
  {
   float percentage;
   //calculatng percentage
   percentage=((m1+m2+m3)/300)*100;
   calcGrade(percentage);
  }
     static void calcGrade(float percentage)
   {
      char grade;
     //claculating grade
	  if(percentage>=85)
       grade='A';
	   else if(percentage>=75)
        grade='B';
	    else if(percentage>=65)
         grade='C';
	     else if(percentage>=40)
          grade='D';
	      else
           grade='F';
		   //end if else ladder
		
		if(grade=='F')
          System.out.println("sorry.. you are fail"	);
         else
		   System.out.println("congrats.. you are pass with grade "+grade);
     //calling method to print remarks
	 printRemarks(grade);
   }
   static void printRemarks(char g)
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
	}   
	
   }//end of calcGrade
 //start main
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  float marks1,marks2,marks3;
  //taking inputs
   System.out.println("Enter marks of subject1");
   marks1=sc.nextFloat();
   System.out.println("Enter marks of subject2");
   marks2=sc.nextFloat();
   System.out.println("Enter marks of subject3");
   marks3=sc.nextFloat();
   //calling method to calculate percentage
    calcPercentage(marks1,marks2,marks3);   
   }//end main
}//end class