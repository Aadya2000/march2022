/*12. Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers.
*/
import java.util.*;

class Q12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your num1");
		double num1 = sc.nextDouble();
		
		
		System.out.println("enter your num2");
		double num2 = sc.nextDouble();
		
		System.out.println("enter your num3");
		double num3 = sc.nextDouble();
		
		double avarage = (num1+num2+num3)/3;
		
		System.out.println("avarage = "+avarage);
		
	}
}