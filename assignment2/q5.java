/*
 Write a Java program that takes two numbers as input and display the product of 
two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125

	System.out.println(i);
*/
import java.util.Scanner;
class q5
{public static void main(String args[])
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first num");
	int num = sc.nextInt();
	
	System.out.println("enter the second num");
	int num2 =sc.nextInt();
	
	int output = num * num2;
	
	System.out.println("output ="+output);
}
}
