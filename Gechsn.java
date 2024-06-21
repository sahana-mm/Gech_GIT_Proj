1).To add two number and store in a another variable.
  public class Gechsn{
  public static void main(String[] args){
    int a=1,b=2;
    int sum=a+b;
    System.out.println(sum);
  }
}
2).to subtract two numbers and store it in another variable.
  public class Gechsn{
  public static void main(String[] args){
    int a=30,b=40;
    int sub=a-b;
    System.out.println(sub);
  }
}

1). What is public static void main(String[] args) in java...?
  "public" is an access modifier which allows to access class from anywhere it means method would be visible in other packages.
  "static" is a keyword which hepls the main method to run without creating any objects.
  "void" is akeyword used we dont want to return anything from method or function.
  function "main()" its default signature is defined in jvm, whenever we try to run java file first they looks for main function, without main function the main function will not run.
  main() method is the entry point of the java program for the java virtual machine (jvm).
  "String[] args" is used to command line argument of String type array.
  "System.out.println" "System" is a final calss from the java dawline package 
"out" is a class variable of type print String declared in the system class
  "println" is the method of print String class.

  2).Swapping two numbers in Java.
  swapping two numbers by using another temporary variable.
  public calss Swapping{
  public static vois main(String[] args){
    int a=1,b=2;
    //before swapping
    System.out.println("Before swapping:" + a + " ", + b);
    //after swapping using temporary variable
    //logic 1- using third variable
    int c=a;
    a=b;
    b=c;
    System.out.println("After swapping:" + a + " " , + b);
    //logic 2-using + and - operators 
    int a=1,b=2;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("swapped numbers are:" +a+ " " +b);
    //logic 3- using * and / operators
    int a=1,b=2;
    a=a*b;
    b=a/b;
    a=a/b;
    System.out.println("swapped numbers are:" +a+ " " +b);
    //logic 4- using XOR operator
    int a=1,b=2;
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("swapped numbers are:" +a+ " " +b);
    here the XOR operator convert two numbers into binary digit first.
      truth table of  a XOR b
                   a        b         aXORb
                   0        0           0
                   0        1           1
                   1        0           1
                   1        1           0

here binary digit of a=1 is 0001 and b=2 is 0010
then 0001
     0010
     0011 is equals to 3
  for a=10 and b=20
       1010
      10100
      11110 is 30
  //logic 5- single statement
  int a=10,b=20;
    b=a+b-(a=b);
   /*(this execution starts from right to left)
     here b=a+b-(a=b)
            a=10,b=20 and in a=b==20 (here the value of b will be assigned to a then a=20)
b=10+20-20
  30-20
  10
  then b=10;
  and in (a=b) we assign value of a will be 20 so, a=20*/.

    System.out.println("swapped numbers are:" +a+ " " +b);
    
  }
}

public class Main {
  public static void main(String[] args){
    System.out.println("Hello World!");
  }
  }
3). Reverse of a number in javaprogramming.
  1).take input from the user
  import java.util.Scanner;
  public class ReverseNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
    int num=sc.nextInt();
    int rev=0;
   while(num!=0)
   {
     rev = rev*10+num%10;
     num=num/10;
   }
    System.out.println("reverse of a number is "+rev);
  }
  }

4).write a java program to divide numbers and print divide by zero error if the denomenator is 0..?
  import java.util.Scanner;
  public class Divide{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number:");
    int num1 = sc.nextInt();
    System.out.println("enter the second number:");
    int num2 = sc.nextInt();
    int num3;
    if(num2 !=0)
    {
        num3 = num1/num2;
    System.out.println("result:" +num3);
    }
    else{
      System.out.println("Divide by Zero error");
    }
    sc.close();
    }
  }
5).to create a calculator program and print the output if the operator is not given then exit from the condition...?
  package com.palletechnologies.myfirstproject;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float a,b,result;
		System.out.println("enter the two numbers to be calculated");
	      a = sc.nextFloat();
	      b = sc.nextFloat();
	      System.out.println("1.addition\n 2.subtraction\n 3.multiplication\n 4.division\n ");
	      System.out.println("choose the operation");
	      int op = sc.nextInt();
	      switch(op) {
	      case 1:
	    	  result = a+b;
	    	  break;
	      case 2:
	    	  result = a-b;
	    	  break;
	      case 3:
	    	  result = a*b;
	    	  break;
	      case 4:
	    	 
	    	  if(b != 0) {
	    		  System.out.println(result=a/b);
	    	  }
	    	  else {
	    		  System.out.println("divide by zero error");
	    	  }
	    	  break;
	      case 5:
	    	  System.exit(op);
	    	  default:
	    		  System.out.println("entered invalid operator");
	    	return;
	      }
	      System.out.println(result);
	}

}



08/06/2024
1).objects assignments
[1].create object of nurse class in main method display data present in nurse object...?
[2].create object of patients class in main method display data present in patients object...?	
	package com.palletechnologies.myfirstproject;

public class ObjectAssignments {

	public static void main(String[] args) {
	Nurse n = new Nurse();
	Patients p = new Patients();
	
	System.out.println(n.name);
	System.out.println(n.qualif);    
	System.out.println(n.Age);
	    
	System.out.println("the nurse name is " + n.name);
	System.out.println("the nurse qualification is " + n.qualif);
	System.out.println("the nurse age is " + n.Age);
    
	
	System.out.println(p.name);
	System.out.println(p.age);
	System.out.println(p.BloodGroup);
	System.out.println(p.disease);
	
	System.out.println("the patient name is " + p.name);
	System.out.println("the patient age is " + p.age);
	System.out.println("the patient Blood Group is " + p.BloodGroup);
	System.out.println("the patient disease is " + p.disease);
	}

}
class Nurse{
	public String name = "vani";
	public String qualif = "nursing";
	public int Age = 26;
	
}
class Patients{
	public String name = "Suleman";
	public int age = 79;
	public String BloodGroup = "o+ve";
	public String disease = "viral fever";
}

10/06/2024
1).methods creation inside the class and main statements in java programming.	

package com.palletechnologies.myfirstproject;

public class Methods {

	public static void main(String[] args) {
Methods methods = new Methods();
		
		// Example usage of methods
		char result1 = methods.m5("example", 5);
		float result2 = methods.m1("example", true);
		int result3 = methods.m3('c');

		System.out.println("Result of m5: " + result1);
		System.out.println("Result of m1: " + result2);
		System.out.println("Result of m3: " + result3);
		
	}
		public char m5(String s, int x)
		{
        char c = 's';
        return c;
	}
		public float m1(String s,boolean b)
		{
			float f = 1.1f;
			return f;
		}
		public int m3(char c)
		{
			int x = 10;
			return x;
		}
	}

11/06/2024
1).create a addition,subtraction,multiplication and division methods ins the Calci class and perform operation...?
	package com.palletechnologies.MyFfrstprogram;

public class MethodsAssignments2 {

	public static void main(String[] args) {
		Methods m = new Methods();
		        int sum1 = m.add(1,2);
                System.out.println(sum1);
                double sub1 = m.sub(1.2, 1.1);
                System.out.println(sub1);
                int mul1 = m.mul(3,6);
                System.out.println(mul1);
                double div1 = m.div(2.2, 1.1);
                System.out.println(div1);
	}

}

class Methods
{
public int add(int x,int y)
{
	int sum1 = x + y;
	return sum1;
}
public double sub(double d,double e)
{
	double sub1 = d - e;
	return sub1;
}
public int mul(int m,int n) {
	int mul1 = m*n;
	return mul1;
}
public double div(double p, double q)
{
	double div1 = p/q;
	return div1;
}
}
2).create a areaoftriangle by creating class Triangle and using getArea as a method
	package com.palletechnologies.MyFfrstprogram;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        double area = t.getArea(2.2, 2.3);
        System.out.println(area);
    }

}

class Triangle {
    public double getArea(double b, double h) {
        double area = 0.5 * b * h;
        return area;
    }
}
here we can use double area = (1.0/2.0) *b * h;
12/06/2024
1).methods assignment.....
	package com.palletechnologies.MyFfrstprogram;

public class MethodsAssignments {

	public static void main(String[] args) {

     MethodsAssignments methods = new MethodsAssignments();
		
		// Example usage of methods
		char c1 = methods.m5("example", 5);
		float f1 = methods.m1("example", true);
		int i1 = methods.m3('c');

		System.out.println("Result of m5: " + c1);
		System.out.println("Result of m1: " + f1);
		System.out.println("Result of m3: " + i1);
		
	}
		public char m5(String s, int x)
		{
        char c = 's';
        return c;
	}
		public float m1(String s,boolean b)
		{
			float f = 1.1f;
			return f;
		}
		public int m3(char c)
		{
			int x = 10;
			return x;
		}
	
}

2)....
	package com.palletechnologies.MyFfrstprogram;

public class MethodsAssignments2 {

	public static void main(String[] args) {
		Methods m = new Methods();
		        int sum1 = m.add(1,2);
                System.out.println(sum1);
                double sub1 = m.sub(1.2, 1.1);
                System.out.println(sub1);
                int mul1 = m.mul(3,6);
                System.out.println(mul1);
                double div1 = m.div(2.2, 1.1);
                System.out.println(div1);
	}

}

class Methods
{
public int add(int x,int y)
{
	int sum1 = x + y;
	return sum1;
}
public double sub(double d,double e)
{
	double sub1 = d - e;
	return sub1;
}
public int mul(int m,int n) {
	int mul1 = m*n;
	return mul1;
}
public double div(double p, double q)
{
	double div1 = p/q;
	return div1;
}
}

3).Create methods inside the methods...
	package com.palletechnologies.MyFfrstprogram;

public class MethodInsideMethod {

	public static void main(String[] args) {
	    Circle1 c = new Circle1();
	    float area1 = c.getArea(6);
	    System.out.println(area1);

	}

}
    class Circle1 {
    	
         public float getArea(int r)
         {
        	 float area = 3.142f*r*r;
        	
        	 double circumference = getCircumference(12);
        	 System.out.println(circumference);
        	 return area;
         }
    	public double getCircumference(int r)
    	{
    		double circum = 2*3.142*r;
    		return circum;
    	}
    }

4)....
	package com.palletechnologies.MyFfrstprogram;

public class MethodInsideMethods {

	public static void main(String[] args) {
	     Method m = new Method();
	     int addition = m.Add(6, 5);
	     System.out.println(addition);

	}

}
class Method{
	public int Add(int a,int b) {
		int add = a+b;
		float subtraction = Sub(2.3f,1.5f);
		System.out.println(subtraction);
		return add;
	}
	public float Sub(float x,float y) {
		float sub = x - y;
		return sub;
	}
}
13/06/2024
1).Naming convention in pl...?
	**pascal casing... for project names, class names and interface names...(like MyFirstProject)....
	**camel casing...for variable names and method names...(like getAddition)....
2).BreakPoints...
	By double clicking in the left side of the line where the code writtern line by line..
	Right click on code page and debug as javaa application 
	the buttons like fn+f6 for line by line dubugging for the detection of the errors in the code 
	the buttons like fn+f8 for execution of the code by jumping one function to another function and give the output in the console screen.

	Debugging Crashes
	1).Compile time error and 2).run time error
3).the code which shows exception and this exception is one of the error type of the run time error...
	package debuggingcrashes;

public class DebuggingEx {

	public static void main(String[] args) {
		int i =10;
		System.out.println("Hi");
		System.out.println("Good Morning");
		int j = i/0;    //abruptly means suddenly stop the execution
		System.out.println("Hello");
		System.out.println(j);
		

	}

}

14/06/2024
	conditional statements...
	1).if
	2).if else
	3).if- else if
	4).nested if
	5).switch
	6).ternary operator(?:)	
18/06/2024
	operators
	1).arithmetic operators
	a). + (addition)
	b). - (subtraction)
	c). * (multiplication)
	d). / (division)   to get quotient
	e). % (modulus)to get reminder
	2).logical operators
	a). AND (&&)
	b). OR (||)
	c). NOT (!)
	3).relational operators
	a).  >
        b).  < 
	c). ==
	d). <=
	e). >=
    

1)).print the statements according to the conditions
package conditional;

public class Sample1 {

	public static void main(String[] args) {
		int x =14;
		if(x==10)
		{
			System.out.println("Hi");
		}
		else if(x==14) 
		{
			System.out.println("Hello");
		}
		else if(x==20)
		{
			System.out.println("Bye");
		}
		//the else part is may be included or else not included it may be present or not
		else
		{
			System.out.println("Invalid number entered");
		}
	}

}

2)).package conditional;

public class Sample3 {

	public static void main(String[] args) {
	String fruitname = "mango";
	
	if(fruitname == "apple") {
		System.out.println("one");
	}
	
	else if(fruitname == "banana") {
		System.out.println("two");
	}
	
	else if(fruitname == "mango") {
		System.out.println("three");
	}
	else {
		System.out.println("four");
	}

	}

}

3)).to print the number which is odd or even
	package conditional;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 28;
		int rem = num%2;
		if(rem==1)
		{
			System.out.println("Odd");
		}
		else if(rem==0)
		{
			System.out.println("Even");
		}
	}

}
4)).write a program to find biggest among two numbers...
	package conditional;

public class BigAmongNumbers {

	public static void main(String[] args) {
		
				int num1 = 20, num2 = 30;
				
				if(num1 >num2) 
				{
					System.out.println(num1);
				}	
					else 
					{
						System.out.println(num2);
				    }
				}
                            }   
      
19/06/2024
1). write the code to find biggest among two numbers and their sum also by giving user input.....?
	user input hives by creating a Scanner class and create object for it and also use the default in built methods which are given by sun micro systems...
	package scanner;

import java.util.Scanner;

public class BigAmongNumbers {

	public static void main(String[] args) {
		
		//req:Writea Program to find Biggest among two numbers
		
		Scanner sc = new Scanner(System.in);
		
		   System.out.println("enter the first number");
		   int x = sc.nextInt();
		   
		   System.out.println("enter the second number");
		   int y = sc.nextInt();
		  
		   int sum = x+y;
		   System.out.println("the sum of two numbers is " + sum);
		   if(x>y) {
			   System.out.println(x + "is bigger");
		   }
		   else {
			   System.out.println(y + " is bigger than x");
		   }
		   System.out.println("enter the name...");
		   String s =sc.next();
          		   
		

	}

}
2).Find out the dayNum by using dayName...?
	package scanner;

import java.util.Scanner;

public class DayNumUsingDayName {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the day name");
        String DayName = sc.next().intern();
        if(DayName=="Monday")
        {
        	System.out.println(1 + "is the day num of monday");
        }
        else if(DayName=="Tuesday")
        {
        	System.out.println(2 + " is the day num of tueday");
        }
        else if(DayName=="Wednesday")
        {
        	System.out.println(3 + " is the day num of wednesday");
        }
        else if(DayName=="Thursday")
        {
        	System.out.println(4 + " is the day num of thursday");
        }
        else if(DayName=="Friday")
        {
        	System.out.println(5 + " is the day num of friday");
        }
        else if(DayName=="Saturday")
        {
        	System.out.println(6 + " is the day num of saturday");
        }
        else if(DayName=="Sunday")
        {
        	System.out.println(7 + " is the day num ofsunday");
        }
        else 
        {
        	System.out.println("invalid day name entered");
        }

        
	}

}
3).using multiple expressions in conditional statements 
package scanner;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      if(2<4 && 1>0)
      {
    	  System.out.println("yes both conditions true it execute if block statement");
      }
      else
      {
    	  System.out.println("if any one condition is false then else block will be executed");
      }
	}

}

4).find the day name by using day number apply daynumners in the conditional blocks.....?
	package scanner;

import java.util.Scanner;

public class DayNameUsingDayNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the day num");
       int DayNum = sc.nextInt();
        if(DayNum==1)
        {
        	System.out.println("monday");
        }
        else if(DayNum==2)
        {
        	System.out.println("tueday");
        }
        else if(DayNum==3)
        {
        	System.out.println("wednesday");
        }
        else if(DayNum==4)
        {
        	System.out.println("thursday");
        }
        else if(DayNum==5)
        {
        	System.out.println("friday");
        }
        else if(DayNum==6)
        {
        	System.out.println("saturday");
        }
        else if(DayNum==7)
        {
        	System.out.println("sunday");
        }
        else 
        {
        	System.out.println("invalid day naumber entered");
        }

        
	}

}
20/06/2024
1)write a program for calculating the total sales cost based on the fallowing canditions...?
	package conditional;

import java.util.Scanner;

public class FruitShopping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the fruit name");
		String fruit1 = s.next();
		System.out.println("enter the quantity");
		int qty1 = s.nextInt();
		
		FruitShop fs = new FruitShop();
		int TOTALCOST = fs.getTotalCost(fruit1, qty1);
        System.out.println(TOTALCOST);
	}

}
class FruitShop{
	public int getTotalCost(String fruit, int qty) {
		if(fruit.equals("apple") && qty <10) {
			int totcost =qty*15;
			return totcost;
		}
		else if(fruit.equals("apple") && (qty >= 10 && qty <= 20)) {
			int totcost =qty*13;
			return totcost;
		}
		else if(fruit.equals("apple") && qty >20) {
			int totcost =qty*12;
			return totcost;
		}
		else if(fruit.equals("orange") && qty <20) {
			int totcost =qty*8;
			return totcost;
		}
		else if(fruit.equals("orange") && qty >=20) {
			int totcost =qty*7;
			return totcost;
		}
		else if(fruit.equals("banana") && qty <100) {
			int totcost =qty*3;
			return totcost;
		}
		else if(fruit.equals("banana") && qty >=100) {
			int totcost =qty*2;
			return totcost;
		}
		else {
			System.out.println("invalid fruitname entered");
			return 0;
		}	
		
	}
}
2)....here why we are taking fruit.equals(fruitname) means.......
	String s1 = "saan";
        String s2 = "saan";
       (s1 == s2)
	       s1.equals(s2)     we shold take why because s1 and s2 are the variables they are storing the address of the varisbles....
	       and "saan" "saan" are data's....or content data.
import java.util.Scanner;: This imports the Scanner class from the java.util package, which is used for reading input from the user.

FruitShopping Class
java
Copy code
package conditional;

import java.util.Scanner;

public class FruitShopping {
package conditional;: This declares that the class FruitShopping is part of the conditional package.
import java.util.Scanner;: This imports the Scanner class from the java.util package, which is used for reading input from the user.
public class FruitShopping {: This declares the FruitShopping class. It is a public class, meaning it can be accessed from other classes.
java
Copy code
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
public static void main(String[] args): This is the main method, which is the entry point of any Java application. The main method is static, so it can be called without creating an instance of the class.
Scanner s = new Scanner(System.in);: This creates a Scanner object s to read input from the standard input stream (keyboard).
java
Copy code
        System.out.println("enter the fruit name");
        String fruit1 = s.next();
System.out.println("enter the fruit name");: This prints a prompt message to the console asking the user to enter the fruit name.
String fruit1 = s.next();: This reads a string input from the user and stores it in the variable fruit1.
java
Copy code
        System.out.println("enter the quantity");
        int qty1 = s.nextInt();
System.out.println("enter the quantity");: This prints a prompt message to the console asking the user to enter the quantity of the fruit.
int qty1 = s.nextInt();: This reads an integer input from the user and stores it in the variable qty1.
java
Copy code
        FruitShop fs = new FruitShop();
        int TOTALCOST = fs.getTotalCost(fruit1, qty1);
        System.out.println(TOTALCOST);
    }
}
FruitShop fs = new FruitShop();: This creates an instance of the FruitShop class.
int TOTALCOST = fs.getTotalCost(fruit1, qty1);: This calls the getTotalCost method of the FruitShop instance fs with the user-provided fruit name and quantity, and stores the result in the variable TOTALCOST.
System.out.println(TOTALCOST);: This prints the total cost to the console.
FruitShop Class
java
Copy code
class FruitShop {
    public int getTotalCost(String fruit, int qty) {
class FruitShop {: This declares the FruitShop class. It is a default access class, meaning it can only be accessed by other classes in the same package.
public int getTotalCost(String fruit, int qty) {: This declares the getTotalCost method, which takes a String representing the fruit and an int representing the quantity, and returns an int representing the total cost.
java
Copy code
        if (fruit.equals("apple") && qty < 10) {
            int totcost = qty * 15;
            return totcost;
        } else if (fruit.equals("apple") && (qty >= 10 && qty <= 20)) {
            int totcost = qty * 13;
            return totcost;
        } else if (fruit.equals("apple") && qty > 20) {
            int totcost = qty * 12;
            return totcost;
        }
This block checks if the fruit is an apple and calculates the total cost based on the quantity:
If the fruit is "apple" and quantity is less than 10, the cost is 15 per apple.
If the fruit is "apple" and quantity is between 10 and 20 (inclusive), the cost is 13 per apple.
If the fruit is "apple" and quantity is greater than 20, the cost is 12 per apple.
java
Copy code
        else if (fruit.equals("orange") && qty < 20) {
            int totcost = qty * 8;
            return totcost;
        } else if (fruit.equals("orange") && qty >= 20) {
            int totcost = qty * 7;
            return totcost;
        }
This block checks if the fruit is an orange and calculates the total cost based on the quantity:
If the fruit is "orange" and quantity is less than 20, the cost is 8 per orange.
If the fruit is "orange" and quantity is 20 or more, the cost is 7 per orange.
java
Copy code
        else if (fruit.equals("banana") && qty < 100) {
            int totcost = qty * 3;
            return totcost;
        } else if (fruit.equals("banana") && qty >= 100) {
            int totcost = qty * 2;
            return totcost;
        }
This block checks if the fruit is a banana and calculates the total cost based on the quantity:
If the fruit is "banana" and quantity is less than 100, the cost is 3 per banana.
If the fruit is "banana" and quantity is 100 or more, the cost is 2 per banana.
java
Copy code
        else {
            System.out.println("invalid fruitname entered");
            return 0;
        }
    }
}
else { ... }: This block handles the case where the fruit name is not recognized:
It prints "invalid fruitname entered" to the console.
It returns 0, indicating an invalid input.                                                           


3).You are tasked with creating a program that calculates the shipping cost based on the weight of a package. Here are the requirements:

Ask the user to enter the weight of the package in kilograms.
Calculate the shipping cost based on the following rules:
If the weight is less than 2 kg, the cost is $5 per kg.
If the weight is between 2 kg (inclusive) and 5 kg (exclusive), the cost is $4 per kg.
If the weight is 5 kg or more, the cost is $3 per kg.
Print the total shipping cost.	


	package conditional;

import java.util.Scanner;

public class ShippingCost {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the weight of the package");
			float Weight = s.nextFloat();
		
		
			ShippingCost1 sc = new ShippingCost1();
			float TOTALSHIPPINGCOST = sc.totalShippingCost(Weight);
			System.out.println("the total cost of the package is " + TOTALSHIPPINGCOST);
			System.out.println(TOTALSHIPPINGCOST);
			

	}

}
class ShippingCost1{
	public float totalShippingCost(float weight) {
		
		if(weight<2) {
		float totshipcost = weight*5;
		return totshipcost;
	    }
		
	    else if(weight>2 && weight<5) {
	    float totshipcost = weight*4;
		return totshipcost;
	    }
		
	    else if(weight>2 && weight<5) {
	    float totshipcost = weight*4;
		return totshipcost;
	    }
		
	    else if(weight>5) {
		float totshipcost = weight*3;
	    return totshipcost;
	    } 
		
	    else {
	    	System.out.println("invalid weight enterde");
	    	return 0;
	    }
		
		
	}
}

if we enter the weight of package in float datatype then use above code ...
 
4).if we want to get total weight of the package in integer data type and we should also give inputs of the type integer we use belove code.....
	package conditional;

import java.util.Scanner;

public class ShippingCost {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the weight of the package");
			int  Weight = s.nextInt();
		
		
			ShippingCost1 sc = new ShippingCost1();
			int TOTALSHIPPINGCOST = sc.totalShippingCost(Weight);
			System.out.println("the total cost of the package is " + TOTALSHIPPINGCOST);
			System.out.println(TOTALSHIPPINGCOST);
			

	}

}
class ShippingCost1{
	public int totalShippingCost(int weight) {
		
		if(weight<2) {
		int totshipcost = weight*5;
		return totshipcost;
	    }
		
	    else if(weight>2 && weight<5) {
	    int totshipcost = weight*4;
		return totshipcost;
	    }
		
	    else if(weight>2 && weight<5) {
	    int totshipcost = weight*4;
		return totshipcost;
	    }
		
	    else if(weight>5) {
		int totshipcost = weight*3;
	    return totshipcost;
	    } 
		
	    else {
	    	System.out.println("invalid weight enterde");
	    	return 0;
	    }
		
		
	}
}

21/06/2024
1).write a program to find the user given character in the console screen is vowel or consonant...?
	package scanner;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the chracter");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
        	System.out.println("it is a vowel");
        }
        else if(ch>'a' && ch<='z') {
        	System.out.println("it is consonant");
        }
        else if(ch>='0' && ch<='9') {
        	System.out.println("it is digit");
        }
        else {
        	System.out.println("it is special character");
        }
	}

}
2).not anly for  small 'a' it should also print output as vowel for both a and A...?
	package scanner;

import java.util.Scanner;

public class AlphabetCapsAlso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the chracter");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
        	System.out.println("it is a vowel");
        }
        
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
        	System.out.println("it is a vowel");
        }
        
        else if(ch>'a' && ch<='z') {
        	System.out.println("it is consonant");
        }
        
        else if(ch>='0' && ch<='9') {
        	System.out.println("it is digit");
        }
        
        else {
        	System.out.println("it is special character");
        }

	}

	5)....write a program to find the sun of elements of the array only the even numbers or elements in the odd position only .....
	package scanner;

import java.util.Scanner;

public class S {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int sum = 0;

        System.out.println("Enter the 4 numbers of the array:");

        // Input 4 elements into the array
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        // Iterate through the array
        for (int i = 0; i < 4; i++) {
            // Check if the index is even (1-based index: 1, 3) in a 0-based index and if the value is even
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        // Print the sum
        System.out.println("The sum is " + sum);

        sc.close();
    }
}


}
