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

	5)....write a program to find the sum of elements of the array only the even numbers or elements in the odd position only .....
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

22/06/2024
1).write the program to find biggest among three numbers by giving user input and in ternary operator and in eclipse...?
	package ternaryop;

import java.util.Scanner;

public class TernaryOpForBigAmongThree {

	public static void main(String[] args) {
		
     /* this code is for giving inputs itself in the code
      int a = 40;
      int b = 30;
      int c = 20;
      System.out.println((a>b) ? (a>c)?"a is bigger" : "c is bigger":(b>c)?"bis bigger":"c is bigger");
	*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number num1");
		int num1 = sc.nextInt();
		
		System.out.println("enter the second number num2");
		int num2 = sc.nextInt();
		
		System.out.println("enter the third number num3");
		int num3 = sc.nextInt();
		
		System.out.println((num1>num2) ? (num1>num3) ? "num1 is big" : "num3 is big" :(num2>num3) ? "num2 is big" : "num3 is big");
		//int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		
		
}
}

2).write a program to print the day by giving day number...
	public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    switch(n){
	    case 1:
	        System.out.println("monday");
	        break;
	    case 2:
	        System.out.println("tuesday");
	        break;
	    case 3:
	        System.out.println("wednesday");
	        break;
	    case 4:
	        System.out.println("thursday");
	        break;
	    case 5:
	        System.out.println("friday");
	        break;   
	    case 6:
	        System.out.println("saturday");
	        break;     
	    case 7:
	        System.out.println("sunday");
	        break;     
	    default:
	        System.out.println("invalid number given");
	    }
		
	}
}

3).write a program to find the day by giving day number as user input in switch statement...?
	import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("enter the day number");
	    int n=sc.nextInt();
	    
	    switch(n){
	    case 1:
	        System.out.println("monday");
	        break;
	    case 2:
	        System.out.println("tuesday");
	        break;
	    case 3:
	        System.out.println("wednesday");
	        break;
	    case 4:
	        System.out.println("thursday");
	        break;
	    case 5:
	        System.out.println("friday");
	        break;   
	    case 6:
	        System.out.println("saturday");
	        break;     
	    case 7:
	        System.out.println("sunday");
	        break;     
	    default:
	        System.out.println("invalid day number given");
	    }
		
	}
}
3).write a program to convert celsius to fehrenheit and convert from fehrenheit to celsius....?
	package ternaryop;

public class Assignment {

	public static void main(String[] args) {
		
		TemperatureConverter tc = new TemperatureConverter();
		
		/*celsius=(fehrenheit-32)*5/9;
		fehrenheit=(celsius*9/5) -32;
		*/
		double celsius1 = tc.toCelsius(100.76);
		double fehrenheit1 = tc.toFehrenheit(36.876);
		
		System.out.println(celsius1);
		System.out.println(fehrenheit1);

	}

}
class TemperatureConverter{
	public double toCelsius(double fehrenheit) {
		double celsius=(fehrenheit -32) * 5 / 9;
		return celsius;
	}
	public double toFehrenheit(double celsius) {
		double fehrenheit=(celsius * 9 / 5) +32;
		return fehrenheit;
	}
}
4).Problem: Body Mass Index (BMI) Calculation
Description:
Create a class BMI that calculates the Body Mass Index (BMI) for a person. The class should have the following features:

Attributes:

weight (double) - weight in kilograms.
height (double) - height in meters.
Methods:

calculateBMI(): Returns the BMI calculated using the formula:
BMI
=
weight
height
2
BMI= 
height 
2
 
weight

 
getBMICategory(): Returns the BMI category as a string based on the BMI value:
"Underweight" if BMI < 18.5
"Normal weight" if 18.5 <= BMI < 24.9
"Overweight" if 25 <= BMI < 29.9
"Obesity" if BMI >= 30
Tasks:
Define the BMI class with the specified attributes and methods.
In the main method:
Create an instance of the BMI class.
Call the calculateBMI() and getBMICategory() methods.
Print the BMI value and its category.

package ternaryop;

public class Assign {

	public static void main(String[] args) {
		
      BMI bmi = new BMI();
      
      double totBMI1 = bmi.calculateBMI(22.64, 11.65);
      System.out.println(totBMI1);
      
      String category1 = bmi.getBMICategory(totBMI1);//String category1 = bmi.getBMICategory(totBMI1);

      System.out.println(category1);
      
	}

}
class BMI{
	public double calculateBMI(double weight, double height) {
		double totBMI = weight/height*height;
		return totBMI;
	}
	public String getBMICategory(double BMI) {
		if(BMI<18.5) {
			return "underweight";
		}
		else if(BMI>=18.5 && BMI<=24.9) {
			String category = "normal weight";
			return category;
		}
		else if(BMI>=25 && BMI<=29.9) {
			String category ="overweight";
			return category;
		}
		else if(BMI>=30) {
			return "obesity";
		}
		else {
			return "invalid input given";
		}
	}
}
5).Simple Quiz Game
Write a Java program for a simple quiz game with multiple-choice questions. The program should:

Store a few questions and their correct answers.
Display each question with options (A, B, C, D).
Prompt the user to enter their answer (A, B, C, or D).
Use a switch statement to check if the user's answer matches the correct answer for each question.
Keep track of the score and display it at the end of the quiz.
These problems vary in complexity and require you to utilize user input handling along with the switch statement to implement different functionalities such as arithmetic operations, day conversion, and quiz evaluation. They provide a good opportunity to practice control flow and decision-making in Java programming.
	import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        // Questions and Answers
        String[][] questions = {
            {"What is the capital of France?", "A. Paris", "B. London", "C. Rome", "D. Berlin", "A"},
            {"Which planet is known as the Red Planet?", "A. Jupiter", "B. Mars", "C. Venus", "D. Saturn", "B"},
            {"What is the largest mammal?", "A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Lion", "B"}
        };
        
        // Display each question with options
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0]); // Display question
            System.out.println("Options:");
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]); // Display options A, B, C, D
            }
            
            // Prompt user for input
            System.out.print("Enter your answer (A, B, C, or D): ");
            String answer = scanner.nextLine().toUpperCase(); // Convert input to uppercase
            
            // Check answer using switch statement
            switch (answer) {
                case "A":
                case "B":
                case "C":
                case "D":
                    if (answer.equals(questions[i][5])) {
                        System.out.println("Correct!\n");
                        score++;
                    } else {
                        System.out.println("Incorrect. The correct answer is " + questions[i][5] + ".\n");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please enter A, B, C, or D.\n");
                    i--; // Decrement i to repeat the same question
                    break;
            }
        }
        
        // Display final score
        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length);
        
        scanner.close();
    }
}

23/06/2024
	1).Question 2: Calculate Factorial of a Number
Write a program that calculates the factorial of a number entered by the user. The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.

Steps:
Prompt the user to enter a non-negative integer (n).
Read the integer using Scanner.
Implement a method to compute the factorial of n.
Output the factorial value.
package ternaryop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter any number:");
        int n = sc.nextInt();
        
        /*if (n < 0) {
            System.out.println("Factorial not possible for negative numbers");
        } else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of number " + n + " is " + fact);
        }*/
        
        Fact f = new Fact();
        long factorial = f.findFact(n);
        
        System.out.println(factorial);
    }
}

class Fact {
    public long findFact(int n) {
        if (n < 0) {
            System.out.println("Factorial for negative number is not possible");
            return -1; // Returning -1 to indicate an error
        } else {
            long factorial = 1; // Initialize factorial to 1
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial; // Return the computed factorial
        }
    }
}

24/06/2024
1)if today is monday after certain number of days by giving userinput you have to find the dayname write a java program for this ...?
	import java.util.Scanner;

public class FindDayName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the starting day name
        System.out.print("Enter the starting day name (e.g., Monday): ");
        String dayName = sc.next().toLowerCase(); // Read and convert to lowercase

        // Prompt user for the number of days after today
        System.out.print("Enter the number of days after today: ");
        int numDays = sc.nextInt();

        // Calculate future day index
        int startDayIndex = getDayIndex(dayName);
        int futureDayIndex = (startDayIndex + numDays) % 7; // Use modulus to wrap around the days

        // Array of day names
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Output the future day name
        String futureDayName = dayNames[futureDayIndex];
        System.out.println("After " + numDays + " days, the day will be: " + futureDayName);

        sc.close();
    }

    // Method to get the index of the day name in the array
    private static int getDayIndex(String dayName) {
        switch (dayName) {
            case "monday": return 0;
            case "tuesday": return 1;
            case "wednesday": return 2;
            case "thursday": return 3;
            case "friday": return 4;
            case "saturday": return 5;
            case "sunday": return 6;
            default: throw new IllegalArgumentException("Invalid day name entered");
        }
    }
}
  or......
	  package ternaryop;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class FindDayName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting day name (e.g., Monday):");
        String dayName = sc.nextLine().trim().toLowerCase(); // Read and normalize input

        DayOfWeek startDay = DayOfWeek.valueOf(dayName.toUpperCase()); // Convert input to DayOfWeek enum

        System.out.println("Enter the number of days after today:");
        int numDays = sc.nextInt();

        LocalDate today = LocalDate.now();
        DayOfWeek futureDay = startDay.plus(numDays); // Calculate future day

        // Get the localized name of the future day
        String futureDayName = futureDay.getDisplayName(TextStyle.FULL, Locale.getDefault());

        System.out.println("After " + numDays + " days, the day will be: " + futureDayName);

        sc.close();
    }
}

2).we will have 3 inputs we have to WAP to check whether 
i).all the numbers re are equal

ii).all the numbers are different

iii).all the numbers are neither equal nor different
	
package ternaryop;

import java.util.Scanner;

public class NumEqualness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int n3 = sc.nextInt();
        
        if (n1 == n2 && n2 == n3) {
            System.out.println("All numbers are equal");
        } else if (n1 != n2 && n2 != n3 && n3 != n1) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("All the numbers are neither equal nor different");
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
3).write a java program to find the given year is leap year or not...?
package ternaryop;

public class LeapYear {

    public static void main(String[] args) {
        String days = "365";

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
            }
        }
    }
}
4).write a program to find whether the given character is vowel or not...?
	package ternaryop;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character: ");
        char c = sc.next().toLowerCase().charAt(0);
        
        Alphabet alf = new Alphabet();
        
        String s = alf.getVowel(c);
        System.out.println(s);
       
        String s1 = alf.getConsonant(c);
        System.out.println(s1);
    }
}

class Alphabet {
    public String getVowel(char ch) {
        switch(ch) {
            case 'a':
                return "a is a vowel";
            case 'e':
                return "e is a vowel";
            case 'i':
                return "i is a vowel";
            case 'o':
                return "o is a vowel";
            case 'u':
                return "u is a vowel";
            default:
                return "consonant";
        }
    }

    public String getConsonant(char c) {
        if ((c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
            return c + " is a consonant";
        }
        return "invalid consonant or vowel";
    }
}
25/06/2024
1).you have to read 4 integer values a,b,c,d 70,5,50, 80 all are true then print Hi forst are true & went ang of then are false print Hello.
if first one Itrelf is falre print Bye
70,50,100,80 Hi
70,6,20,30 Hello
7,50,100,80 Bye	

package conditional;

import java.util.Scanner;

public class Read {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the first number");
        int a = sc.nextInt();
        
        System.out.println("enter the second number");
        int b = sc.nextInt();

        System.out.println("enter the third number");
        int c = sc.nextInt();

        System.out.println("enter the fourth number");
        int d = sc.nextInt();
        
        if ((a >= 50 && a <= 100) && (b >= 50 && b <= 100) && (c >= 50 && c <= 100) && (d >= 50 && d <= 100)) {
            System.out.println("Hi");
        } else if (a < 50) {
            System.out.println("Bye");
        } else {
            System.out.println("Hello");
        }
    }
}

2).write a program to find the given year is leap year or not...?
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

3).


