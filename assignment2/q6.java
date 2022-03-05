/*
Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 25 = 5
*/
import java.util.Scanner;
class q6
{ 
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your valiue a");
		int a = sc.nextInt();
		
		System.out.println("enter the value b");
		int b = sc.nextInt();
		
		int m = a + b ;
		int n = a- b ;
		int o = a * b;
		double p = a / b;
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
	}
	
	
}