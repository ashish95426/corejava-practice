/*
program: to print program language
@author:Ashish kumar sahu
@date:21/10/22
*/
//import package
import java.util.Scanner;
//declaring class
class Language
{
  //start method
  static void  printLanguage(String lang )
   {
   //start switch
   switch(lang)
    {
     case "c","c++","java"->System.out.println("programing language");
	 case "sql","oracle"->System.out.println("DBMS language");
	 case "php","css","Html"->System.out.println("web language");
	 default->System.out.println("wrong input");
   
    }//end switch   
    
   
   }//end method
   
 
   
   //start main
   public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   //taking input
     System.out.println("Enter the language");
	  String choice;
	  choice=sc.next().toLowerCase();
	 
	  
	//calling method
	printLanguage(choice);
	 
  }//end main

}//end class