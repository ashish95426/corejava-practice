/*
 program:to check pass or fail
 @author:Ashish kumar
 @date:18/10/2022
*/
//declaring pcakage
import java.util.*;
//declaring class
class Result
{
 public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 //taking marks 
	 System.out.println("enter the marks of first subject");
     int marks1=sc.nextInt();
	 System.out.println("enter the marks of second subject");
     int marks2=sc.nextInt();
	 System.out.println("enter the marks of third subject");
     int marks3=sc.nextInt();
	 //calculating total marks
	 int totalMarks;
	 totalMarks=marks1+marks2+marks3;
	 //calculating percentage
	 int percentage;
	 percentage=(totalMarks*100)/300;
	 //printing percentage and total marks
	 System.out.println("totalMarks="+totalMarks);
	 System.out.println("percentage="+percentage);
	 //checking pass or fail
	 if(percentage>=40)	 
     System.out.println("congrats you are pass");	 
     else
     System.out.println("sorry you are fail");	 
  }//end main
}//end of class