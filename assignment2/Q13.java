/*13. Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/


import java.util.Scanner;
class Q13
{public static void main(String args[])
{	
	final double pi = 3.142;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter length");
	double length = sc.nextDouble();
	
	System.out.println("enter bredth");
	double bredth = sc.nextDouble();
	
	double parimeter = (2 *(length+bredth) );
	double area      = ( length * bredth);
	
	
	System.out.println("area ="+area);
	System.out.println("parimeter ="+parimeter);
}
}