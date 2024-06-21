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
		
		
		float a = 10;
	
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
