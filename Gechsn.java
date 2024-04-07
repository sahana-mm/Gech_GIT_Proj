*To add two number and store in a another variable.
  public class Gechsn{
  public static void main(String[] args){
    int a=1,b=2;
    int sum=a+b;
    System.out.println(sum);
  }
}

*to subtract two numbers and store it in another variable.
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

  2).Swapping two numbers in Java
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
  and in (a=b) we assign value of a will be 20 so, a=20*/

    System.out.println("swapped numbers are:" +a+ " " +b);
    
  }
}

