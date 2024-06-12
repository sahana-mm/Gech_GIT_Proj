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
    int sum=a-b;
    System.out.println(sum);
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


	




