/*
 program:to check pass or fail
 @author:Ashish kumar
 @date:19/10/2022
*/
//declaring pcakage
import java.util.*;
//declaring class
class NestedIf
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int age;
	float weight;
	char gender;
	System.out.println("enter your age");
	age=sc.nextInt();
	if(age>=18)
	{
	  //taking input
	  System.out.println("enter your gender");
	   gender=sc.next().charAt(0);
	   
	  System.out.println("enter your weight");
      weight=sc.nextFloat();
	 
	  if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
	      
	  System.out.println("you can donete blood");
	  
	  else
	   
	  System.out.println("you cannot donate blood");
	  
	} 
	else
	  System.out.println("you are underage");
  }//end main
}//end of class