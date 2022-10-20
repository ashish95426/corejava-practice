/*
program:to give the grade on the basis of percentage
@author Ashish kumar sahu
@date19/10/2022
*/
//import package
import java.util.Scanner;
//declaring class
class Grading
{
  //declaring main
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
	 float percentage;
	 char grade;
	 
	 //taking input
	 System.out.println("enter your percntage");
	 percentage=sc.nextFloat();
	 
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
	   
   }//end main
} //end class