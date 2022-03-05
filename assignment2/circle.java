// write a program to calcuklate area of a circle
import java.util.Scanner;
class circle
{public static void main(String args[])
{	
	final double pi = 3.142;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter radius R");
	double R = sc.nextDouble();
	
	double output = pi * R * R ;
	System.out.println("output ="+output);
}
}