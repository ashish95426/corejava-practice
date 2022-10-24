/*
program: to print abbrebation
@author:Ashish kumar sahu
@date:21/10/22
*/
//import package
import java.util.Scanner;
//declaring class
class Abberbation
{
  //start method
  static void  printAbbr(String ch )
   {
   //start switch
   switch(ch)
    {
     case "lol"->System.out.println("lots of laugh");
	 case "pov"->System.out.println("point of view");
	 case "asap"->System.out.println("as soon as possible");
	 default->System.out.println("wrong input");
   
    }//end switch   
    
   
   }//end method
   
 
   
   //start main
   public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   //taking input
     System.out.println("Enter your abbrebation(lol,pov,asap)");
	  String choice;
	  choice=sc.next().toLowerCase();
	 
	  
	//calling method
	printAbbr(choice);
	 
  }//end main

}//end class