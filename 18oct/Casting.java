/*
 program:demo of typecasting
 @author:ashish kumar sahu
 @date:18/10/2022
*/
//declartion of class
class Casting
{
 //declaring main
 public static void main(String args[])
 {
 //declaring variables
  short s1=76;
  short s2=45;
 //calculating sum
  short sum;
   sum=(short)(s1+s2);//by default airthmaetic operation gives int as output so typecastingis needed
 //printing sum
  System.out.println("the sum of s1 and s2 is:"+sum);
 //declaring variabels
  byte b1=78;
  byte b2=65;
 //calculating sum
  //byte calc;
  //calc=(byte)(b1+b2);
  b2+=b1;
  System.out.println("the sum of b1 and b2 is:"+b2);
    
 }
}//end class