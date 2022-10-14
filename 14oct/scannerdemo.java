/*
program:demo of scanner class
@author:Ashish kumar sahu
@date:14/10/2022
*/
//declaring package
 import java.util.Scanner;
//declaring class
 class scannerdemo
  {
    //declaring main
	 public static void main(String args[])
	 {
	  Scanner sc=new Scanner(System.in);
	   //taking inputs
	   System.out.println("Enter your name");
	   String name=sc.next();
	   
	   System.out.println("Enter your age");
	   int age=sc.nextInt();
	   
	   System.out.println("Enter your marks");
	   float marks=sc.nextFloat();
	   
	   System.out.println("Enter your gender M/F");
	   char gender=sc.next().charAt(0);
	   
	   System.out.println("Enter pass true/false");
	   boolean pass=sc.nextBoolean();
	   //printing details
       System.out.println("name:"+name);
       System.out.println("age:"+age);
       System.out.println("marks:"+marks);
	   System.out.println("gender:"+gender);
       System.out.println("pass:"+pass);
   
	 
	 }//end main


  } //end class