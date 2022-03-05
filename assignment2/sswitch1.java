
import java.util.Scanner;
class sswitch1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("print the first No.");
		int num = sc.nextInt();
		switch(num)
		{
			case 1 : System.out.println("one statement ");break;
			case 2 : System.out.println(" 2nd statement ");break;
		}
	}
}

import java.util.Scanner;
class sswitch1
{
       public static void main(String args[])
        {
		  Scanner sc =new Scanner(system.in);
		  System.out.println("enter checking name");
		  char name =sc.next().charat(2);
		  
		  switch(name) 
		  {case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
		   System.out.println("vowel in lower case ");
		   break;
		   
		   case 'A':
		   case 'E':
		   case 'I':
		   case 'O':
		   case 'U':
		   System.out.println("vowel in upper case");
		   break;
		   
		   Default:
		   System.out.println("constants ");
		   
		 
		  }
		}

}

