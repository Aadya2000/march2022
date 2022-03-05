import java.util.Scanner ;

class swap
{public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
     System.out.println("enter first value");
	 int num1 = sc.nextInt();
	 
	 System.out.println("enter the second value");
	 int num2 = sc.nextInt();
	 
	
	  System.out.println("before swapping num1="+num1);
	  System.out.println("before swapping num2 ="+num2);
	  
	 int temp;
	 temp=num1;
	 num1=num2;
	 num2=temp;
	 
	 System.out.println("after swapping num1="+num1);
	  System.out.println("after swapping num2 ="+num2);
	 
	 
	 
	 
	 
	 
       	 
	
}
}