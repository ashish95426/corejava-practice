/*
program:printing ascii value
@author:ashish kumar sahu
@date:18/10/2022
*/
//declaring package
import java.util.Scanner;
//declaring class
class AsciiValue
{
  
 //declaring main 
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  //taking inputs
  System.out.println("Enter the char value");
  char charValue=sc.next().charAt(0);
  //converting to ascii value
  int asciiValue=charValue;
  //printing the ascii value
  System.out.println("the ascii value of "+charValue+"is :"+asciiValue);
   


 }//end main
}//end class