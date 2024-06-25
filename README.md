# Gech_GIT_Proj
public class Main{
public static void main(String[] args){
System.out.println("Hello Saaanu...");
}
}
from today onwards i'm doing some geeks for geeks coding questions and answered by myself and also i'll uploat here for my reference.....
1)java program to read the number from standard input...?
import ajva.util.Scanner;
public c;lass S{
public static  void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int num = sc.nextInt();
num = 2+5;
}
}

2).java program to get input fro  the user..?
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int a = sc.nextInt();
		
		System.out.println("enter the second number");
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println(sum);
		
	}
}

3).java program to multiply two floating point numbers...?
public class Main
{
	public static void main(String[] args) {
		
		
		float a = 10.53;
	
		float b = 2.5f;
		
		float mul = a*b;
		System.out.println("the multiplication of two numbers is " +  mul);
		
	}
}

4).java program to swap two numbers without using temporary variable...?
public class Main
{
	public static void main(String[] args) {
	    
		int a=10;
		
		int b=20;
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("the number a after swapping is " + a);
		
		System.out.println("the number b after swapping is " + b);
	}
}

5).java program to swap two numbers with using temporary variable...?
public class Main
{
	public static void main(String[] args) {
	    
		int a=10;
		
		int b=20;
		
		int c = a;//c=10
            a = b;//a=20
            b = c;//b=10
		
		System.out.println("the number a after swapping is " + a);
		
		System.out.println("the number b after swapping is " + b);
	}
}

6).java program to find the given number is even or odd...?
public class Main
{
	public static void main(String[] args){
	    int n=85;
	    
	    if(n%2==0)
	    {
	        System.out.println("it is even number");
	    }
	    else
	    {
	      System.out.println("it is odd number");  
	    }
	}		
}
24/06/2024
1).sum of two complex numbers and write java code for this...?
public class Main{
    public static void main(String[] args){
        double real1 = 4.2;
        double real2 = 3.5;
        double imaginary1 = 3.8;
        double imaginary2 = 5.43;
        double sumReal = real1 + real2;
        double sumImaginary = imaginary1 +imaginary2;
        System.out.println("sum of real numbers is " + sumReal + " the sum of imaginary numbers is " + sumImaginary +"i");
    }
}
2).java aprogram to add two binary strings...?
public class BinaryAddition {

    public static void main(String[] args) {
        String binary1 = "01";
        String binary2 = "10";

        String sum = addBinary(binary1, binary2);

        System.out.println(binary1 + " + " + binary2 + " = " + sum);
    }

    public static String addBinary(String binary1, String binary2) {
        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the integers
        int result = num1 + num2;

        // Convert back to binary string
        return Integer.toBinaryString(result);
    }
}
3).java program to find largest among three numbers...?
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter the first number");
       int n1 = sc.nextInt();
       
       System.out.println("enter the second number");
       int n2 = sc.nextInt();
       
       System.out.println("enter the third number");
       int n3 = sc.nextInt();
       
       if(n1>n2 && n2>n3){
           System.out.println("n1 is big");
       }
       else if(n2>n3){
           System.out.println("n2 is big");
       }
       else{
           System.out.println("n3 is big");
    }
}
}
4).java program to display all the prime numbers from 1 to n...?



5).to find the given year is leap year or not..?
package ternaryop;

public class LeapYear {

    public static void main(String[] args) {
    	/*String days = "365";

        if (days.equals("366") || days.equals("365")) {
            switch (days) {
                case "366":
                    System.out.println("leap year");
                    break;
                case "365":
                    System.out.println("normal year");
                    break;
            }
        } else {
            int daysInt = Integer.parseInt(days);
            if (daysInt >= 1 && daysInt <= 364) {
                System.out.println("not predictable");
            } else {
                System.out.println("invalid days value given");
            }*/
    	int num = 200;
    	if((num%4 ==0 && num%100 !=0)||(num%400 ==0)) {
    		System.out.println("it is a leap year");
    	}
    	else {
    		System.out.println("it is not a leap year");
    	}
     }
   }




