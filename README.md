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

or.....

public class Main
{
	public static void main(String[] args) {
		String binary1="10";
		String binary2="01";
		int num1=Integer.parseInt(binary1);
		int num2 = Integer.parseInt(binary2);
		int result = num1+num2;
		System.out.println(result);
		}
}
this is actually writtern by me and it is correct.
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int start, end, temp, num, count, isprime;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start number:");
        start = scanner.nextInt();

        System.out.println("Enter the end number:");
        end = scanner.nextInt();

        // Swap start and end if start is greater than end
        if (start > end) {
            temp = start;
            start = end;
            end = temp;
        }

        System.out.println("The prime numbers between " + start + " to " + end + " are:");

        // Iterate over the range from start to end
        for (num = start; num <= end; num++) {
            if (num < 2) {
                continue; // Skip numbers less than 2, since they are not prime
            }
            isprime = 1; // Assume num is prime until proven otherwise
            // Check for factors of num
            for (count = 2; count <= Math.sqrt(num); count++) {
                if (num % count == 0) {
                    isprime = 0; // num is not prime
                    break;
                }
            }
            if (isprime == 1) {
                System.out.println(num); // Print num if it is prime
            }
        }
        
        scanner.close();
    }
}
or....
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int start,end,temp,num,count,isprime;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the start number");
	 start = sc.nextInt();
	System.out.println("enter the end number");
	 end = sc.nextInt();
	if(start>end){
	    temp = start;
	    start = end;
	    end = temp;
	}
	System.out.println("the prime numbers between" + start +  " to "+ end);
	for(num=start;num<=end;num++){
	    if(num<2){
	        continue;
	    }
	    isprime=1;
	    for(count = 2;count<=Math.sqrt(num);count++){
	        if(num % count ==0){
	            isprime =0;
	            break;
	        }
	    }
	    if(isprime==1){
	    System.out.println(num);
	}
	}
    sc.close();
}
} this code is writtern by me..


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
26/06/2024
1).find the LCM and HCF(GCD) of two numbers....?
public class Main
{
	public static void main(String[] args) {
	    System.out.println(lcm(10,20));
	}
      public static int gcd(int a,int b){
		while(b !=0){
		    int temp =b;
		    b =a % b;
		    a = temp;
		}
		return a;
      }
      public static int lcm(int a,int b){
		return Math.abs(a*b)/gcd(a,b);
		
		}
}
2).find the GCD(HCF) of two numbers we find it by using formula in java programming...?
the GCD (Greatest Common Divisor) of 10 and 20 is 10, The GCD of two numbers is the largest positive integer that divides both of the numbers without leaving a remainder.
**Divisors of 10: 1, 2, 5, 10    for(10)...
**Divisors of 20: 1, 2, 4, 5, 10, 20    for(20).....
public class Main
{
	public static void main(String[] args) {
	    System.out.println(gcd(10,20));
	}
      public static int gcd(int a,int b){
		while(b !=0){
		    int temp =b;
		    b =a % b;
		    a = temp;
		}
		return a;
      }
     
}
3).calculator program by using switch...?
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a =2, b=10;
	char ch ='*';
	switch(ch){
	    case '+':
	        System.out.println("addition is " + (a+b));
	   break;
	   case '-':
	       System.out.println("subtraction is " + (a-b));
	   break;
	   case '*':
	       System.out.println("multiplication is " + (a*b));
	   break;
	   case '/':
	       if(b==0){
	           System.out.println("divide by zero error");
	       }
	       else{
	       System.out.println("division is " + (a/b));
	   break;    
	       } 
	   case '%':
	       System.out.println("modulus is " + (a%b));
	   break;  
	   default:
	   System.out.println("invalid operator");
	}
}
}
4).write a java program that includes class creation object creation methods creation also includes conditional statements switch block.
import java.util.Scanner;

// Class definition
class Calculator {
    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero error");
        }
        return (double) a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Object creation
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        System.out.println("Enter the operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        // Switch block for choosing the operation
        switch (operation) {
            case '+':
                System.out.println("Result: " + calculator.add(a, b));
                break;
            case '-':
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            case '*':
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            case '/':
                try {
                    System.out.println("Result: " + calculator.divide(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        scanner.close();
    }
}
5).to find the year is leap year or not in java program goes like this....?
public class Main{
    public static void main(String[] args){
        int year = 1700;
        if((year %4==0) && (year %100 !=0)|| (year %400 ==0)){
        System.out.println("leap year");
    }
    else{
        System.out.println("not a leap year");
    }
}
}
6).reverse of the number in java program...?
public class Main{
    public static void main(String[] args){
        int num = 123;
        int rev =0;
        while(num!=0){
            int dig = num%10;
            rev = rev * 10 + dig;
            num = num/10;
        }
        System.out.println("revers of the number is " + rev);
}
} 
orr......
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
it is the program written by using methods and giving user input...
6).to find whethe the number is armstrong number or not using java program...?
here how to find the armstrong number 
370 = 3*3*3 + 7*7*7 + 0 
   =  27 + 343 + 0
   =  370
Input : 100 200
Output :153
Explanation : 100 and 200 are given  
two integers.
 153 = 1*1*1 + 5*5*5 + 3*3*3  
     = 1 + 125 + 27
     =  153
Therefore, only 153 is an Armstrong number between 100 and 200.
   
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int numofdigit = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numofdigit);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
30/06/2024
1).write a java code for to find whether the number is neon number or not...?
public class Main {
    public static void main(String[] args) {
        int n = 9;
        int sum = 0;
        int sqr = n * n; // Calculate the square of n
        
        // Calculate the sum of digits of sqr
        while (sqr > 0) {
            int r = sqr % 10;
            sum += r;
            sqr = sqr / 10;
        }
        
        // Check if the sum of digits equals n
        if (sum == n) {
            System.out.println("It is a neon number.");
        } else {
            System.out.println("It is not a neon number.");
        }
    }
}
2).to find whether the character is vowel or not.....?
public class Main {
    public static void main(String[] args) {
        char ch = 'a'; // Initialize 'ch' with a character value

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }
    }
}
3).to find the factorial of the given number...?
public class Main {
    public static void main(String[] args) {
        int number = 5; // Example: Calculate factorial of 5
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
4).find the fibonacci series of the first five numbers including 0...?
Initialization:

We manually initialize or print the first two numbers (0 and 1) before the loop starts.
Loop Starting Point (i = 2):

We start the loop at i = 2 because:
i = 0 would correspond to the first Fibonacci number (0).
i = 1 would correspond to the second Fibonacci number (1).
i = 2 corresponds to generating the third Fibonacci number, which is the sum of the first two (0 + 1 = 1).
Loop Execution:

From i = 2 onward, each iteration of the loop calculates the next Fibonacci number by adding the two preceding numbers.
public class Main {
    public static void main(String[] args) {
        int n = 5; // Number of terms in the Fibonacci series
        int a = 0, b = 1;
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        System.out.print(a + ", " + b); // Print the first two terms
        
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        
        System.out.println();
    }
}




