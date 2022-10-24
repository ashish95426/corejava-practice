/*
program: to create menu
@author:Ashish kumar sahu
@date:21/10/22
*/
//import package
import java.util.Scanner;
//declaring class
class Menu
{
  //start method
   static void calcBill(int c1)
   {
   float quantity, totalBill=0.0f,discountedBill=0.0f;
      Scanner sc=new Scanner(System.in);
   switch(c1)
    {
     case 1:System.out.println("Enter the qutatinty purchased");
	        quantity=sc.nextFloat();
			totalBill=100*quantity;
			break;
	 case 2:System.out.println("Enter the qutatinty purchased");
	        quantity=sc.nextFloat();
			totalBill=50*quantity;
			break;
	 case 3:System.out.println("Enter the qutatinty purchased");
	        quantity=sc.nextFloat();
			totalBill=100*quantity;
			break;
	 case 4:System.out.println("Enter the qutatinty purchased");
	        quantity=sc.nextFloat();
			totalBill=200*quantity;
			break;
	 case 5:System.out.println("Enter the qutatinty purchased");
	        quantity=sc.nextFloat();
			totalBill=50*quantity;
			break;
     default:System.out.println("wrong input");
   
    }//end switch   
    float discount=calculateDiscount(totalBill);
     System.out.println("----totalBill----"+totalBill);
	 discountedBill=totalBill-discount;
	  if(discount>0)
	      System.out.println("----totalBill----"+discount);
   
   }//end method
   
   //starting method to calculate discountbill
   static float calculateDiscount(float totalBill)
   {
    float disc;
	 if(totalBill>2000)
	  disc=0.2f*totalBill;
	   else if(totalBill>500)
	    disc=0.1f*totalBill;
	     else if(totalBill>250)
	      disc=0.05f*totalBill;
		   else
            disc=0.0f;
     return(disc);
	 
    }//end method
   
   //start main
   public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   //declaring variabels
  
   int choice;
   
   //menu
    System.out.println("1.Apple :Rs 100");
    System.out.println("2.chips :Rs 50");
    System.out.println("3.mango :Rs 100");
    System.out.println("4.cheese :Rs 200");
    System.out.println("5.biscuit :Rs 50");
   
    
	//taking input   
     System.out.println("Enter your choice");
	 choice=sc.nextInt();
	 
	  
	//calling method
	calcBill(choice);
	 
  }//end main

}//end class