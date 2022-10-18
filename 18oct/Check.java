/*
 program:to check no. is negative or positeve
 @author:Ashish kumar
 @date:18/10/2022
*/
//declaring pcakage
import java.util.*;
//declaring class
class Check
{
 public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the a number");
     int num=sc.nextInt();
	 if(num>0)	 
     System.out.println(num+" is positeve");	 
     else
     System.out.println(num+" is negative");	 
  }//end main
}//end of class